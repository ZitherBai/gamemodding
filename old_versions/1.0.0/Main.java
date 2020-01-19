package com.zither.first_mod;

import com.zither.first_mod.init.ModItems;
import com.zither.first_mod.proxy.CommonProxy;
import com.zither.first_mod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main
{

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public static void init(FMLInitializationEvent event)
    {

    }
    
    @EventHandler
    public static void Postinit(FMLPostInitializationEvent event)
    {

    }

    public static CreativeTabs Mod_Tab = new CreativeTabs("mod_tab")
    {

            @Override
            public ItemStack getTabIconItem()
            {
                return new ItemStack (ModItems.OBSIDIAN_INGOT);
            }

    };
}