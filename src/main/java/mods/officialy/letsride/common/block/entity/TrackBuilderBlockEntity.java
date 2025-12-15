package mods.officialy.letsride.common.block.entity;

import mods.officialy.letsride.init.LRBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.TickingBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class TrackBuilderBlockEntity extends BlockEntity {

    public TrackBuilderBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(LRBlockEntities.TRACK_BUILDER.get(), pPos, pBlockState);
    }


    public void tick(Level pLevel, BlockPos pPos) {

    }
}