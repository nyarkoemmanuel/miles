import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner manuel= new Scanner(System.in);

        double milesDriven, gallonGas, mpg;



        System.out.println("Enter the number of miles driven");
        milesDriven = manuel.nextDouble();

        System.out.println("Enter the number of gallons used");
        gallonGas= manuel.nextDouble();

        mpg= milesDriven/ gallonGas;
        System.out.println("Your car's miles per gallon is   "   + mpg);


    }

}
