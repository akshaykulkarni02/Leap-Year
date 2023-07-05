package com.akshay.allprograms.leapyear;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year = scanner.nextInt();

        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)){
            System.out.println(year + " year is Leap Year..!!");
        }
        else {
            System.out.println(year + " year is Not Leap Year");
        }
    }
}
