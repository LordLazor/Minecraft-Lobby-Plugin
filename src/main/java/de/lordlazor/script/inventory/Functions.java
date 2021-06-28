package de.lordlazor.script.inventory;

import de.lordlazor.script.Script;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Functions {

    public static void befuellen(){

        //Navigator

        ItemStack Bed = new ItemStack(Material.RED_BED);
        ItemMeta BedMeta = Bed.getItemMeta();
        BedMeta.setDisplayName("§cBedwars");
        Bed.setItemMeta(BedMeta);

        Script.ClockInventory.setItem(11, Bed);

        ItemStack Magmacream = new ItemStack(Material.MAGMA_CREAM);
        ItemMeta MagmacreamMeta = Magmacream.getItemMeta();
        MagmacreamMeta.setDisplayName("§eSpawn");
        Magmacream.setItemMeta(MagmacreamMeta);

        Script.ClockInventory.setItem(13, Magmacream);

        ItemStack Stick = new ItemStack(Material.STICK);
        ItemMeta StickMeta = Stick.getItemMeta();
        StickMeta.setDisplayName("§9SkyPvP");
        Stick.setItemMeta(StickMeta);

        Script.ClockInventory.setItem(15, Stick);

        ItemStack BlackGlassPane = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta BlackGlassPaneMeta = BlackGlassPane.getItemMeta();
        BlackGlassPaneMeta.setDisplayName("§8---");
        BlackGlassPane.setItemMeta(BlackGlassPaneMeta);

        Script.ClockInventory.setItem(0, BlackGlassPane);
        Script.ClockInventory.setItem(1, BlackGlassPane);
        Script.ClockInventory.setItem(2, BlackGlassPane);
        Script.ClockInventory.setItem(3, BlackGlassPane);
        Script.ClockInventory.setItem(4, BlackGlassPane);
        Script.ClockInventory.setItem(5, BlackGlassPane);
        Script.ClockInventory.setItem(6, BlackGlassPane);
        Script.ClockInventory.setItem(7, BlackGlassPane);
        Script.ClockInventory.setItem(8, BlackGlassPane);
        Script.ClockInventory.setItem(9, BlackGlassPane);
        Script.ClockInventory.setItem(10, BlackGlassPane);
        Script.ClockInventory.setItem(12, BlackGlassPane);
        Script.ClockInventory.setItem(14, BlackGlassPane);
        Script.ClockInventory.setItem(16, BlackGlassPane);
        Script.ClockInventory.setItem(17, BlackGlassPane);
        Script.ClockInventory.setItem(18, BlackGlassPane);
        Script.ClockInventory.setItem(19, BlackGlassPane);
        Script.ClockInventory.setItem(20, BlackGlassPane);
        Script.ClockInventory.setItem(21, BlackGlassPane);
        Script.ClockInventory.setItem(22, BlackGlassPane);
        Script.ClockInventory.setItem(23, BlackGlassPane);
        Script.ClockInventory.setItem(24, BlackGlassPane);
        Script.ClockInventory.setItem(25, BlackGlassPane);
        Script.ClockInventory.setItem(26, BlackGlassPane);

        //Shulker

        ItemStack Boots = new ItemStack(Material.IRON_BOOTS);
        ItemMeta BootsMeta = Boots.getItemMeta();
        BootsMeta.setDisplayName("§6Boots");
        Boots.setItemMeta(BootsMeta);

        ItemStack Head = new ItemStack(Material.PLAYER_HEAD);
        ItemMeta HeadMeta = Head.getItemMeta();
        HeadMeta.setDisplayName("§dKöpfe");
        Head.setItemMeta(HeadMeta);

        ItemStack Chestplate = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta ChestplateMeta = Chestplate.getItemMeta();
        ChestplateMeta.setDisplayName("§bAnzüge");
        Chestplate.setItemMeta(ChestplateMeta);

        Script.ShulkerInventory.setItem(11, Boots);
        Script.ShulkerInventory.setItem(13, Head);
        Script.ShulkerInventory.setItem(15, Chestplate);

        Script.ShulkerInventory.setItem(0, BlackGlassPane);
        Script.ShulkerInventory.setItem(1, BlackGlassPane);
        Script.ShulkerInventory.setItem(2, BlackGlassPane);
        Script.ShulkerInventory.setItem(3, BlackGlassPane);
        Script.ShulkerInventory.setItem(4, BlackGlassPane);
        Script.ShulkerInventory.setItem(5, BlackGlassPane);
        Script.ShulkerInventory.setItem(6, BlackGlassPane);
        Script.ShulkerInventory.setItem(7, BlackGlassPane);
        Script.ShulkerInventory.setItem(8, BlackGlassPane);
        Script.ShulkerInventory.setItem(9, BlackGlassPane);
        Script.ShulkerInventory.setItem(10, BlackGlassPane);
        Script.ShulkerInventory.setItem(12, BlackGlassPane);
        Script.ShulkerInventory.setItem(14, BlackGlassPane);
        Script.ShulkerInventory.setItem(16, BlackGlassPane);
        Script.ShulkerInventory.setItem(17, BlackGlassPane);
        Script.ShulkerInventory.setItem(18, BlackGlassPane);
        Script.ShulkerInventory.setItem(19, BlackGlassPane);
        Script.ShulkerInventory.setItem(20, BlackGlassPane);
        Script.ShulkerInventory.setItem(21, BlackGlassPane);
        Script.ShulkerInventory.setItem(22, BlackGlassPane);
        Script.ShulkerInventory.setItem(23, BlackGlassPane);
        Script.ShulkerInventory.setItem(24, BlackGlassPane);
        Script.ShulkerInventory.setItem(25, BlackGlassPane);
        Script.ShulkerInventory.setItem(26, BlackGlassPane);

        ItemStack Leather = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta LeatherMeta = Leather.getItemMeta();
        LeatherMeta.setDisplayName("§fLeder Rückstung");
        Leather.setItemMeta(LeatherMeta);

        ItemStack Gold = new ItemStack(Material.GOLDEN_CHESTPLATE);
        ItemMeta GoldMeta = Gold.getItemMeta();
        GoldMeta.setDisplayName("§6Gold Rückstung");
        Gold.setItemMeta(GoldMeta);

        ItemStack Iron = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta IronMeta = Iron.getItemMeta();
        IronMeta.setDisplayName("§7Eisen Rüstung");
        Iron.setItemMeta(IronMeta);

        ItemStack Diamond = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta DiamondMeta = Diamond.getItemMeta();
        DiamondMeta.setDisplayName("§bDiamant Rüstung");
        Diamond.setItemMeta(DiamondMeta);

        ItemStack Netherite = new ItemStack(Material.NETHERITE_CHESTPLATE);
        ItemMeta NetheriteMeta = Netherite.getItemMeta();
        NetheriteMeta.setDisplayName("§8Netherite Rüstung");
        Netherite.setItemMeta(NetheriteMeta);

        Script.AnzugInventory.setItem(11, Leather);
        Script.AnzugInventory.setItem(12, Gold);
        Script.AnzugInventory.setItem(13, Iron);
        Script.AnzugInventory.setItem(14, Diamond);
        Script.AnzugInventory.setItem(15, Netherite);

        Script.AnzugInventory.setItem(0, BlackGlassPane);
        Script.AnzugInventory.setItem(1, BlackGlassPane);
        Script.AnzugInventory.setItem(2, BlackGlassPane);
        Script.AnzugInventory.setItem(3, BlackGlassPane);
        Script.AnzugInventory.setItem(4, BlackGlassPane);
        Script.AnzugInventory.setItem(5, BlackGlassPane);
        Script.AnzugInventory.setItem(6, BlackGlassPane);
        Script.AnzugInventory.setItem(7, BlackGlassPane);
        Script.AnzugInventory.setItem(8, BlackGlassPane);
        Script.AnzugInventory.setItem(9, BlackGlassPane);
        Script.AnzugInventory.setItem(10, BlackGlassPane);
        Script.AnzugInventory.setItem(16, BlackGlassPane);
        Script.AnzugInventory.setItem(17, BlackGlassPane);
        Script.AnzugInventory.setItem(18, BlackGlassPane);
        Script.AnzugInventory.setItem(19, BlackGlassPane);
        Script.AnzugInventory.setItem(20, BlackGlassPane);
        Script.AnzugInventory.setItem(21, BlackGlassPane);
        Script.AnzugInventory.setItem(22, BlackGlassPane);
        Script.AnzugInventory.setItem(23, BlackGlassPane);
        Script.AnzugInventory.setItem(24, BlackGlassPane);
        Script.AnzugInventory.setItem(25, BlackGlassPane);
        Script.AnzugInventory.setItem(26, BlackGlassPane);

        //Heads Inventory

        ItemStack CreeperHead = new ItemStack(Material.CREEPER_HEAD);
        ItemMeta CreeperHeadMeta = CreeperHead.getItemMeta();
        CreeperHeadMeta.setDisplayName("§aCreeper Kopf");
        CreeperHead.setItemMeta(CreeperHeadMeta);

        Script.HeadsInventory.setItem(11, CreeperHead);
        Script.HeadsInventory.setItem(12, CreeperHead);
        Script.HeadsInventory.setItem(13, CreeperHead);
        Script.HeadsInventory.setItem(14, CreeperHead);
        Script.HeadsInventory.setItem(15, CreeperHead);

        Script.HeadsInventory.setItem(0, BlackGlassPane);
        Script.HeadsInventory.setItem(1, BlackGlassPane);
        Script.HeadsInventory.setItem(2, BlackGlassPane);
        Script.HeadsInventory.setItem(3, BlackGlassPane);
        Script.HeadsInventory.setItem(4, BlackGlassPane);
        Script.HeadsInventory.setItem(5, BlackGlassPane);
        Script.HeadsInventory.setItem(6, BlackGlassPane);
        Script.HeadsInventory.setItem(7, BlackGlassPane);
        Script.HeadsInventory.setItem(8, BlackGlassPane);
        Script.HeadsInventory.setItem(9, BlackGlassPane);
        Script.HeadsInventory.setItem(10, BlackGlassPane);
        Script.HeadsInventory.setItem(16, BlackGlassPane);
        Script.HeadsInventory.setItem(17, BlackGlassPane);
        Script.HeadsInventory.setItem(18, BlackGlassPane);
        Script.HeadsInventory.setItem(19, BlackGlassPane);
        Script.HeadsInventory.setItem(20, BlackGlassPane);
        Script.HeadsInventory.setItem(21, BlackGlassPane);
        Script.HeadsInventory.setItem(22, BlackGlassPane);
        Script.HeadsInventory.setItem(23, BlackGlassPane);
        Script.HeadsInventory.setItem(24, BlackGlassPane);
        Script.HeadsInventory.setItem(25, BlackGlassPane);
        Script.HeadsInventory.setItem(26, BlackGlassPane);

        //BootsInventory

        ItemStack LeatherJetpack = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta LeatherJetpackMeta = LeatherJetpack.getItemMeta();
        LeatherJetpackMeta.setDisplayName("§4Herz Schuhe");
        LeatherJetpack.setItemMeta(LeatherJetpackMeta);

        ItemStack IronJetpack = new ItemStack(Material.IRON_BOOTS);
        ItemMeta IronJetpackMeta = IronJetpack.getItemMeta();
        IronJetpackMeta.setDisplayName("§fSchnee Schuhe");
        IronJetpack.setItemMeta(IronJetpackMeta);

        ItemStack Feather = new ItemStack(Material.FEATHER);
        ItemMeta FeatherMeta = Feather.getItemMeta();
        FeatherMeta.setDisplayName("§dJetpack");
        Feather.setItemMeta(FeatherMeta);

        Script.BootsInventory.setItem(12, LeatherJetpack);
        Script.BootsInventory.setItem(13, IronJetpack);
        Script.BootsInventory.setItem(14, Feather);

        Script.BootsInventory.setItem(0, BlackGlassPane);
        Script.BootsInventory.setItem(1, BlackGlassPane);
        Script.BootsInventory.setItem(2, BlackGlassPane);
        Script.BootsInventory.setItem(3, BlackGlassPane);
        Script.BootsInventory.setItem(4, BlackGlassPane);
        Script.BootsInventory.setItem(5, BlackGlassPane);
        Script.BootsInventory.setItem(6, BlackGlassPane);
        Script.BootsInventory.setItem(7, BlackGlassPane);
        Script.BootsInventory.setItem(8, BlackGlassPane);
        Script.BootsInventory.setItem(9, BlackGlassPane);
        Script.BootsInventory.setItem(10, BlackGlassPane);
        Script.BootsInventory.setItem(11, BlackGlassPane);
        Script.BootsInventory.setItem(15, BlackGlassPane);
        Script.BootsInventory.setItem(16, BlackGlassPane);
        Script.BootsInventory.setItem(17, BlackGlassPane);
        Script.BootsInventory.setItem(18, BlackGlassPane);
        Script.BootsInventory.setItem(19, BlackGlassPane);
        Script.BootsInventory.setItem(20, BlackGlassPane);
        Script.BootsInventory.setItem(21, BlackGlassPane);
        Script.BootsInventory.setItem(22, BlackGlassPane);
        Script.BootsInventory.setItem(23, BlackGlassPane);
        Script.BootsInventory.setItem(24, BlackGlassPane);
        Script.BootsInventory.setItem(25, BlackGlassPane);
        Script.BootsInventory.setItem(26, BlackGlassPane);

    }

}
