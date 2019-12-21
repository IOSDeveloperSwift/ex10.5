package com.Doloscan;

import java.util.Scanner;

public class For {

    static int integerPowerFor() {

        Scanner scr = new Scanner(System.in);
        System.out.println("---With For---");
        System.out.print("Enter base => ");
        int base = scr.nextInt();
        System.out.print("Enter exponent => ");
        int exponent = scr.nextInt();


        int sum = 0;

        for (int i = 0; i < exponent; i++) {
            sum += base;
        }

        System.out.println(sum);
        return sum;
    }
}
