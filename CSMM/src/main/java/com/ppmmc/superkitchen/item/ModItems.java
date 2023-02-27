package com.ppmmc.superkitchen.item;

import com.ppmmc.superkitchen.SuperKitchen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SuperKitchen.MOD_ID);
    public static final RegistryObject<Item> PAN = ITEMS.register("pan",
            () -> new Item(new Item.Properties().group(ModItemGroup.KITCHEN_GROUP)));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
