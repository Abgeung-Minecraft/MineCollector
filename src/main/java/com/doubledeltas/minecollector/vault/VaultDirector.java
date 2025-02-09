package com.doubledeltas.minecollector.vault;

import com.doubledeltas.minecollector.item.itemCode.RewardItem;
import com.doubledeltas.minecollector.item.manager.RewardItemManager;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class VaultDirector {

    public static Double giveReward(Player target, ItemStack targetItem) {
        try {
            Economy econ = VaultManager.getEconomy();
            double prize = RewardItemManager.determine(targetItem);
            econ.depositPlayer(target, prize);
            return prize;
        } catch (Exception e) {
            return null;
        }
    }
}
