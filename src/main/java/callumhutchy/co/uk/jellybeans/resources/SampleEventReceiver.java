package callumhutchy.co.uk.jellybeans.resources;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;

public class SampleEventReceiver {


    @ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event){
    	MinecraftForge.EVENT_BUS.register(new SampleEventReceiver());
    }
    
}
