package callumhutchy.co.uk.jellybeans;


import callumhutchy.co.uk.jellybeans.items.Items;
import callumhutchy.co.uk.jellybeans.resources.ItemIDs;
import callumhutchy.co.uk.jellybeans.resources.LogHelper;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

import java.util.logging.Level;
import java.util.logging.Logger;

@Mod(modid = JellyBeans.MODID, version = JellyBeans.VERSION)
public class JellyBeans
{
    public static final String MODID = "jellybeans";
    public static final String VERSION = "1.0";
    public static CreativeTabs tabJellyBeans = new CreativeTabs("tabJellyBeans"){
    	
    };
    
    
    
    @SidedProxy(clientSide="callumhutchy.co.uk.jellybeans.ClientProxy", serverSide="callumhutchy.co.uk.jellybeans.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	LogHelper.init();
    	
    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	LogHelper.log(Level.INFO, "Preparing IDs");
    	ItemIDs.init();
    	LogHelper.log(Level.INFO, "IDs Loaded");
    	LogHelper.log(Level.INFO, "Preparing Items");
    	Items.init();
    	Items.addItemstoGame();
    	Items.addNames();
    	LogHelper.log(Level.INFO, "Items Added");
    	
    	
    	
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabJellyBeans","en_US","Jelly Beans");
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	
    }
    
    
    
    
}