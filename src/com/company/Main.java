package com.company;

public class Main<clientAndroid, clientDeviceYear, clientIOS, deliveryDistance> {

    public static void main(String[] args) {
        int clientIOS = 0;
        if (clientIOS == 0) {
            System.out.println("Install the iOS version of the app from the link");
        }
            int clientAndroid = 1;
            if (clientAndroid == 1) {
                System.out.println("Install the Android version of the app from the link");
        }

    }


    int clientIOS = 0;
    int clientAndroid = 1;
    int clientDeviceYear = 2014;
    if (clientAndroid == 1 && clientDeviceYear <= 2014) {
        System.out.println("Install the lite version of the Android app from the link");
    }else{
        System.out.println("Install the Android version of the app from the link");
    }
    if (clientIOS == 0 && clientDeviceYear <= 2014) {
        System.out.println("Install the light version of the app for iOS from the link");
    }else{
        System.out.println("Install the Android version of the app from the link");
    }


    int year = 2021;
    int leapYear = year % 4;
    if (leapYear == 0 && year != 100) {
        System.out.println("year " + " is a leap year");
    }else{
        System.out.println("year " + " is not a leap year");
    }


    int deliveryDistance = 95;
    if (deliveryDistance < 20) {
        System.out.println("It will take days: " + " 1");
    }
     if (deliveryDistance >= 20 && deliveryDistance < 60) {
        System.out.println("It will take days: " + " 2");
    }
     if (deliveryDistance >= 60 && deliveryDistance <= 100) {
        System.out.println("It will take days: " + " 3");


        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("This is winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("This is spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("This is summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("This is autumn");
                break;
            default:
                System.out.println("This month does not exist");
        }




}
