package com.json;

import com.google.gson.Gson;
import com.json.json.CsGoAPI;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import com.json.json._links;

import java.io.IOException;

// in dem Video hab ich gelernt wie der get json from URL geht
// https://www.youtube.com/watch?v=Vqgghm9pWe0
public class Main {
    private static OkHttpClient client = new OkHttpClient();


    public static void main(String[] args) {
        _links.getWeaponsIterateThrough();
        String[] eachWeapon = _links.getWeaponsIterateThrough();


        while (true) {
            try {
                for (String url : eachWeapon) {
                    Thread.sleep(3000);
                    System.out.println(1);
                    Thread.sleep(3000);
                    System.out.println(2);
                    Thread.sleep(3000);
                    System.out.println(3);
                    Thread.sleep(3000);
                    System.out.println(url);
                    for (String str : getWeaponData(url)) {
                        System.out.println(str);
                    }
                    //for (String str : getUserData(test)) {
                    //    if(getSuccessMessage(test))
                    //    System.out.println(str);
                    //}
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
/*
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            try {
                for (String test : _links.weapons) {
               // for (String test : _links.getWeaponsIterateThrough()) {
                    Thread.sleep(3000);

                    for (String str : getUserData(test)) {
                        System.out.println(str);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/


    }

    private static String getJSON(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    private static String[] getWeaponData(String url) {
        String json = null;
        try {
            json = getJSON(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        CsGoAPI csGoAPI = gson.fromJson(json, CsGoAPI.class);
        String[] test = new String[]{};
        test = new String[]
                {
                        "success:" + csGoAPI.getSuccess(),
                        "lowest_price:" + csGoAPI.getLowest_price(),
                        "median_price:" + csGoAPI.getMedian_price(),
                        "volume:" + csGoAPI.getVolume()
                };

        // if(csGoAPI == null){
        //    System.out.println("jetz is hier null");
        //    return new String[]{"null"};
//
        // }
        // if(csGoAPI.getSuccess() == "true"){
        //     System.out.println("true");
        // test = new String[]
        //         {
        //                 "success:" + csGoAPI.getSuccess(),
        //                 "lowest_price:" + csGoAPI.getLowest_price(),
        //                 "median_price:" + csGoAPI.getMedian_price(),
        //                 "volume:" + csGoAPI.getVolume()
//
        //         };
        //     return test;}
        return test;
    }

    private static boolean getSuccessMessage(String url) {
        String json = null;
        try {
            json = getJSON(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        CsGoAPI csGoAPI = gson.fromJson(json, CsGoAPI.class);
        return csGoAPI.getSuccess() == "true";
    }

}
