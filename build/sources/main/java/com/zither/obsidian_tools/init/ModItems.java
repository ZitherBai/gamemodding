package com.zither.obsidian_tools.init;

import java.util.ArrayList;
import java.util.List;

import com.zither.obsidian_tools.items.ItemBase;
import com.zither.obsidian_tools.items.armor.ArmorBase;
import com.zither.obsidian_tools.items.tools.ToolAxe;
import com.zither.obsidian_tools.items.tools.ToolHoe;
import com.zither.obsidian_tools.items.tools.ToolPickaxe;
import com.zither.obsidian_tools.items.tools.ToolSpade;
import com.zither.obsidian_tools.items.tools.ToolSword;
import com.zither.obsidian_tools.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //materials
    public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 3, 1024, 8.0F, 3.0F, 10);
    public static final ToolMaterial MATERIAL_REINFORCED_OBSIDIAN = EnumHelper.addToolMaterial("material_reinforced_obsidian", 3, 2048, 12.0F, 8.0F, 25);

    public static final ArmorMaterial ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial("armor_material_obsidian", Reference.MOD_ID + ":obsidian_ingot", 30, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    public static final ArmorMaterial ARMOR_MATERIAL_REINFORCED_OBSIDIAN = EnumHelper.addArmorMaterial("armor_material_reinforced_obsidian", Reference.MOD_ID + ":reinforced_obsidian_ingot", 60, new int[]{6, 12, 16, 6}, 25, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);
  
    
    //items
    public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
    public static final Item REINFORCED_OBSIDIAN_INGOT = new ItemBase("reinforced_obsidian_ingot");
    public static final Item BLAZE_ESSENCE = new ItemBase("blaze_essence");


    //tools
    public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
    public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpade("obsidian_shovel", MATERIAL_OBSIDIAN);
    public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN);
    public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
    public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN);

    public static final ItemSword REINFORCED_OBSIDIAN_SWORD = new ToolSword("reinforced_obsidian_sword", MATERIAL_REINFORCED_OBSIDIAN);
    public static final ItemSpade REINFORCED_OBSIDIAN_SPADE = new ToolSpade("reinforced_obsidian_shovel", MATERIAL_REINFORCED_OBSIDIAN);
    public static final ItemAxe REINFORCED_OBSIDIAN_AXE = new ToolAxe("reinforced_obsidian_axe", MATERIAL_REINFORCED_OBSIDIAN);
    public static final ItemPickaxe REINFORCED_OBSIDIAN_PICKAXE = new ToolPickaxe("reinforced_obsidian_pickaxe", MATERIAL_REINFORCED_OBSIDIAN);
    public static final ItemHoe REINFORCED_OBSIDIAN_HOE = new ToolHoe("reinforced_obsidian_hoe", MATERIAL_REINFORCED_OBSIDIAN);


    //armor
    public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
    public static final Item OBSIDIAN_CHESTPLATE = new ArmorBase("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
    public static final Item OBSIDIAN_LEGGINGS = new ArmorBase("obsidian_leggings", ARMOR_MATERIAL_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
    public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.FEET);

    public static final Item REINFORCED_OBSIDIAN_HELMET = new ArmorBase("reinforced_obsidian_helmet", ARMOR_MATERIAL_REINFORCED_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
    public static final Item REINFORCED_OBSIDIAN_CHESTPLATE = new ArmorBase("reinforced_obsidian_chestplate", ARMOR_MATERIAL_REINFORCED_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
    public static final Item REINFORCED_OBSIDIAN_LEGGINGS = new ArmorBase("reinforced_obsidian_leggings", ARMOR_MATERIAL_REINFORCED_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
    public static final Item REINFORCED_OBSIDIAN_BOOTS = new ArmorBase("reinforced_obsidian_boots", ARMOR_MATERIAL_REINFORCED_OBSIDIAN, 1, EntityEquipmentSlot.FEET);


    
}