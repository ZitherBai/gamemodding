package com.zither.obsidian_tools.init;

import java.util.ArrayList;
import java.util.List;

import com.zither.obsidian_tools.enchants.EnchantmentThunderbolt;
import com.zither.obsidian_tools.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)
public class ModEnchants
{

    public static final List<Enchantment> ENCHANTMENTS = new ArrayList<Enchantment>();

    public static final Enchantment THUNDERBOLT = new EnchantmentThunderbolt();
    
    @SubscribeEvent
    public static void LightningStrike(LivingUpdateEvent event)
    {

        EntityLivingBase living = event.getEntityLiving();
        int level = EnchantmentHelper.getMaxEnchantmentLevel(THUNDERBOLT, living);
        BlockPos pos = living.getPosition();
        World world = event.getEntity().world;

    }

}