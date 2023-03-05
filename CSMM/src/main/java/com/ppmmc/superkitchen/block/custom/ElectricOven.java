package com.ppmmc.superkitchen.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import java.util.Random;

public class ElectricOven extends Block {
    public ElectricOven(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        super.onBlockActivated(state, world, pos, player, handIn, hit);
        if (!world.isRemote) {
            player.setFire(2);
            return ActionResultType.CONSUME;
        }else{
            return ActionResultType.SUCCESS;
        }
    }
}
