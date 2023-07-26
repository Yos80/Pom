package com.javaconcepts;

import java.util.Scanner;

public class KphToMph {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double minKph;
        double maxKph;
        double speedMph;
        double conversion = 0.614;

        System.out.println("Please enter minimum speed in KPH: ");
        minKph = scanner.nextDouble();

        System.out.println("Please enter maximum speed in KPH: ");
        maxKph = scanner.nextDouble();

        System.out.println("KPH          MPH");
        System.out.println("----------------");

        while (minKph <= maxKph) {
            speedMph = minKph * conversion;

            //2 decimal places
            String formattedString = String.format("%.02f", speedMph);
            System.out.println(minKph + "      " + formattedString);
            minKph += 10;
        }
        scanner.close();
    }
}

