package callumhutchy.co.uk.jellybeans.resources;

import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;

public class SampleEventReceiver {


    
    public void eventHandler(RenderGameOverlayEvent event){
    	MinecraftForge.EVENT_BUS.register(new SampleEventReceiver());
    }
    
}
