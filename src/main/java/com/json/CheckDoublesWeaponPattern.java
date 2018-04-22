package com.json;

import com.json.json.Weapons;

public class CheckDoublesWeaponPattern {
    public static void main(String[] args) {
        for(int j = 0; j < 189 ; j++){
        for(int i = 0; i < 189 ; i++){
            int check=0;
            if (Weapons.weaponPatterns[i].equals(Weapons.weaponPatterns[j])){
                System.out.println(Weapons.weaponPatterns[j]);
            }
        }}



       // int i = 0;
       // int j = 0;
       // System.out.println(Weapons.weaponPatterns.length);
       // for (String text : Weapons.weaponPatterns) {
       //     for (String text2 : Weapons.weaponPatterns) {
       //         if(i != j){
       //         if (Weapons.weaponPatterns[i].equals(Weapons.weaponPatterns2[j])) {
       //             System.out.println(text2);
       //             System.out.println("i: "+i + " j: "+ j);
       //         }}
       //         j++;
       //         //System.out.println(j);
       //         if(j== 236){j = 0;}
       //     }
       //     i++;
       //     //System.out.println("Das ist i "+i);
       //     if(i== 236){i = 0;}
       // }
    }
}
