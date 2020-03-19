package minegame159.meteorclient.utils;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;
import net.minecraft.potion.Potions;

public enum MyPotion {
    Swiftness(Potions.SWIFTNESS, Items.NETHER_WART, Items.SUGAR),
    SwiftnessLong(Potions.LONG_SWIFTNESS, Items.NETHER_WART, Items.SUGAR, Items.REDSTONE),
    SwiftnessStrong(Potions.STRONG_SWIFTNESS, Items.NETHER_WART, Items.SUGAR, Items.GLOWSTONE),

    Slowness(Potions.SLOWNESS, Items.NETHER_WART, Items.SUGAR, Items.FERMENTED_SPIDER_EYE),
    SlownessLong(Potions.LONG_SLOWNESS, Items.NETHER_WART, Items.SUGAR, Items.FERMENTED_SPIDER_EYE, Items.REDSTONE),
    SlownessStrong(Potions.STRONG_SLOWNESS, Items.NETHER_WART, Items.SUGAR, Items.FERMENTED_SPIDER_EYE, Items.GLOWSTONE),

    JumpBoost(Potions.LEAPING, Items.NETHER_WART, Items.RABBIT_FOOT),
    JumpBoostLong(Potions.LONG_LEAPING, Items.NETHER_WART, Items.RABBIT_FOOT, Items.REDSTONE),
    JumpBoostStrong(Potions.STRONG_LEAPING, Items.NETHER_WART, Items.RABBIT_FOOT, Items.GLOWSTONE),

    Strength(Potions.STRENGTH, Items.NETHER_WART, Items.BLAZE_POWDER),
    StrengthLong(Potions.LONG_STRENGTH, Items.NETHER_WART, Items.BLAZE_POWDER, Items.REDSTONE),
    StrengthStrong(Potions.STRONG_STRENGTH, Items.NETHER_WART, Items.BLAZE_POWDER, Items.GLOWSTONE),

    Healing(Potions.HEALING, Items.NETHER_WART, Items.GLISTERING_MELON_SLICE),
    HealingStrong(Potions.STRONG_HEALING, Items.NETHER_WART, Items.GLISTERING_MELON_SLICE, Items.GLOWSTONE),

    Harming(Potions.HARMING, Items.NETHER_WART, Items.GLISTERING_MELON_SLICE, Items.FERMENTED_SPIDER_EYE),
    HarmingStrong(Potions.STRONG_HARMING, Items.NETHER_WART, Items.GLISTERING_MELON_SLICE, Items.FERMENTED_SPIDER_EYE, Items.GLOWSTONE),

    Poison(Potions.POISON, Items.NETHER_WART, Items.SPIDER_EYE),
    PoisonLong(Potions.LONG_POISON, Items.NETHER_WART, Items.SPIDER_EYE, Items.REDSTONE),
    PoisonStrong(Potions.STRONG_POISON, Items.NETHER_WART, Items.SPIDER_EYE, Items.GLOWSTONE),

    Regeneration(Potions.REGENERATION, Items.NETHER_WART, Items.GHAST_TEAR),
    RegenerationLong(Potions.LONG_REGENERATION, Items.NETHER_WART, Items.GHAST_TEAR, Items.REDSTONE),
    RegenerationStrong(Potions.STRONG_REGENERATION, Items.NETHER_WART, Items.GHAST_TEAR, Items.GLOWSTONE),

    FireResistance(Potions.FIRE_RESISTANCE, Items.NETHER_WART, Items.MAGMA_CREAM),
    FireResistanceLong(Potions.LONG_FIRE_RESISTANCE, Items.NETHER_WART, Items.MAGMA_CREAM, Items.REDSTONE),

    WaterBreathing(Potions.WATER_BREATHING, Items.NETHER_WART, Items.PUFFERFISH),
    WaterBreathingLong(Potions.LONG_WATER_BREATHING, Items.NETHER_WART, Items.PUFFERFISH, Items.REDSTONE),

    NightVision(Potions.NIGHT_VISION, Items.NETHER_WART, Items.GOLDEN_CARROT),
    NightVisionLong(Potions.LONG_NIGHT_VISION, Items.NETHER_WART, Items.GOLDEN_CARROT, Items.REDSTONE),

    Invisibility(Potions.INVISIBILITY, Items.NETHER_WART, Items.GOLDEN_CARROT, Items.FERMENTED_SPIDER_EYE),
    InvisibilityLong(Potions.LONG_INVISIBILITY, Items.NETHER_WART, Items.GOLDEN_CARROT, Items.FERMENTED_SPIDER_EYE, Items.REDSTONE),

    TurtleMaster(Potions.TURTLE_MASTER, Items.NETHER_WART, Items.TURTLE_HELMET),
    TurtleMasterLong(Potions.LONG_TURTLE_MASTER, Items.NETHER_WART, Items.TURTLE_HELMET, Items.REDSTONE),
    TurtleMasterStrong(Potions.STRONG_TURTLE_MASTER, Items.NETHER_WART, Items.TURTLE_HELMET, Items.GLOWSTONE),

    SlowFalling(Potions.SLOW_FALLING, Items.NETHER_WART, Items.PHANTOM_MEMBRANE),
    SlowFallingLong(Potions.LONG_SLOW_FALLING, Items.NETHER_WART, Items.PHANTOM_MEMBRANE, Items.REDSTONE),

    Weakness(Potions.WEAKNESS, Items.FERMENTED_SPIDER_EYE),
    WeaknessLong(Potions.LONG_WEAKNESS, Items.FERMENTED_SPIDER_EYE, Items.REDSTONE);

    public final ItemStack potion;
    public final Item[] ingredients;

    MyPotion(Potion potion, Item... ingredients) {
        this.potion = PotionUtil.setPotion(new ItemStack(Items.POTION), potion);
        this.ingredients = ingredients;
    }
}
