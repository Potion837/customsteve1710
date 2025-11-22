/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cpw.mods.fml.common.eventhandler.SubscribeEvent
 *  net.minecraft.client.Minecraft
 *  net.minecraft.client.gui.FontRenderer
 *  net.minecraft.client.gui.Gui
 *  net.minecraft.client.gui.GuiIngame
 *  net.minecraft.client.gui.ScaledResolution
 *  net.minecraft.util.ResourceLocation
 *  net.minecraftforge.client.GuiIngameForge
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType
 *  net.minecraftforge.client.event.RenderGameOverlayEvent$Pre
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL14
 */
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.GuiIngameForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;

public class GuiEvent {
    private static float writer$;
    private static float accepts$;

    @SubscribeEvent
    public void _shadows(RenderGameOverlayEvent.Pre event) {
        Minecraft mc = Minecraft.func_71410_x();
        if (event.type == RenderGameOverlayEvent.ElementType.CROSSHAIRS) {
            float tick = event.partialTicks;
            ScaledResolution sRes = new ScaledResolution(mc, mc.field_71443_c, mc.field_71440_d);
            GuiIngame gig = mc.field_71456_v;
            CSplayer csp = CSmanager.cellular$.trucks$;
            if (mc.field_71474_y.field_74320_O == 1 && csp != null && csp.a != null && csp.a.suffered$ != null && CrosshairsHelper.policies$ != null && CrosshairsHelper.pressed$) {
                GL11.glEnable((int)3042);
                this._robots(Gui.field_110324_m);
                if (CrosshairsHelper.pressed$) {
                    GL14.glBlendColor((float)0.2f, (float)0.2f, (float)1.0f, (float)1.0f);
                } else {
                    GL11.glColor4f((float)1.0f, (float)0.2f, (float)0.2f, (float)1.0f);
                    GL14.glBlendColor((float)1.0f, (float)0.2f, (float)0.2f, (float)1.0f);
                }
                if (CrosshairsHelper.chrysler$) {
                    if (CrosshairsHelper.brass$) {
                        GL14.glBlendColor((float)1.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                    } else {
                        GL14.glBlendColor((float)0.0f, (float)1.0f, (float)0.0f, (float)1.0f);
                    }
                }
                GL11.glBlendFunc((int)775, (int)32769);
                float diffX = (CrosshairsHelper.policies$.x - writer$) * tick;
                float diffY = (CrosshairsHelper.policies$.y - accepts$) * tick;
                gig.func_73729_b((int)((writer$ + diffX) / (float)sRes.func_78325_e() - 7.0f), (int)((accepts$ + diffY) / (float)sRes.func_78325_e() - 7.0f), 0, 0, 16, 16);
                writer$ += diffX;
                accepts$ += diffY;
                GL14.glBlendColor((float)0.0f, (float)0.0f, (float)0.0f, (float)1.0f);
                GL11.glDisable((int)3042);
                event.setCanceled(true);
            }
        }
        if (event.type == RenderGameOverlayEvent.ElementType.TEXT && CSmanager.cellular$.trucks$ != null && !CSmanager.cellular$.trucks$.a.bringing$ && Config.crucial$) {
            int width = event.resolution.func_78326_a();
            int height = event.resolution.func_78328_b();
            FontRenderer fontRenderer = mc.field_71466_p;
            fontRenderer.func_78261_a("nowBuffer " + CSmanager.cellular$.trucks$.wildlife$, width / 2 + 110, height - GuiIngameForge.left_height + 20, 0xFF0000);
            fontRenderer.func_78261_a("currentUp[0] " + CSmanager.cellular$.trucks$.prophet$[0], width / 2 + 110, height - GuiIngameForge.left_height - 40, 0xFF0000);
            fontRenderer.func_78261_a("currentUp[1] " + CSmanager.cellular$.trucks$.prophet$[1], width / 2 + 110, height - GuiIngameForge.left_height - 30, 0xFF0000);
            fontRenderer.func_78261_a("currentUp[2] " + CSmanager.cellular$.trucks$.prophet$[2], width / 2 + 110, height - GuiIngameForge.left_height - 20, 0xFF0000);
            fontRenderer.func_78261_a("currentFr[0] " + CSmanager.cellular$.trucks$.pizza$[0], width / 2 + 110, height - GuiIngameForge.left_height - 10, 0xFF0000);
            fontRenderer.func_78261_a("currentFr[1] " + CSmanager.cellular$.trucks$.pizza$[1], width / 2 + 110, height - GuiIngameForge.left_height - 0, 0xFF0000);
            fontRenderer.func_78261_a("currentFr[2] " + CSmanager.cellular$.trucks$.pizza$[2], width / 2 + 110, height - GuiIngameForge.left_height + 10, 0xFF0000);
            fontRenderer.func_78261_a("nowLBP " + CSmanager.cellular$.trucks$.a(), width / 2 + 110, height - GuiIngameForge.left_height - 60, 0xFF0000);
            if (CSmanager.cellular$.trucks$.a.a.suffered$ != null) {
                fontRenderer.func_78261_a("nowCam[0] " + CSmanager.cellular$.trucks$.a.a.suffered$.safely$[0], width / 2, height - GuiIngameForge.left_height - 90, 0xFF0000);
                fontRenderer.func_78261_a("nowCam[1] " + CSmanager.cellular$.trucks$.a.a.suffered$.safely$[1], width / 2, height - GuiIngameForge.left_height - 80, 0xFF0000);
                fontRenderer.func_78261_a("nowCam[2] " + CSmanager.cellular$.trucks$.a.a.suffered$.safely$[2], width / 2, height - GuiIngameForge.left_height - 70, 0xFF0000);
            }
            fontRenderer.func_78261_a("hitFsec " + Config.missing$, width / 2 + 110, height - GuiIngameForge.left_height - 50, 0xFF0000);
        }
    }

    private void _robots(ResourceLocation res) {
        Minecraft.func_71410_x().func_110434_K().func_110577_a(res);
    }
}

