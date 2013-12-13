package sweetcraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockSweetJar extends Block {

	public BlockSweetJar(int par1) {
		super(par1, Material.rock);
		setUnlocalizedName("sweetJar");
		setBlockBounds(0.2F, 0, 0.2F, 0.8F, 0.8F, 0.8F);
	}
	
	
	@SideOnly(Side.CLIENT)
	private static Icon top;
	@SideOnly(Side.CLIENT)
	private static Icon side;
	@SideOnly(Side.CLIENT)
	private static Icon bottom;
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon) {
		top = icon.registerIcon("sweetcraft:sweetJar_top");
		side = icon.registerIcon("sweetcraft:sweetJar_side");
		bottom = icon.registerIcon("sweetcraft:sweetJar_bottom");
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int blockSide, int meta) {
		if(blockSide == 0) {
			return bottom;
		}
		else if(blockSide == 1) {
			return top;
		}
		else {
			return side;
		}
	}
	
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
}
