package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is Bitcoin price today? ");
        if (in.hasNextFloat()) {
            float num1 = in.nextFloat();
            System.out.print("How much $ do you have? ");
            if (in.hasNextFloat()) {
                float num2 = in.nextFloat();
                float num3 = (num2 / num1);
                System.out.print("You can buy " + num3 + " BTC");
            } else System.out.print("Enter the number! ");
        }
    else System.out.print("Enter the number! ");
    }
}





