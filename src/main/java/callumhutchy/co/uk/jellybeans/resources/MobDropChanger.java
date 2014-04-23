package callumhutchy.co.uk.jellybeans.resources;

import net.minecraft.entity.passive.EntityCow;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import callumhutchy.co.uk.jellybeans.items.Items;

public class MobDropChanger {
	@ForgeSubscribe
	public void playerKilledCow(LivingDropsEvent event)
	{
		if(event.entityLiving instanceof EntityCow)
		{
			event.entityLiving.dropItem(Items.gelatin.itemID, 1);
		}
	}
}
