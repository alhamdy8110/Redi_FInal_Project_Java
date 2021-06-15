package com.company;


public class Phone {

    public String name;
    public double price;

    public Phone(){
    }

    public Phone(String name, double price){
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return  name + " " + price;
    }
}




