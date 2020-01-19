package com.zither.obsidian_tools.init;

import java.util.ArrayList;
import java.util.List;

import com.zither.obsidian_tools.items.ItemBase;
import com.zither.obsidian_tools.items.tools.ToolAxe;
import com.zither.obsidian_tools.items.tools.ToolHoe;
import com.zither.obsidian_tools.items.tools.ToolPickaxe;
import com.zither.obsidian_tools.items.tools.ToolSpade;
import com.zither.obsidian_tools.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems
{

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //materials
    public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 3, 1000, 8.0F, 3.0F, 10);


    //items
    public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");


    //tools
    public static final ItemSword OBSIDIAN_SWORD = new ToolSword("obsidian_sword", MATERIAL_OBSIDIAN);
    public static final ItemSpade OBSIDIAN_SHOVEL = new ToolSpade("obsidian_shovel", MATERIAL_OBSIDIAN);
    public static final ItemAxe OBSIDIAN_AXE = new ToolAxe("obsidian_axe", MATERIAL_OBSIDIAN);
    public static final ItemPickaxe OBSIDIAN_PICKAXE = new ToolPickaxe("obsidian_pickaxe", MATERIAL_OBSIDIAN);
    public static final ItemHoe OBSIDIAN_HOE = new ToolHoe("obsidian_hoe", MATERIAL_OBSIDIAN);

}