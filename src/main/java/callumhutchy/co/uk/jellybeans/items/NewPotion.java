package callumhutchy.co.uk.jellybeans.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class NewPotion {
	private int potionId;
	private int potionId2;
	private int potionDuration;
	private int potionDuration2;
	private int potionAmplifier;
	private int potionAmplifier2;
	private float potionEffectProbability;
	private float potionEffectProbability2;
	
	public NewPotion setPotionEffect2(int par1, int par2, int par3, float par4) {
		this.potionId2 = par1;
        this.potionDuration2 = par2;
        this.potionAmplifier2 = par3;
        this.potionEffectProbability2 = par4;
        return this;
	}
	
	public NewPotion setPotionEffect(int par1, int par2, int par3, float par4) {
		this.potionId = par1;
        this.potionDuration = par2;
        this.potionAmplifier = par3;
        this.potionEffectProbability = par4;
        return this;
	}
	
	protected void func_77849_c(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par2World.isRemote && this.potionId > 0 && par2World.rand.nextFloat() < this.potionEffectProbability)
        {
            par3EntityPlayer.addPotionEffect(new PotionEffect(this.potionId, this.potionDuration * 20, this.potionAmplifier));
            par3EntityPlayer.addPotionEffect(new PotionEffect(this.potionId2, this.potionDuration2 * 20, this.potionAmplifier2));
        }
    }
	
}
