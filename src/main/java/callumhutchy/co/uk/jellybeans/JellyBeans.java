package callumhutchy.co.uk.jellybeans;


import callumhutchy.co.uk.jellybeans.items.JellyBeansItems;
import callumhutchy.co.uk.jellybeans.resources.GuiBuffBar;
import callumhutchy.co.uk.jellybeans.resources.ItemIDs;
import callumhutchy.co.uk.jellybeans.resources.MobDropChanger;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import java.util.logging.Level;

@Mod(modid = JellyBeans.MODID, name = "", version = JellyBeans.VERSION)

public class JellyBeans
{
    public static final String MODID = "jellybeans";
    public static final String VERSION = "1.0";
	
    public static CreativeTabs tabJellyBeans = new CreativeTabs("tabJellyBeans"){
    	
		@Override
		public Item getTabIconItem() {
			// TODO Auto-generated method stub
			return JellyBeansItems.appleJellyBean;
		}
    };
    
    @Instance("JellyBeans")
    public static JellyBeans instance;
    
   
    @SidedProxy(clientSide="callumhutchy.co.uk.jellybeans.ClientProxy", serverSide="callumhutchy.co.uk.jellybeans.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	
    	MinecraftForge.EVENT_BUS.register(new MobDropChanger());
    	
    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    	ItemIDs.init();
    	
    	JellyBeansItems.init();
    	JellyBeansItems.addItemstoGame();
    	JellyBeansItems.addNames();
    	JellyBeansItems.addCraftingRecipes();
    	
    	proxy.registerRenderers();
    	
		
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabJellyBeans","en_US","Jelly Beans");

    	
    	    

    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	MinecraftForge.EVENT_BUS.register(new GuiBuffBar(Minecraft.getMinecraft()));
    	
    	
    }
    
    
    
    
}