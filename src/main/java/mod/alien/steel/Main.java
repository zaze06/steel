package mod.alien.steel;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main {

    public static final String MODID = "steel";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Main() {
        System.out.println("\n\n\n\n\n\n\nMain.java");
        Registration.register();

        Modifier.moddify();
    }
}
