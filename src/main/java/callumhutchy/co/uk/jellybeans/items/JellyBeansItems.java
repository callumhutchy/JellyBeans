package callumhutchy.co.uk.jellybeans.items;

import callumhutchy.co.uk.jellybeans.items.jellybeans.AppleJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.BlackJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.BlazeJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.BlueJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.ChocolateJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.CyanJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.GreenJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.ItemJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.LightBlueJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.LimeGreenJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.MelonJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.OrangeJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.PinkJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.PurpleJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.RedJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.WhiteJellyBean;
import callumhutchy.co.uk.jellybeans.items.jellybeans.YellowJellyBean;
import callumhutchy.co.uk.jellybeans.resources.ItemIDs;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class JellyBeansItems {
	//Intialising Items
	public static Item gelatin;
	public static ItemJellyBean appleJellyBean;
	public static ItemJellyBean redJellyBean;
	public static ItemJellyBean blackJellyBean;
	public static ItemJellyBean blueJellyBean;
	public static ItemJellyBean purpleJellyBean;
	public static ItemJellyBean cyanJellyBean;
	public static ItemJellyBean pinkJellyBean;
	public static ItemJellyBean limegreenJellyBean;
	public static ItemJellyBean lightblueJellyBean;
	public static ItemJellyBean orangeJellyBean;
	public static ItemJellyBean whiteJellyBean;
	public static ItemJellyBean greenJellyBean;
	public static ItemJellyBean yellowJellyBean;
	public static ItemJellyBean chocolateJellyBean;
	public static ItemJellyBean melonJellyBean;
	public static ItemJellyBean blazeJellyBean;
	public static Item redFoodColouring;
	
	public static Block testChest;
	
public static void init() {
	//Assigning items to classes
	gelatin = new Gelatin();
	appleJellyBean = new AppleJellyBean(ItemIDs.APPLE_JELLY_BEAN_ID,2,0.5F,false);
	redJellyBean = new RedJellyBean(ItemIDs.RED_JELLY_BEAN_ID,2,0.5F,false);
	blackJellyBean = new BlackJellyBean(ItemIDs.BLACK_JELLY_BEAN_ID,2,0.5F,false);
	blueJellyBean = new BlueJellyBean(ItemIDs.BLUE_JELLY_BEAN_ID,1,0.5F,false);
	purpleJellyBean = new PurpleJellyBean(ItemIDs.PURPLE_JELLY_BEAN_ID,1,0.5F,false);
	cyanJellyBean = new CyanJellyBean(ItemIDs.CYAN_JELLY_BEAN_ID,1,0.5F,false);
	pinkJellyBean = new PinkJellyBean(ItemIDs.PINK_JELLY_BEAN_ID,1,0.5F,false);
	limegreenJellyBean = new LimeGreenJellyBean(ItemIDs.LIMEGREEN_JELLY_BEAN_ID,1,0.5F,false);
	lightblueJellyBean = new LightBlueJellyBean(ItemIDs.LIGHTBLUE_JELLY_BEAN_ID,1,0.5F,false);
	orangeJellyBean = new OrangeJellyBean(ItemIDs.ORANGE_JELLY_BEAN_ID,1,0.5F,false);
	whiteJellyBean = new WhiteJellyBean(ItemIDs.WHITE_JELLY_BEAN_ID,1,0.5F,false);
	greenJellyBean = new GreenJellyBean(ItemIDs.GREEN_JELLY_BEAN_ID,1,0.5F,false);
	yellowJellyBean = new YellowJellyBean(ItemIDs.YELLOW_JELLY_BEAN_ID,1,0.5F,false);
	chocolateJellyBean = new ChocolateJellyBean(ItemIDs.CHOCOLATE_JELLY_BEAN_ID,1,0.5F,false);
	melonJellyBean = new MelonJellyBean(ItemIDs.MELON_JELLY_BEAN_ID,1,0.5F,false);
	blazeJellyBean = new BlazeJellyBean(ItemIDs.BLAZE_JELLY_BEAN_ID,1,0.5F,false);
		
}

public static void addItemstoGame(){
	//Registering Items with the game
		GameRegistry.registerItem(gelatin, gelatin.getUnlocalizedName());
		GameRegistry.registerItem(appleJellyBean, appleJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(redJellyBean, redJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(blackJellyBean, blackJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(blueJellyBean, blueJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(purpleJellyBean, purpleJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(cyanJellyBean, cyanJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(pinkJellyBean, pinkJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(limegreenJellyBean, limegreenJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(lightblueJellyBean, lightblueJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(orangeJellyBean, orangeJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(whiteJellyBean, whiteJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(greenJellyBean, greenJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(yellowJellyBean, yellowJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(chocolateJellyBean, chocolateJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(melonJellyBean, melonJellyBean.getUnlocalizedName());
		GameRegistry.registerItem(blazeJellyBean, blazeJellyBean.getUnlocalizedName());
		
		
}
public static void addNames(){
	//Registering the names of the items
		LanguageRegistry.addName(gelatin, "Gelatin");
		LanguageRegistry.addName(appleJellyBean, "Apple Jelly Bean");
		LanguageRegistry.addName(redJellyBean, "Strawberry Jelly Bean");
		LanguageRegistry.addName(blackJellyBean, "Liqourice Jelly Bean");
		LanguageRegistry.addName(blueJellyBean, "Blueberry Jelly Bean");
		LanguageRegistry.addName(purpleJellyBean, "Grape Jelly Bean");
		LanguageRegistry.addName(cyanJellyBean, "Raspberry Jelly Bean");
		LanguageRegistry.addName(pinkJellyBean, "Candy Floss Jelly Bean");
		LanguageRegistry.addName(limegreenJellyBean, "Lemon & Lime Jelly Bean");
		LanguageRegistry.addName(lightblueJellyBean, "Mint Jelly Bean");
		LanguageRegistry.addName(orangeJellyBean, "Orange Jelly Bean");
		LanguageRegistry.addName(whiteJellyBean, "Milk Jelly Bean");
		LanguageRegistry.addName(greenJellyBean, "Kiwi Jelly Bean");
		LanguageRegistry.addName(yellowJellyBean, "Banana Jelly Bean");
		LanguageRegistry.addName(chocolateJellyBean, "Chocolate Jelly Bean");
		LanguageRegistry.addName(melonJellyBean, "Melon Jelly Bean");
		LanguageRegistry.addName(blazeJellyBean, "Spicy Jelly Bean");
		
		//LanguageRegistry.addName(redFoodColouring, "Red Food Colouring");
		
		
}

public static void addCraftingRecipes(){
	//Add crafting recipes for the jellybeans
	ItemStack apple = new ItemStack(Items.apple);
	ItemStack sugar = new ItemStack(Items.sugar);
	ItemStack waterbottle = new ItemStack(Items.potionitem);
	ItemStack reddye = new ItemStack(Items.dye, 1, 1);
	ItemStack blackdye = new ItemStack(Items.dye, 1, 0);
	ItemStack bluedye = new ItemStack(Items.dye, 1,4);
	ItemStack purpledye = new ItemStack(Items.dye, 1, 5);
	ItemStack cyandye = new ItemStack(Items.dye, 1, 6);
	ItemStack pinkdye = new ItemStack(Items.dye, 1, 9);
	ItemStack limedye = new ItemStack(Items.dye,1 , 10);
	ItemStack lightbluedye = new ItemStack(Items.dye, 1, 12);
	ItemStack orangedye = new ItemStack(Items.dye, 1, 14);
	ItemStack whitedye = new ItemStack(Items.dye,1,15);
	ItemStack greendye = new ItemStack(Items.dye,1, 2);
	ItemStack yellowdye = new ItemStack(Items.dye,1,11);
	ItemStack chocolate = new ItemStack(Items.dye,1, 3);
	ItemStack melon = new ItemStack(Items.melon);
	ItemStack blazepowder = new ItemStack(Items.blaze_powder);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.appleJellyBean,4), gelatin,apple,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.redJellyBean, 4), gelatin,reddye,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.blackJellyBean, 4), gelatin,blackdye,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.blueJellyBean, 4), gelatin,bluedye,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.purpleJellyBean, 4), gelatin,purpledye,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.cyanJellyBean, 4), gelatin,cyandye,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.pinkJellyBean, 4), gelatin,pinkdye,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.limegreenJellyBean, 4), gelatin,limedye,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.lightblueJellyBean, 4), gelatin,lightbluedye,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.orangeJellyBean, 4), gelatin,orangedye,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.whiteJellyBean, 4), gelatin,whitedye,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.greenJellyBean, 4), gelatin,greendye,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.yellowJellyBean, 4), gelatin,yellowdye,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.chocolateJellyBean, 4), gelatin,chocolate,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.melonJellyBean, 4), gelatin,melon,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(JellyBeansItems.blazeJellyBean, 4), gelatin,blazepowder,sugar,waterbottle);
	
	
	

}

}
