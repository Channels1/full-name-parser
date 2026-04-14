package com.pluralsight;

import java.util.Scanner;

public class fullNameParseApp {
    public static void main(String[] args) {
        Scanner logger = new Scanner(System.in);

        System.out.println("What is your name? ");
        String fullName = logger.nextLine();

        String[] data = fullName.split(" ");


        if(data.length > 2){
            System.out.println("First name:"+data[0]);
            System.out.println("Middle name:"+data[1]);
            System.out.println("Last name:"+data[2]);
        }
        else {
            System.out.println("First name:"+data[0]);
            System.out.println("Last name:"+data[1]);
        }




    }
}
