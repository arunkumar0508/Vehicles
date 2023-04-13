package org.example;
public class Main {
    public static void main(String[] args) {

        Transmission obj=new Manual("manual","MP5");
        obj.setTransmissionType("manual");
        System.out.println(obj.getTransmissionType());
        System.out.println(obj.showSpecs());
    }
}