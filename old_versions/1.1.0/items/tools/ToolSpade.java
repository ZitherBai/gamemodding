package com.zither.obsidian_tools.items.tools;

import com.zither.obsidian_tools.Main;
import com.zither.obsidian_tools.init.ModItems;
import com.zither.obsidian_tools.util.IHasModel;

import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel
{

    public ToolSpade  (String name, ToolMaterial material)
    {
        super(material);
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