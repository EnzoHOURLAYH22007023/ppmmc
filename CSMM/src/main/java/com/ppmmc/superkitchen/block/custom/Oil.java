package com.ppmmc.superkitchen.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class Oil extends FlowingFluidBlock {
    public Oil(Supplier<? extends FlowingFluid> supplier, Properties properties) {
        super(supplier, properties);
    }

}
