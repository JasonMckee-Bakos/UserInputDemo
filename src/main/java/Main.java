import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variable declarations
        String mainFood;
        int mainQuantity;
        double mainPrice;
        double totalPrice;

        // initialize scanner object
        Scanner myScanner = new Scanner(System.in);

        // Prompt the user for food selection
        System.out.println("Enter your main food selection:");
        mainFood = myScanner.nextLine();
        System.out.println("You chose " + mainFood);

        // Prompt the user for the quantity of food selected
        System.out.println("Enter your quantity:");
        mainQuantity = myScanner.nextInt();
        myScanner.nextLine();
        System.out.println("You chose " + mainQuantity);

        // Prompt the user for the price of the food selected
        System.out.println("Enter the price:");
        mainPrice = myScanner.nextDouble();
        myScanner.nextLine();

        //  Calculate the total price of the meal
        totalPrice = mainPrice * mainQuantity;
        System.out.println("The total price is: " + totalPrice);

    }
}
