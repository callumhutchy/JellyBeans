package callumhutchy.co.uk.jellybeans;


import callumhutchy.co.uk.jellybeans.items.Gelatin;
import callumhutchy.co.uk.jellybeans.items.GuiHandler;
import callumhutchy.co.uk.jellybeans.items.Items;
import callumhutchy.co.uk.jellybeans.resources.GuiBuffBar;
import callumhutchy.co.uk.jellybeans.resources.ItemIDs;
import callumhutchy.co.uk.jellybeans.resources.LogHelper;
import callumhutchy.co.uk.jellybeans.resources.MobDropChanger;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import java.util.logging.Level;
import java.util.logging.Logger;

@Mod(modid = JellyBeans.MODID, name = "", version = JellyBeans.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired = true)
public class JellyBeans
{
    public static final String MODID = "jellybeans";
    public static final String VERSION = "1.0";
	
    public static CreativeTabs tabJellyBeans = new CreativeTabs("tabJellyBeans"){
    	public ItemStack getIconItemStack() {
            return new ItemStack(Items.appleJellyBean, 1, 0);
    }
    };
    
    @Instance("JellyBeans")
    public static JellyBeans instance;
    
   
    @SidedProxy(clientSide="callumhutchy.co.uk.jellybeans.ClientProxy", serverSide="callumhutchy.co.uk.jellybeans.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
    	LogHelper.init();
    	MinecraftForge.EVENT_BUS.register(new MobDropChanger());
    	
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
    	Items.addCraftingRecipes();
    	LogHelper.log(Level.INFO, "Items Added");
    	
    	proxy.registerRenderers();
    	
		
    	LanguageRegistry.instance().addStringLocalization("itemGroup.tabJellyBeans","en_US","Jelly Beans");

    	NetworkRegistry.instance().registerGuiHandler(instance, new GuiHandler());
    	    

    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    	MinecraftForge.EVENT_BUS.register(new GuiBuffBar(Minecraft.getMinecraft()));
    	
    	
    }
    
    
    
    
}