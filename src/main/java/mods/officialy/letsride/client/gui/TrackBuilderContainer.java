package mods.officialy.letsride.client.gui;

import mods.officialy.letsride.LetsRide;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nullable;

public class TrackBuilderContainer extends AbstractContainerMenu {
    private final CraftingMenu craftMatrix;
    private final ContainerData containerData;

    public TrackBuilderContainer(int windowId, Inventory playerInventory, CraftingMenu craftMatrix, ContainerData containerData) {
        super(LetsRide.TRACK_BUILDER_CONTAINER.get(), windowId);
        this.craftMatrix = craftMatrix;
        this.containerData = containerData;
    }

    @Override
    public boolean stillValid(Player playerIn) {
        // Return true if the player can access the container
        return true;
    }

    @Nullable
    @Override
    public ItemStack quickMoveStack(Player playerIn, int index) {
        // Implement logic to handle shift-clicking items in and out of the container
        return ItemStack.EMPTY;
    }
}
