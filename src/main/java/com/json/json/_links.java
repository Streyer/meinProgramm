package com.json.json;



public class _links {
    public static String[] weapons = new String[]{
            "http://steamcommunity.com/market/priceoverview/?appid=730&currency=3&market_hash_name=AK-47 | Safari Mesh (Field-Tested)",
            "http://steamcommunity.com/market/priceoverview/?appid=730&currency=3&market_hash_name=AK-47 | Safari Mesh (Minimal Wear)",
            "http://steamcommunity.com/market/priceoverview/?appid=730&currency=3&market_hash_name=AK-47 | Safari Mesh (Battle-Scarred)",
            "http://steamcommunity.com/market/priceoverview/?appid=730&currency=3&market_hash_name=AK-47 | Safari Mesh (Well-Worn)",
            "http://steamcommunity.com/market/priceoverview/?appid=730&currency=3&market_hash_name=AK-47 | Safari Mesh (Factory New)"};


    public static String[] getWeaponsIterateThrough() {
        String[] weapons = new String[Weapons.weaponsList.length];
        System.out.println(Weapons.weaponsList.length);

        for (int counter = 0; counter < Weapons.weaponsList.length; counter++) {
            for (int counter2 = 0; counter2 < Weapons.weaponPatterns.length; counter2++) {
            weapons[counter] = "http://steamcommunity.com/market/priceoverview/?appid=730&currency=3&market_hash_name=" + Weapons.weaponsList[counter] + " | " + Weapons.weaponPatterns[counter2] + " (Field-Tested)";

            //System.out.println(weapons[counter]);
        }}


        return weapons;

    }


}
