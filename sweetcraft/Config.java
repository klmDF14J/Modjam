package sweetcraft;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class Config {

	public static Configuration config;

	public static int sweetJarBlock;
	
	public static void init(File suggestedConfigurationFile) {
		config = new Configuration(suggestedConfigurationFile);
		
		config.load();

		sweetJarBlock = getBlock("Sweet Jar", 3000);
		
		config.save();
	}
	
	
	public static int getItem(String name, int id) {
		return config.getItem(name, id).getInt() - 256;
	}
	
	public static int getBlock(String name, int id) {
		return config.getBlock(name, id).getInt();
	}

}

