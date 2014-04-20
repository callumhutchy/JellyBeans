package callumhutchy.co.uk.jellybeans.items.jellybeans;

import cpw.mods.fml.common.network.Player;
import callumhutchy.co.uk.jellybeans.JellyBeans;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class AppleJellyBean extends ItemJellyBean {
	
	public AppleJellyBean(int i, int j, float f, boolean b) {
		super(i, j, f, b);
		this.setTextureName("jellybeans:appleJellyBean");
		this.setUnlocalizedName("appleJellyBean");
	
	}

}
