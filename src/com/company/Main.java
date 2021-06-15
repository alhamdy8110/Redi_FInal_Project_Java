package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean go = true;

        Catalogue phoneCatalogue = new Catalogue();

        PhoneListController phoneListController = new PhoneListController(phoneCatalogue);

        while (go) {

            phoneListController.selectBrand();

            phoneListController.printAvailablePhones();

            phoneListController.selectPhone();

            phoneListController.printAvailableColor();

            phoneListController.selectColor();

            phoneListController.printAvailableRam();

            phoneListController.selectRam();

            //phoneListController.printBill();

            phoneListController.addPhones();

            System.out.println("would you like to buy another one, to continue Please type yes otherwise print no");

            Scanner userInput = new Scanner(System.in);

            String userDecision = userInput.nextLine();

            if (userDecision.equalsIgnoreCase("no")){
                go = false;
                System.out.println("Thank you");
            } else {
                continue;
            }
        }

    }
}
