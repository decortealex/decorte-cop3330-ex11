/*
 * UCF COP3330 Summer 2021 Assignment 11 Solution
 * Copyright 2021 Alexander De Corte
 */

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        double c_to, c_from, rate;
        Scanner in = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        c_from = Double.parseDouble(in.nextLine());
        System.out.print("What is the exchange rate? ");
        rate = Double.parseDouble(in.nextLine());

        c_to = c_from * rate;

        System.out.printf("%.2f euros at an exchange rate of %f is\n%.2f U.S. dollars.", c_from, rate, c_to);
    }
}
