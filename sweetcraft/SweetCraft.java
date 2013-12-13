package sweetcraft;

import sweetcraft.block.Blocks;
import sweetcraft.item.Items;
import sweetcraft.network.PacketHandler;
import sweetcraft.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "sweetcraft", name = "Sweet Craft", version = "0.1")
@NetworkMod(channels = {"sweetcraft"}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class SweetCraft {

	
	@SidedProxy(clientSide = "sweetcraft.proxy.ClientProxy", serverSide = "sweetcraft.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance
	public static SweetCraft instance;

	public static CreativeTabs tab;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		Config.init(event.getSuggestedConfigurationFile());
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		tab = new SweetcraftTab("Sweetcraft", Config.sweetJarBlock);
		
		Items.init();
		Blocks.init();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
