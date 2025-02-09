package com.doubledeltas.minecollector.item.itemCode;

import org.bukkit.Material;

import java.util.Arrays;

public enum RewardItem {

    전달체(Material.CONDUIT, 20000),
    마법이부여된황금사과(Material.ENCHANTED_GOLDEN_APPLE, 20000),
    피글린머리(Material.PIGLIN_HEAD, 20000),
    위더스켈레톤머리(Material.WITHER_SKELETON_SKULL, 15000),
    네더의별(Material.NETHER_STAR, 15000),
    앵무조개(Material.NAUTILUS_SHELL, 15000),
    삼지창(Material.TRIDENT,15000),
    철퇴(Material.MACE, 15000),
    겉날개(Material.ELYTRA, 10000),
    네더라이크투구(Material.NETHERITE_HELMET, 10000),
    네더라이크흉갑(Material.NETHERITE_CHESTPLATE, 10000),
    네더라이크바지(Material.NETHERITE_LEGGINGS, 10000),
    네더라이크신발(Material.NETHERITE_BOOTS, 10000),
    거북등딱지(Material.TURTLE_HELMET, 10000),
    불사의토템(Material.TOTEM_OF_UNDYING, 10000),
    만회나침반(Material.RECOVERY_COMPASS, 10000),
    개구리불1(Material.OCHRE_FROGLIGHT, 10000),
    개구리불2(Material.PEARLESCENT_FROGLIGHT, 10000),
    개구리불3(Material.VERDANT_FROGLIGHT, 10000),
    셜커상자(Material.SHULKER_BOX, 5000),
    망원경(Material.SPYGLASS, 50000),
    스펀지(Material.SPONGE, 5000),
    불길한시련열쇠(Material.OMINOUS_TRIAL_KEY, 5000),
    말갑옷1(Material.DIAMOND_HORSE_ARMOR, 5000),
    말갑옷2(Material.GOLDEN_HORSE_ARMOR, 5000),
    말갑옷3(Material.IRON_HORSE_ARMOR, 5000),
    말갑옷4(Material.LEATHER_HORSE_ARMOR, 5000),
    스컬크촉매(Material.SCULK_CATALYST, 3000),
    안장(Material.SADDLE, 3000),
    염소뿔(Material.GOAT_HORN, 3000),
    이름표(Material.NAME_TAG, 3000),
    토끼발(Material.RABBIT_FOOT, 3000),
    바다의심장(Material.HEART_OF_THE_SEA, 2000),
    ;

    private Material material;
    private int prize;

    RewardItem(Material material, int prize) {
        this.material = material;
        this.prize = prize;
    }

    public static int determine(Material target) {
        return Arrays.stream(RewardItem.values())
                .filter(item -> item.material.equals(target))
                .map(item -> item.prize)
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("There is no matched genre"));
    }
}
