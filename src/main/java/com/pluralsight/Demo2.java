package com.pluralsight;

import java.util.*;

public class Demo2 {
    public static void main(String[] args) {

        System.out.println("how old are you?" );
        Scanner scanner = new Scanner(System.in);

        int age1 = scanner.nextInt();
        System.out.println("you are : " + age1);


        System.out.println("whats your name?");
        String name = scanner.nextLine();
        System.out.println(" your name is "+ name);

        // storing in String
      //  String age0 = scanner.nextLine();

     //   Integer age1 = Integer.parseInt(age0);




        // Storing in int

        // int age1 = scanner.nextInt();
        // scanner.nextLine();

        System.out.println("you are"+ age1 + "years old");


    }

}
