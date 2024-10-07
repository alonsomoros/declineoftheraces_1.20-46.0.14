package net.alar.dotr.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SpreadingSnowyDirtBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class IronedDirt extends SpreadingSnowyDirtBlock implements IPlantable {
    public IronedDirt(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    public void randomTick(BlockState state, ServerLevel world, BlockPos pos, RandomSource random) {
        if (!canBeGrass(state, world, pos)) {
            if (!world.isAreaLoaded(pos, 1)) return; // Prevent loading unloaded chunks
            world.setBlockAndUpdate(pos, Blocks.DIRT.defaultBlockState());
        } else {
            if (!world.isAreaLoaded(pos, 3)) return; // Prevent loading unloaded chunks
            if (world.getMaxLocalRawBrightness(pos.above()) >= 9) {
                BlockState blockstate = this.defaultBlockState();

                for (int i = 0; i < 4; ++i) {
                    BlockPos blockpos = pos.offset(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
                    if (world.getBlockState(blockpos).is(Blocks.DIRT) && canPropagate(blockstate, world, blockpos)) {
                        world.setBlockAndUpdate(blockpos, blockstate.setValue(SNOWY, Boolean.valueOf(world.getBlockState(blockpos.above()).is(Blocks.SNOW))));
                    }
                }
            }
        }
    }

    private boolean canBeGrass(BlockState state, ServerLevel world, BlockPos pos) {
        try {
            java.lang.reflect.Method method = SpreadingSnowyDirtBlock.class.getDeclaredMethod("canBeGrass", BlockState.class, LevelReader.class, BlockPos.class);
            method.setAccessible(true);
            return (boolean) method.invoke(null, state, world, pos);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    private boolean canPropagate(BlockState state, ServerLevel world, BlockPos pos) {
        try {
            java.lang.reflect.Method method = SpreadingSnowyDirtBlock.class.getDeclaredMethod("canPropagate", BlockState.class, LevelReader.class, BlockPos.class);
            method.setAccessible(true);
            return (boolean) method.invoke(null, state, world, pos);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public PlantType getPlantType(BlockGetter level, BlockPos pos) {
        return IPlantable.super.getPlantType(level, pos);
    }

    @Override
    public BlockState getPlant(BlockGetter blockGetter, BlockPos blockPos) {
        return this.defaultBlockState();
    }
}