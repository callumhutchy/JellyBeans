package callumhutchy.co.uk.jellybeans.resources;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.entity.passive.EntityCow;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import callumhutchy.co.uk.jellybeans.items.JellyBeansItems;

public class MobDropChanger {
	@SubscribeEvent
	public void playerKilledCow(LivingDropsEvent event)
	{
		if(event.entityLiving instanceof EntityCow)
		{
			event.entityLiving.dropItem(JellyBeansItems.gelatin, 1);
		}
	}
}
