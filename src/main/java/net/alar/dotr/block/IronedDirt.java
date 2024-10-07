package net.alar.dotr.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class IronedDirt extends Block implements IPlantable {
    public IronedDirt(Properties properties) {
        super(properties);
    }

    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
        return super.canSustainPlant(state, world, pos, facing, plantable);
    }

    @Override
    public PlantType getPlantType(BlockGetter level, BlockPos pos) {
        return IPlantable.super.getPlantType(level, pos);
    }

    @Override
    public BlockState getPlant(BlockGetter level, BlockPos pos) {
        return null;
    }
}
