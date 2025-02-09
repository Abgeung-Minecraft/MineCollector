package com.doubledeltas.minecollector.item.manager;

import com.doubledeltas.minecollector.item.itemCode.PotionItem;
import com.doubledeltas.minecollector.item.itemCode.RewardItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class RewardItemManager {

    public static int determine(ItemStack target) {
        Material material = target.getType();
        if(material == Material.POTION) {
            return PotionItem.determine(target);
        } else {
            return RewardItem.determine(material);
        }
    }
}
