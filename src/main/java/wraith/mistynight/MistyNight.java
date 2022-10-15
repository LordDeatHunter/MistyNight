package wraith.mistynight;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;

public class MistyNight implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger("Misty Night");
    public static final String MOD_ID = "mistynight";

    @Override
    public void onInitialize() {
        LOGGER.info("Is initializing.");

        LOGGER.info("Has successfully been initialized.");
    }

}
