package com.company;

import java.util.ArrayList;
import java.util.HashMap;


public class Catalogue {


    HashMap<String, ArrayList<Phone>> phoneInventory = new HashMap<>();

    ArrayList<String> colorList = new ArrayList<String>();

    ArrayList<Phone> ramCapacity = new ArrayList<Phone>();

    public Catalogue(){
        ArrayList<Phone> iphoneList = new ArrayList<>();
        ArrayList<Phone> samsungList = new ArrayList<>();


        iphoneList.add(new Phone("Iphone6", 500));
        iphoneList.add( new Phone("Iphone7", 600));
        iphoneList.add(new Phone("Iphone8", 700));
        iphoneList.add(new Phone("Iphone9", 800));
        iphoneList.add(new Phone("Iphone10", 900));
        phoneInventory.put("iphone",iphoneList);

        samsungList.add(new Phone("Samsung S10", 400));
        samsungList.add(new Phone("Samsung S7", 500));
        samsungList.add(new Phone("Samsung S8", 600));
        samsungList.add(new Phone("Samsung S9", 700));
        samsungList.add(new Phone("Samsung S10", 800));
        phoneInventory.put("samsung", samsungList);

        colorList.add("Red");
        colorList.add("Black");
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("White");


        ramCapacity.add(new Phone ("64 GB", 80));
        ramCapacity.add(new Phone ("128 GB", 120));
        ramCapacity.add(new Phone ("256 GB", 160));

    }

    /*public void printIphone(){

        for (Map.Entry<Integer, Phone> iphone : iphoneMap.entrySet()) {

            System.out.println(iphone.getKey());
            System.out.println(iphone.getValue());
        }
    }
    public void printGalaxy(){
        for (Map.Entry<Integer, Phone> samsung : samsungMap.entrySet()) {

            System.out.println(samsung.getKey());
            System.out.println(samsung.getValue());
        }
    }*/

}
