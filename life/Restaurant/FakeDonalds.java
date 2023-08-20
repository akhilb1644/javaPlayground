import java.util.Scanner;

class FakeDonalds {
   public static void main(String[] args) {
      float price = 0;
      double str = 0.0725; // str stands for sales tax rate
      float salesTaxRate = (float)str;
      Scanner keyboard = new Scanner(System.in);
      int j;
      int choice;
      float tip;
      String[] menuItems = {"Omlette","Chicken Nuggets","French Fries","Sandwich","Chips"};
      double[] prices = {3.25,5.67,5.90,9.87,2.14};
      System.out.print("Hello! What is your name? ");
      String name = keyboard.nextLine();
      int again = 1;
      String loop;
      do {
         do {
            System.out.println("The following are options on the menu, please pick a number to order.");
            for (int i=0;i<5;i++) {
               j = i + 1;
               System.out.println(j +". "+ menuItems[i]);
            }
            System.out.print("Pick a number from above: ");
            choice = keyboard.nextInt();
            if (choice < 1 || choice > 5) {
               System.out.println("\nPlease enter a valid choice\n");
            }
         } while (choice < 1 || choice > 5);
         System.out.print("How many units of " + menuItems[choice] + " would you like to order.");
         int units = keyboard.nextInt();
         price += (double)prices[choice] * units;
         System.out.printf("The current price of your order is $%,.2f \n", price);
         // The important part of the loop is below
         do {
            System.out.println("Would you like to order more(Y/N)? ");
            loop = keyboard.nextLine();
            loop.toUpperCase();
            if (!(loop.equals("Y") || loop.equals("N"))) {
               System.out.println("\nPlease enter a valid choice, which is Y or N\n");
            }
         } while (!(loop.equals("Y") || loop.equals("N")));
      } while (loop.equals("Y"));
      do {
         System.out.print("Would you like to add a tip(enter percent in decimal form, if you don't want to, enter zero).");
         tip = keyboard.nextFloat();
         if (tip < 0) {
            System.out.println("PLEASE ENTER A TIP IN VALID DECIMAL FORM. NO NEGATIVE NUMBERS.");
         }
      } while (tip < 0);
      System.out.printf("Subtotal: $%,.2f\n",price);
      float tax = salesTaxRate * price;
      System.out.printf("Sales Tax: $%,.2f\n",tax);
      price += tax;
      price += price * tip;
      System.out.printf("Tip amount: $%,.2f\n",price*tip);
      System.out.printf("Total: $%,.2f\n",price); 
   }
}