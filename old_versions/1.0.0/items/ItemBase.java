package com.zither.first_mod.items;

import com.zither.first_mod.Main;
import com.zither.first_mod.init.ModItems;
import com.zither.first_mod.util.IHasModel;

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