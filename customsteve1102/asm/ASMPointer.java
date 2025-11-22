/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.block.Block
 *  net.minecraft.client.entity.AbstractClientPlayer
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.EntityPlayer
 *  net.minecraft.world.IBlockAccess
 */
package customsteve.asm;

import customsteve.E;
import customsteve.b_0;
import customsteve.p_0;
import net.minecraft.block.Block;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;

public class ASMPointer {
    public static float a() {
        return b_0.b();
    }

    public static float b() {
        return b_0.a();
    }

    public static boolean c(AbstractClientPlayer par1AbstractClientPlayer, double par2, double par4, double par6, float par8, float par9) {
        return p_0.a(par1AbstractClientPlayer, par2, par4, par6, par8, par9);
    }

    public static void d(String shaderName) {
        E.a(shaderName);
    }

    public static boolean e() {
        return p_0.c();
    }

    public static void f(EntityPlayer ep) {
        p_0.a(ep);
    }

    public static boolean g() {
        return p_0.d();
    }

    public static boolean h() {
        return p_0.b();
    }

    public static void i(Entity entity, float par9) {
        p_0.a(entity, par9);
    }

    public static int j(IBlockAccess world, Block block, int x, int y, int z) {
        return p_0.a(world, block, x, y, z);
    }

    public static boolean k() {
        return p_0.a();
    }
}

