package com.company;

public class PhoneSuper {

    public String name;
    public double price;
    public String color;
    public String ram;


    public PhoneSuper(String name, double newPhonePrice, String selectedColor, String s){
    }

    public PhoneSuper(String name, double price){
        this.name = name;
        this.price = price;
        this.color = color;
        this.ram = ram;

    }

    @Override
    public String toString() {
        return  name + " " + price + " " + color + " " + ram;
    }
}
