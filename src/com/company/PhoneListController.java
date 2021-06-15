package com.company;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class PhoneListController {
    int currentPage = 0;
    int itemPerPage = 2;
    Catalogue phoneCatalogue;
    ArrayList<Phone> selectedBrand;
    Phone selectedPhone;
    String selectedColor;
    Phone selectedRam;
    ArrayList<PhoneSuper> allSelectedPhones = new ArrayList<>();

    double totalPrice;
    PhoneListController(Catalogue phoneCatalogue){

        /*for (Map.Entry<Integer, Phone>  element :  iphoneMapList.entrySet()){
          allPhones.put(element.getKey(),element.getValue());
        }*/
        this.phoneCatalogue = phoneCatalogue;
    }

    public void selectBrand(){
        System.out.println("Please choose a Brand " + phoneCatalogue.phoneInventory.keySet());
        Scanner userSelect = new Scanner(System.in);
        String selectedBrand = userSelect.nextLine();
        this.selectedBrand = phoneCatalogue.phoneInventory.get(selectedBrand.toLowerCase());

    }

    public void printAvailablePhones(){
        System.out.println("Please select Phone");

        for (int i = 0; i< selectedBrand.size(); i++){
            System.out.println(i + " : " + selectedBrand.get(i));
        }

    }

    public void selectPhone(){
        Scanner userSelect = new Scanner(System.in);
        int selectedPhone = userSelect.nextInt();

        this.selectedPhone = selectedBrand.get(selectedPhone);

        System.out.println(selectedBrand.get(selectedPhone));
    }

    public void printAvailableColor(){
        System.out.println("Please select a Color");
        for (int i = 0; i< phoneCatalogue.colorList.size(); i++){
            System.out.println(i + " : " + phoneCatalogue.colorList.get(i));
        }
    }

    public void selectColor(){
        Scanner userSelect = new Scanner(System.in);
        int selectedColor = userSelect.nextInt();
        this.selectedColor = phoneCatalogue.colorList.get(selectedColor);
        System.out.println(phoneCatalogue.colorList.get(selectedColor));
    }


    public void printAvailableRam(){
        System.out.println("Please select one");
        for(int i = 0; i < phoneCatalogue.ramCapacity.size(); i++){
            System.out.println(i + " : " + phoneCatalogue.ramCapacity.get(i));
        }
    }

    public void selectRam(){
        Scanner userSelect = new Scanner(System.in);
        int selectedRam = userSelect.nextInt();
        this.selectedRam = phoneCatalogue.ramCapacity.get(selectedRam);

        System.out.println(phoneCatalogue.ramCapacity.get(selectedRam));
    }

    public void addPhones(){

        double newPhonePrice = selectedPhone.price + selectedRam.price;
        System.out.println(selectedPhone.name);
        System.out.println(newPhonePrice);
        System.out.println(selectedColor);
        System.out.println(selectedRam.name);
        allSelectedPhones.add(new PhoneSuper(selectedPhone.name, newPhonePrice, selectedColor, selectedRam.name));

        System.out.println(" Your Order are :" + allSelectedPhones);
    }

    /*public void printBill(){

        System.out.println(" Your Order is :" + allSelectedPhones + " \n" +  " Total Price is :" +(selectedPhone.price+selectedRam.price));

    }*/


    ///////////// getNext(>)
    /*public HashMap<Integer, Phone> getNext(){

        int currentPhoneNum = 0;

        for (Phone phone :  selectedBrand){

            if ((currentPhoneNum >= currentPage * itemPerPage ) && (currentPhoneNum < (currentPage +1) * itemPerPage)){
                nextElement.put(element.getKey(), element.getValue());
            }
            currentPhoneNum ++;

        }
        currentPage++;
        return nextElement;
    }
    ///////////// getPrevious(<)
    public HashMap<Integer, Phone> getPrevious(){

        HashMap<Integer, Phone> previousElement = new HashMap<Integer, Phone>();

        int currentPhoneNum = 0;

        currentPage = currentPage -2;
        for (Map.Entry<Integer, Phone>  element :  allPhones.entrySet()){
            //currentPhoneNum --;

            if ((currentPhoneNum >= currentPage * itemPerPage ) && (currentPhoneNum < (currentPage +1) * itemPerPage)){
                previousElement.put(element.getKey(), element.getValue());
            }
            currentPhoneNum ++;
        }
        return previousElement;
    }*/
}
