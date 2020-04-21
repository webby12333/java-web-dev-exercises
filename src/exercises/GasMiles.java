package exercises;
import java.util.Scanner;

public class GasMiles {
    public static void main(String[] args) {
        double miles;
        double gas;
        double milesGas;

        Scanner inputMiles = new Scanner(System.in);
        System.out.println("How many miles have you driven? ");
        miles = inputMiles.nextDouble();

        Scanner inputGas = new Scanner(System.in);
        System.out.println("How much gas have you consumed (in gallons)? ");
        gas = inputGas.nextDouble();
        inputGas.close();

        milesGas = miles / gas;
        System.out.println("Miles per gallon: " + milesGas);
    }
}
