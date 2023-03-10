package com.ppmmc.superkitchen.block;

import com.ppmmc.superkitchen.SuperKitchen;
import com.ppmmc.superkitchen.block.custom.ElectricOven;
import com.ppmmc.superkitchen.block.custom.Oil;
import com.ppmmc.superkitchen.item.ModItemGroup;
import com.ppmmc.superkitchen.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.WaterFluid;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, SuperKitchen.MOD_ID);

    public static final RegistryObject<Block> BAUXITE_ORE = registerBlock("aluminum_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance(5f)));

    public static final RegistryObject<Block> OVEN = registerBlock("electric_oven",
            () -> new ElectricOven(AbstractBlock.Properties.create(Material.IRON)
                    .harvestTool(ToolType.PICKAXE)
                    .hardnessAndResistance((5f))));

    public static final RegistryObject<Block> OIL = registerBlock("oil",
            () -> new Oil(() -> new WaterFluid.Flowing(),AbstractBlock.Properties.create(Material.WATER)
                    .jumpFactor(1f)));


    private static  <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name,RegistryObject<T> block){
        ModItems.ITEMS.register(name,() -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.KITCHEN_GROUP)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
