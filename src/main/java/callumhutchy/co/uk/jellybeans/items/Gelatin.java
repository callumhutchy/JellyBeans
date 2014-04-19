package callumhutchy.co.uk.jellybeans.items;

import callumhutchy.co.uk.jellybeans.JellyBeans;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Gelatin extends Item {

	public Gelatin(int id) {
		super(id);
		this.setMaxStackSize(64);
		this.setCreativeTab(JellyBeans.tabJellyBeans);
		this.setUnlocalizedName("gelatin");
	}

}
