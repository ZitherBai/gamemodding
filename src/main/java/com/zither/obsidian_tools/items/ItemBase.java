package com.zither.obsidian_tools.items;

import com.zither.obsidian_tools.Main;
import com.zither.obsidian_tools.init.ModItems;
import com.zither.obsidian_tools.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{

    public ItemBase (String name)
    {

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.Mod_Tab);

        ModItems.ITEMS.add(this);

    }

    @Override
    public void registerModels() 
    {

        Main.proxy.registerItemRenderer(this, 0, "inventory");

    }




}