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
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class Items {
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
	gelatin = new Gelatin(1000);
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
	
	redFoodColouring = new RedFoodColouring(ItemIDs.RED_FOOD_COLOURING_ID);
	
	testChest = new TestChest(2000);
		
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
		
		//GameRegistry.registerItem(redFoodColouring, redFoodColouring.getUnlocalizedName());
		
		GameRegistry.registerBlock(testChest, testChest.getUnlocalizedName());
		
		GameRegistry.registerTileEntity(TileEntityChest.class, "containerChest");
		
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
		
		LanguageRegistry.addName(testChest, "Test Chest");
}

public static void addCraftingRecipes(){
	//Add crafting recipes for the jellybeans
	ItemStack apple = new ItemStack(Item.appleRed);
	ItemStack sugar = new ItemStack(Item.sugar);
	ItemStack waterbottle = new ItemStack(Item.potion);
	ItemStack reddye = new ItemStack(Item.dyePowder, 1, 1);
	GameRegistry.addShapelessRecipe(new ItemStack(Items.appleJellyBean,4), gelatin,apple,sugar,waterbottle);
	GameRegistry.addShapelessRecipe(new ItemStack(Items.redJellyBean, 4), gelatin,reddye,sugar,waterbottle);
}

}
