package au.com.spilledbread.LearningMod;

import au.com.spilledbread.LearningMod.proxy.CommonProxy;
import au.com.spilledbread.LearningMod.tab.CreativeTabLearning;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = LearningMod.MODID, name = LearningMod.NAME, version = LearningMod.VERSION)
public class LearningMod
{
    public static final String MODID = "learningmod";
    public static final String NAME = "Learning Mod";
    public static final String VERSION = "1.0";


    @SidedProxy(clientSide = "au.com.spilledbread.LearningMod.proxy.ClientProxy", serverSide = "au.com.spilledbread.LearningMod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static LearningMod instance;

    public static CreativeTabLearning tabLearning;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        tabLearning = new CreativeTabLearning(CreativeTabs.getNextID(), "tab_tutorial");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);

    }

}
