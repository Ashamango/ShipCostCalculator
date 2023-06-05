import java.util.Scanner; // before the class at top of the file
public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Declare variables
        double shipping; // num shipping
        double totalCost; // num totalCost

        // Prompt and input
        System.out.print("Enter the price of the item:  "); // output "Enter the price of the item
        double price = in.nextDouble(); // num price

        if(price >= 100)
        {
            shipping = 0;
            totalCost = price + shipping;
            in.nextLine();
            System.out.print("The shipping cost is " + shipping + " dollars and the total cost is " + totalCost + " dollars.");
        }
        else
        {
            shipping = 0.02 * price;
            totalCost = shipping + price;
            in.nextLine();
            System.out.print("The shipping cost is " + shipping + " dollars and the total cost is " + totalCost + " dollars.");
        }
    }
}