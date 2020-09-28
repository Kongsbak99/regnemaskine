package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b;

        System.out.println("Skriv hvilken type regnestykke du vil lave her:");
        System.out.println("+ = plus");
        System.out.println("- = minus");
        System.out.println("* = gange");
        System.out.println("/ = division");

        Scanner input = new Scanner(System.in);

        String x = input.next();




    if (x.equals("+")) {
        a = input.nextInt();
        b = input.nextInt();
            System.out.print(a);
            System.out.print(" + ");
            System.out.print(b);
            System.out.print(" = ");
            System.out.println(a + b);
        } else if(x.equals("-")) {
        a = input.nextInt();
        b = input.nextInt();
            System.out.print(a);
            System.out.print(" - ");
            System.out.print(b);
            System.out.print(" = ");
            System.out.println(a - b);
        } else if(x.equals("*")) {
        a = input.nextInt();
        b = input.nextInt();
            System.out.print(a);
            System.out.print(" * ");
            System.out.print(b);
            System.out.print(" = ");
            System.out.println(a * b);
        } else if(x.equals("/")) {
        a = input.nextInt();
        b = input.nextInt();
            System.out.print(a);
            System.out.print(" / ");
            System.out.print(b);
            System.out.print(" = ");
            System.out.println(a / b);
        } else {
            System.out.println("Du valgte ikke et gyldigt tegn.");
        }
    }
}
