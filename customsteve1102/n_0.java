/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.EntityLivingBase
 *  net.minecraft.inventory.EntityEquipmentSlot
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.EnumHandSide
 *  net.minecraft.world.World
 */
package customsteve;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;
import net.minecraft.world.World;

/*
 * Renamed from customsteve.n
 */
public class n_0
extends EntityLivingBase {
    public n_0(World worldIn) {
        super(worldIn);
    }

    public Iterable<ItemStack> getArmorInventoryList() {
        return null;
    }

    public ItemStack getItemStackFromSlot(EntityEquipmentSlot slotIn) {
        return null;
    }

    public void setItemStackToSlot(EntityEquipmentSlot slotIn, ItemStack stack) {
    }

    public EnumHandSide getPrimaryHand() {
        return null;
    }
}

