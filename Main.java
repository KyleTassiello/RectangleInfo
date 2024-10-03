import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int tankGallons = 0;
        double milePerGallon = 0;
        double pricePerGallon = 0;
        double milesTravelTank; // Tankgallons * milespergallon
        double cost100Miles; // (100 miles / milespergallon) * Price per gallon
        String trash;


        System.out.print("Enter the number of gallons of gas in the tank: ");

        if (in.hasNextInt())
        {
            tankGallons = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\n You must enter a valid integer for gallons of gas and not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }

        System.out.print("Enter the amount of miles you get per gallon: ");

        if (in.hasNextDouble())
        {
            milePerGallon = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\n You must enter a valid double for mpg and not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }

        System.out.print("Enter the price of gas per gallon: ");

        if (in.hasNextDouble())
        {
            pricePerGallon = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\n You must enter a valid double for price per gallon and not " + trash);
            System.out.println("Run the program again!");
            System.exit(0);
        }


        milesTravelTank = tankGallons * milePerGallon;
        cost100Miles = (100 / milePerGallon) * pricePerGallon;

        System.out.println("The cost for you to travel 100 miles would be $" + cost100Miles + " And you can travel " + milesTravelTank + " miles with the amount of gas you have in your car currently.");
    }
}