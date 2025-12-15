package mods.officialy.letsride;

import com.mojang.logging.LogUtils;
import mods.officialy.letsride.init.LRBlocks;
import mods.officialy.letsride.init.LRItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LetsRide.MODID)
public class LetsRide {

    public static final String MODID = "letsride";
    public static final Logger LOGGER = LogUtils.getLogger();

    public LetsRide(IEventBus modEventBus) {
        NeoForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::commonSetup);

        LRBlocks.BLOCKS.register(modEventBus);
        LRBlocks.ITEMS.register(modEventBus);

        LRItems.ITEMS.register(modEventBus);
        // Register the items to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    /**
     * Add items to the creative tab
     * Use the item register, not the block register to prevent null {@link net.minecraft.world.item.BlockItem}s
     */
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            for (var block : LRBlocks.ITEMS.getEntries()) {
                event.accept(block.get());
            }
        }

    }
}
