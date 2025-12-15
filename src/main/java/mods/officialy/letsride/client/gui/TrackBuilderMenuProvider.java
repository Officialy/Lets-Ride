package mods.officialy.letsride.client.gui;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

public class TrackBuilderMenuProvider implements MenuProvider {
    private final BlockState state;
    private final BlockPos pos;

    public TrackBuilderMenuProvider(BlockState state, BlockPos pos) {
        this.state = state;
        this.pos = pos;
    }

    @Override
    public Component getDisplayName() {
        return Component.translatable("container.track_builder");
    }

    @Nullable
    @Override
    public AbstractContainerMenu createMenu(int windowId, Inventory playerInventory, Player playerEntity) {
        return new TrackBuilderContainer(windowId, playerInventory, new CraftingMenu(windowId, playerInventory), new ContainerData() {
            @Override
            public int get(int index) {
                // Implement custom data sync if needed
                return 0;
            }

            @Override
            public void set(int index, int value) {
                // Implement custom data sync if needed
            }

            @Override
            public int getCount() {
                // Return the number of custom data fields you have
                return 0;
            }
        });
    }
}
