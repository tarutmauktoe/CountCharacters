package org.launchcode.java.studios;

//import System.out.*;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        System.out.print("Enter a radius:");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        //Double r = Double(radius);
        double pi = 3.14;
        double area = pi * r * r;

        System.out.print("The area of a circle of radius " + r + " is: " + area);
    }
}
