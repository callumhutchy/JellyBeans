package callumhutchy.co.uk.jellybeans.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlazeJellyBean extends ItemJellyBean {

	public BlazeJellyBean(int i, int j, float f, boolean b) {
		super(i, j, f, b);
		this.setTextureName("jellybeans:blazeJellyBean");
		this.setUnlocalizedName("blazeJellyBean");
		this.setPotionEffect(Potion.fireResistance.id, 20, 1, 1.0F);
	}

	protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par2World.isRemote)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 500, 0));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.id, 200, 0));
            par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 400,0));
        }

    }
	
}
