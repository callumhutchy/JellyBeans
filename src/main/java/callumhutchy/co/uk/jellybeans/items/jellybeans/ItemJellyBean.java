package callumhutchy.co.uk.jellybeans.items.jellybeans;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.DungeonHooks;
import callumhutchy.co.uk.jellybeans.JellyBeans;

public class ItemJellyBean extends ItemFood {
	
	public ItemJellyBean(int i, int j, float f, boolean b) {
		super(i, j,f, b);
		this.setMaxStackSize(64);
		this.setCreativeTab(JellyBeans.tabJellyBeans);
		this.setAlwaysEdible();
		
	}
	
	protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par2World.isRemote)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 500, 0));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 200, 0));
        }

    }
		
}
