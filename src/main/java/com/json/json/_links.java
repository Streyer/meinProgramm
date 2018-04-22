package com.json.json;


public class _links {
    public static String[] weapons = new String[]{
            "http://steamcommunity.com/market/priceoverview/?appid=730&currency=3&market_hash_name=AK-47 | Safari Mesh (Field-Tested)",
            "http://steamcommunity.com/market/priceoverview/?appid=730&currency=3&market_hash_name=AK-47 | Safari Mesh (Minimal Wear)",
            "http://steamcommunity.com/market/priceoverview/?appid=730&currency=3&market_hash_name=AK-47 | Safari Mesh (Battle-Scarred)",
            "http://steamcommunity.com/market/priceoverview/?appid=730&currency=3&market_hash_name=AK-47 | Safari Mesh (Well-Worn)",
            "http://steamcommunity.com/market/priceoverview/?appid=730&currency=3&market_hash_name=AK-47 | Safari Mesh (Factory New)"};


    public static String[] getWeaponsIterateThrough() {
        //String[] weapons = new String[Weapons.weaponsList.length];
        String[] weapons = new String[Weapons.weaponsList.length * Weapons.weaponPatterns.length * Weapons.weaponsWear.length];
        System.out.println(weapons.length);

        int i = 0;
        for (int counter = 0; counter < Weapons.weaponsList.length; counter++) {
            //System.out.println("Der Counter der WaffenListe ist bei: "+counter);
            for (int counter2 = 0; counter2 < Weapons.weaponPatterns.length; counter2++) {
                for (int counter3 = 0; counter3 < Weapons.weaponsWear.length; counter3++) {

                    weapons[i] = "http://steamcommunity.com/market/priceoverview/?appid=730&currency=3&market_hash_name=" + Weapons.weaponsList[counter] + " | " + Weapons.weaponPatterns[counter2] + " (" + Weapons.weaponsWear[counter3]+")";
                    //System.out.println("Der Counter der WaffenPatterns ist bei:" + counter2);
                    i++;
                }
            }
        }


        return weapons;

    }


}
