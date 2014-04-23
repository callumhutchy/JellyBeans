package callumhutchy.co.uk.jellybeans.items;

import callumhutchy.co.uk.jellybeans.JellyBeans;
import net.minecraft.item.Item;

public class RedFoodColouring extends Item {

	public RedFoodColouring(int i) {
		super(i);
		this.setMaxStackSize(64);
		this.setCreativeTab(JellyBeans.tabJellyBeans);
		this.setUnlocalizedName("redFoodColouring");
		this.setTextureName("jellybeans:redFoodColouring");
	}

}
