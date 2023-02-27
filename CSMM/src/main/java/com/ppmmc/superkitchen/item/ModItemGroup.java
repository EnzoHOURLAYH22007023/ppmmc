package com.ppmmc.superkitchen.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup KITCHEN_GROUP = new ItemGroup("kitchenModTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.PAN.get());
        }
    };
}
