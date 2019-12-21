package com.Doloscan;

import java.util.Scanner;

public class While {

    static int integerPowerWhile() {

        Scanner scr = new Scanner(System.in);
        System.out.println("\n---Whith While---");
        System.out.print("Enter base => ");
        int base = scr.nextInt();
        System.out.print("Enter exponent => ");
        int exponent = scr.nextInt();

        int sum = 0;
        int i = 0;

        while (i < exponent){
            i++;
            sum += base;
        }

        System.out.println(sum);
        return sum;
    }
}
