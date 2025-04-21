package asst;
import java.util.Scanner;

public class gamestore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        String[] games = {
            "Call of Warfare",
            "Speed Racers",
            "Mystery Mansion",
            "Pixel Adventure",
            "Puzzle Mania"
        };

        int[] prices = {1500, 1200, 1000, 800, 500};
        int[] cart = new int[5];

        int choice;

       
        do {
            System.out.println("Welcome to the Game Store!");
            System.out.println("Please select a game to purchase:");
            for (int i = 0; i < games.length; i++) {
                System.out.println((i + 1) + ". " + games[i] + " - ₹" + prices[i]);
            }
            System.out.println("6. Checkout / Exit");

            System.out.print("Enter your choice (1-6): ");
            choice = sc.nextInt();

            // If choice is valid
            if (choice >= 1 && choice <= 5) {
                System.out.print("How many copies of \"" + games[choice - 1] + "\" would you like to buy? ");
                int qty = sc.nextInt();

                if (qty > 0) {
                    cart[choice - 1] += qty;
                    System.out.println("Game(s) added to your cart!");
                } else {
                    System.out.println("Quantity must be more than 0.");
                }
            }

         
            else if (choice == 6) {
                int total = 0;
                System.out.println("\n🛒 Checkout Summary:");
                for (int i = 0; i < cart.length; i++) {
                    if (cart[i] > 0) {
                        int cost = cart[i] * prices[i];
                        total += cost;
                        System.out.println(games[i] + " x " + cart[i] + " = ₹" + cost);
                    }
                }
                System.out.println("Total Cost: ₹" + total);
                System.out.println("Thank you for shopping with us!");
            }

       
            else {
                System.out.println("Invalid choice. Please select a number from 1 to 6.");
            }

        } while (choice != 6);

      
    }
}
