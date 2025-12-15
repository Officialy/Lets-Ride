package mods.officialy.letsride.init;

import mods.officialy.letsride.LetsRide;
import mods.officialy.letsride.common.block.entity.TrackBuilderBlockEntity;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class LRBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, LetsRide.MODID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<TrackBuilderBlockEntity>> TRACK_BUILDER = register("track_builder", () -> BlockEntityType.Builder.of(TrackBuilderBlockEntity::new, LRBlocks.TRACK_BUILDER.get()).build(null));

    public static <T extends BlockEntityType<?>> DeferredHolder<BlockEntityType<?>, T> register(String name, Supplier<T> blockEntity) {
        return BLOCK_ENTITIES.register(name, blockEntity);
    }
}
