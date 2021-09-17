package sdw.obsidious.mod;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import sdw.obsidious.mod.items.RegisterItems;






public class obsidiousmod implements ModInitializer {
    public static final String MODID = "obsidiousmod";
   // public static final String KEY = MODID + ":portalgun_portals";
    public static final String MOD_NAME = "obsidious_mod";


// New creative tab for mod
public static final ItemGroup MODTAB = FabricItemGroupBuilder.build (new Identifier("obsidiousmod", "mod_tab"), 
() -> new ItemStack(Blocks.OBSIDIAN));




//LOGGER STUFFS

    public static Logger LOGGER = LogManager.getLogger();
    public static void logString(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
    public static void logInt(Level level, int message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
    public static void logDouble(Level level, double message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }
    public static Identifier id(String path) {
        return new Identifier(MODID, path);
    }





    @Override
    public void onInitialize() {
        logString(Level.INFO, "Initializing");
        
        RegisterItems.register();   //See  /mod/items folder for the item registry


    }

}
