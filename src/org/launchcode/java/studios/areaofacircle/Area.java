package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double userInput = input.nextDouble();
        Double areaCircle = Circle.getArea(userInput);
        System.out.println("The area of a circle of radius " + userInput + " is: " + areaCircle);
        input.close();
    }
}
