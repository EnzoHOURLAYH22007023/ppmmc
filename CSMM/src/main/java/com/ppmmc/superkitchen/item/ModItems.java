package com.ppmmc.superkitchen.item;

import com.ppmmc.superkitchen.SuperKitchen;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * classe de tous les items du mod
 */
public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SuperKitchen.MOD_ID);

    // Minerais
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.KITCHEN_GROUP))
    );

    // Outils
    public static final RegistryObject<Item> PAN = ITEMS.register("pan",
            () -> new Item(new Item.Properties().group(ModItemGroup.KITCHEN_GROUP))
    );

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
