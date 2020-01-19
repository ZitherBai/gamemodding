package com.zither.obsidian_tools.items.tools;

import com.zither.obsidian_tools.Main;
import com.zither.obsidian_tools.init.ModItems;
import com.zither.obsidian_tools.util.IHasModel;

import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel
{

    public ToolAxe  (String name, ToolMaterial material)
    {
        super(material, 6.0F, -3.2F);
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