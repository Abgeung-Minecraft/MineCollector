package com.doubledeltas.minecollector.item.itemCode;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionType;

import java.util.Arrays;

public enum PotionItem {
    재생포션1(PotionType.REGENERATION, 1000),
    재생포션2(PotionType.LONG_REGENERATION, 1000),
    재생포션3(PotionType.STRONG_REGENERATION, 1000)
    ;

    private final PotionType potionType;
    private final int prize;

    PotionItem(PotionType potionType, int prize) {
        this.potionType = potionType;
        this.prize = prize;
    }

    public static int determine(ItemStack target) {
        if (target == null || !(target.getItemMeta() instanceof PotionMeta)) {
            throw new IllegalArgumentException("Invalid ItemStack: must be a potion with PotionMeta");
        }

        PotionMeta meta = (PotionMeta) target.getItemMeta();
        if (meta == null) {
            throw new IllegalArgumentException("ItemStack meta is null");
        }

        PotionType type = meta.getBasePotionType();

        return Arrays.stream(PotionItem.values())
                .filter(item -> item.potionType.equals(type)
                )
                .map(item -> item.prize)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("There is no matched genre"));
    }
}
