package sweetcraft;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SweetcraftTab extends CreativeTabs
{
    private String name;
    private int index;

    public SweetcraftTab(String s, int id)
    {
        super(getNextID(), s);
        name = s;
        index = id;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return index;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public String getTranslatedTabLabel()
    {
        return name;
    }
}
