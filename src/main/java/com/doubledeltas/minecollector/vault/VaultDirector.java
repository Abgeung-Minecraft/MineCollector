package com.doubledeltas.minecollector.vault;

import com.doubledeltas.minecollector.item.itemCode.RewardItem;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class VaultDirector {

    public static Double giveReward(Player target, Material targetItem) {
        try {
            Economy econ = VaultManager.getEconomy();
            double prize = RewardItem.determine(targetItem);
            econ.depositPlayer(target, prize);
            return prize;
        } catch (Exception e) {
            return null;
        }
    }
}
