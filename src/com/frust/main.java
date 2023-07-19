package com.frust;

import java.util.Scanner;



public class main {
    public static void main(String[] args) {
        System.out.println("Plase add your your operation : ");
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();

        String[] array = new String[3];
        array = input.split("\s");
        String method = array[0];
        int num1 = Integer.parseInt(array[1]);
        int num2 = Integer.parseInt(array[2]);
    }
}