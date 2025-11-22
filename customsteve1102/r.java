/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.state.IBlockState
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiIngame
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.client.renderer.GlStateManager
 *  net.minecraft.client.renderer.GlStateManager$DestFactor
 *  net.minecraft.client.renderer.GlStateManager$SourceFactor
 *  net.minecraft.inventory.IInventory
 *  net.minecraft.util.ResourceLocation
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.RayTraceResult
 *  net.minecraft.util.math.RayTraceResult$Type
 *  net.minecraftforge.client.GuiIngameForge
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Pre
 *  net.minecraftforge.fml.common.eventhandler.SubscribeEvent
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL14
 */
package customsteve;

import customsteve.T;
import customsteve.a_0;
import customsteve.ac;
import customsteve.b_0;
import customsteve.bc;
import customsteve.k;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraftforge.client.GuiIngameForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

public class r {
    private static float a;
    private static float b;

    @SubscribeEvent
    public void a(RenderGameOverlayEvent.Pre event) {
        Minecraft mc = Minecraft.getMinecraft();
        if (event.getType() == RenderGameOverlayEvent.ElementType.CROSSHAIRS) {
            float f2;
            float tick = event.getPartialTicks();
            ScaledResolution sRes = new ScaledResolution(mc);
            GuiIngame gig = mc.ingameGUI;
            k csp = a_0.instance.a;
            this.a(Gui.ICONS);
            if (mc.playerController.isSpectator() && mc.pointedEntity == null) {
                RayTraceResult raytraceresult = mc.objectMouseOver;
                if (raytraceresult == null || raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK) {
                    return;
                }
                BlockPos blockpos = raytraceresult.getBlockPos();
                IBlockState state = mc.world.func_180495_p(blockpos);
                if (!(mc.world.func_175625_s(blockpos) instanceof IInventory)) {
                    return;
                }
            }
            int l2 = sRes.getScaledWidth();
            int i1 = sRes.getScaledHeight();
            GlStateManager.tryBlendFuncSeparate((GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE_MINUS_DST_COLOR, (GlStateManager.DestFactor)GlStateManager.DestFactor.ONE_MINUS_SRC_COLOR, (GlStateManager.SourceFactor)GlStateManager.SourceFactor.ONE, (GlStateManager.DestFactor)GlStateManager.DestFactor.ZERO);
            GlStateManager.enableAlpha();
            if (mc.gameSettings.attackIndicator == 1 && mc.gameSettings.thirdPersonView == 1 && (f2 = mc.player.func_184825_o(0.0f)) < 1.0f) {
                int i2 = i1 / 2 - 7 + 16;
                int j2 = l2 / 2 - 7;
                int k2 = (int)(f2 * 17.0f);
                gig.func_73729_b(j2, i2, 36, 94, 16, 4);
                gig.func_73729_b(j2, i2, 52, 94, k2, 4);
            }
            if (mc.gameSettings.thirdPersonView == 1 && csp != null && csp.a != null && ((ac)((Object)csp.a)).j != null) {
                if (T.a != null && T.a) {
                    GL11.glEnable((int)3042);
                    this.a(Gui.ICONS);
                    if (!T.a) {
                        GL11.glColor4f((float)1.0f, (float)0.2f, (float)0.2f, (float)1.0f);
                        GL14.glBlendColor((float)1.0f, (float)0.2f, (float)0.2f, (float)1.0f);
                    }
                    if (T.b) {
                        if (T.c) {
                            GL11.glColor4f((float)1.0f, (float)0.2f, (float)0.2f, (float)1.0f);
                        } else {
                            GL11.glColor4f((float)0.2f, (float)1.0f, (float)0.2f, (float)1.0f);
                        }
                    }
                    float diffX = (T.a.x - a) * tick;
                    float diffY = (T.a.y - b) * tick;
                    gig.func_73729_b((int)((a + diffX) / (float)sRes.getScaleFactor() - 7.0f), (int)((b + diffY) / (float)sRes.getScaleFactor() - 7.0f), 0, 0, 16, 16);
                    a += diffX;
                    b += diffY;
                    GL11.glDisable((int)3042);
                    GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                    GL14.glBlendColor((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
                } else {
                    this.a(Gui.ICONS);
                    GL11.glEnable((int)3042);
                    float diffX = ((float)(sRes.getScaledWidth() * sRes.getScaleFactor() / 2) - a) * tick;
                    float diffY = ((float)(sRes.getScaledHeight() * sRes.getScaleFactor() / 2) - b) * tick;
                    gig.func_73729_b((int)((a + diffX) / (float)sRes.getScaleFactor() - 7.0f), (int)((b + diffY) / (float)sRes.getScaleFactor() - 7.0f), 0, 0, 16, 16);
                    a += diffX;
                    b += diffY;
                    GL11.glDisable((int)3042);
                }
                event.setCanceled(true);
            }
        }
        if (event.getType() == RenderGameOverlayEvent.ElementType.TEXT && b_0.b) {
            int width = event.getResolution().getScaledWidth();
            int sRes = event.getResolution().getScaledHeight();
        }
        if (event.getType() == RenderGameOverlayEvent.ElementType.TEXT && a_0.instance.a != null && !((bc.a)((Object)a_0.instance.a.a)).f && b_0.b) {
            int width = event.getResolution().getScaledWidth();
            int height = event.getResolution().getScaledHeight();
            FontRenderer fontRenderer = mc.fontRenderer;
            fontRenderer.drawStringWithShadow("nowBuffer " + a_0.instance.a.g, (float)(width / 2 + 110), (float)(height - GuiIngameForge.left_height + 20), 0xFF0000);
            fontRenderer.drawStringWithShadow("currentUp[0] " + a_0.instance.a.b[0], (float)(width / 2 + 110), (float)(height - GuiIngameForge.left_height - 40), 0xFF0000);
            fontRenderer.drawStringWithShadow("currentUp[1] " + a_0.instance.a.b[1], (float)(width / 2 + 110), (float)(height - GuiIngameForge.left_height - 30), 0xFF0000);
            fontRenderer.drawStringWithShadow("currentUp[2] " + a_0.instance.a.b[2], (float)(width / 2 + 110), (float)(height - GuiIngameForge.left_height - 20), 0xFF0000);
            fontRenderer.drawStringWithShadow("currentFr[0] " + a_0.instance.a.a[0], (float)(width / 2 + 110), (float)(height - GuiIngameForge.left_height - 10), 0xFF0000);
            fontRenderer.drawStringWithShadow("currentFr[1] " + a_0.instance.a.a[1], (float)(width / 2 + 110), (float)(height - GuiIngameForge.left_height - 0), 0xFF0000);
            fontRenderer.drawStringWithShadow("currentFr[2] " + a_0.instance.a.a[2], (float)(width / 2 + 110), (float)(height - GuiIngameForge.left_height + 10), 0xFF0000);
            fontRenderer.drawStringWithShadow("nowLBP " + a_0.instance.a.b(), (float)(width / 2 + 110), (float)(height - GuiIngameForge.left_height - 60), 0xFF0000);
            if (((ac)((Object)((k)((Object)a_0.instance.a.a)).a)).j != null) {
                fontRenderer.drawStringWithShadow("nowCam[0] " + ((ac)((Object)((k)((Object)a_0.instance.a.a)).a)).j.a[0], (float)(width / 2), (float)(height - GuiIngameForge.left_height - 90), 0xFF0000);
                fontRenderer.drawStringWithShadow("nowCam[1] " + ((ac)((Object)((k)((Object)a_0.instance.a.a)).a)).j.a[1], (float)(width / 2), (float)(height - GuiIngameForge.left_height - 80), 0xFF0000);
                fontRenderer.drawStringWithShadow("nowCam[2] " + ((ac)((Object)((k)((Object)a_0.instance.a.a)).a)).j.a[2], (float)(width / 2), (float)(height - GuiIngameForge.left_height - 70), 0xFF0000);
            }
            fontRenderer.drawStringWithShadow("hitFsec " + b_0.h, (float)(width / 2 + 110), (float)(height - GuiIngameForge.left_height - 50), 0xFF0000);
        }
    }

    private void a(ResourceLocation res) {
        Minecraft.getMinecraft().getTextureManager().bindTexture(res);
    }
}

