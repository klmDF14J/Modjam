package sweetcraft.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import sweetcraft.Config;
import sweetcraft.SweetCraft;
import net.minecraft.block.Block;

public class Blocks {

	public static Block sweetJarBlock;
	
	public static void init() {
		sweetJarBlock = new BlockSweetJar(Config.sweetJarBlock).setCreativeTab(SweetCraft.tab);
		
		GameRegistry.registerBlock(sweetJarBlock, "sweetJarBlock");
		
		LanguageRegistry.instance().addStringLocalization("tile.sweetJar.name", "Sweet Jar");
	}

}
