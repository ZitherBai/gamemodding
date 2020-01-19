package com.zither.obsidian_tools.enchants;

import com.zither.obsidian_tools.init.ModEnchants;
import com.zither.obsidian_tools.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentThunderbolt extends Enchantment
{

    public EnchantmentThunderbolt()
    {

        super(Rarity.RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
        this.setName("Thunderbolt");
        this.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":Thunderbolt"));

        ModEnchants.ENCHANTMENTS.add(this);

    }

    @Override
    public int getMinEnchantability(int enchantmentLevel)
    {

        return 20 * enchantmentLevel;

    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel)
    {

        return this.getMinEnchantability(enchantmentLevel) + 10;
    
    }

    @Override
    public int getMaxLevel()
    {
        return 5;
    }

    @Override
    protected boolean canApplyTogether(Enchantment ench)
    {

        return super.canApplyTogether(ench) && ench != Enchantments.SMITE;

    }

}