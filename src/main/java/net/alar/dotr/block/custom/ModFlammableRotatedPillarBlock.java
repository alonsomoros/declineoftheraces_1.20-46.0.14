package net.alar.dotr.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import javax.annotation.Nullable;
import java.util.Optional;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatedPillarBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 20;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Nullable
    @Override
    public BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        ItemStack itemStack = context.getItemInHand();
        if (!itemStack.canPerformAction(toolAction))
            return null;

        if (ToolActions.AXE_STRIP == toolAction)
        {
            return AxeItem.getAxeStrippingState(state);
        } else if (ToolActions.AXE_SCRAPE == toolAction)
        {
            return WeatheringCopper.getPrevious(state).orElse(null);
        } else if (ToolActions.AXE_WAX_OFF == toolAction)
        {
            return Optional.ofNullable(HoneycombItem.WAX_OFF_BY_BLOCK.get().get(state.getBlock())).map(block -> block.withPropertiesOf(state)).orElse(null);
        } else if (ToolActions.SHOVEL_FLATTEN == toolAction)
        {
            return ShovelItem.getShovelPathingState(state);
        } else if (ToolActions.HOE_TILL == toolAction)
        {
            // Logic copied from HoeItem#TILLABLES; needs to be kept in sync during updating
            Block block = state.getBlock();
            if (block == Blocks.ROOTED_DIRT)
            {
                if (!simulate && !context.getLevel().isClientSide)
                {
                    Block.popResourceFromFace(context.getLevel(), context.getClickedPos(), context.getClickedFace(), new ItemStack(Items.HANGING_ROOTS));
                }
                return Blocks.DIRT.defaultBlockState();
            } else if ((block == Blocks.GRASS_BLOCK || block == Blocks.DIRT_PATH || block == Blocks.DIRT || block == Blocks.COARSE_DIRT) &&
                    context.getLevel().getBlockState(context.getClickedPos().above()).isAir())
            {
                return block == Blocks.COARSE_DIRT ? Blocks.DIRT.defaultBlockState() : Blocks.FARMLAND.defaultBlockState();
            }
        }

        return null;
    }

}
