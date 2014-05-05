package callumhutchy.co.uk.jellybeans.items;

import callumhutchy.co.uk.jellybeans.JellyBeans;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

public class Gelatin extends Item {

	public Gelatin() {
		super();
		this.setMaxStackSize(64);
		this.setCreativeTab(JellyBeans.tabJellyBeans);
		this.setUnlocalizedName("gelatin");
		this.setTextureName("jellybeans:gelatin");
	}

	
	
}
