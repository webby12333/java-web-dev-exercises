package exercises;
import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        double length;
        double width;
        double areaTriangle;
        Scanner inputL;
        Scanner inputW;

        inputL = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        length = inputL.nextDouble();
//        System.out.println("Length is " + length);
//        inputL.close();

        inputW = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        width = inputW.nextDouble();
//        System.out.println("Width is " + width);
        inputW.close();
        areaTriangle = width * length;
        System.out.println("Area of triangle is " + areaTriangle);
    }
}
