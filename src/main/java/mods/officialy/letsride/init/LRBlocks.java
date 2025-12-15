package mods.officialy.letsride.init;

import mods.officialy.letsride.LetsRide;
import mods.officialy.letsride.common.block.TrackBuilderBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class LRBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(LetsRide.MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LetsRide.MODID);

    public static final DeferredBlock<TrackBuilderBlock> TRACK_BUILDER = register("track_builder", () -> new TrackBuilderBlock(BlockBehaviour.Properties.of()));

    public static <T extends Block> DeferredBlock<T> register(String name, Supplier<T> block) {
        DeferredBlock<T> object = BLOCKS.register(name, block);
        ITEMS.register(name, () -> new BlockItem(object.get(), new Item.Properties()));
        return object;
    }
}