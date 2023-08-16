import java.util.Scanner;

class FakeWay {
   public static void main(String[] args) {
      float price = 0;
      String name;
      int firstChoice;
      String choice1 = "";
      int secondChoice;
      String choice2 = "";
      int thirdChoice;
      String choice3 = "";
      boolean repeat = true;
      int choice;
      final double taxRate = 0.0725;
      float tax;
      float tipRate;
      float tip;
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Hello customer! What is your name? ");
      keyboard.nextLine();
   
      do {
         do {
            System.out.print("Which of the following would you like(Choose with the number):\n\t1. Tortilla($7.95)\n\t2. Baguette($9.95)\n");
            firstChoice = keyboard.nextInt();
            if (firstChoice < 1 || firstChoice > 2) {
               System.out.println("PLEASE PUT IN A VALID NUMBER.");
            } else {
               switch (firstChoice) {
                  case 1:
                     choice1 = "Tortilla";
                     price += 7.95;
                  case 2:
                     choice1 = "Baguette";
                     price += 9.95;
               }
            }
         } while (firstChoice < 1 || firstChoice > 2);
      
         do {
            System.out.print("Which of the following would you like on your " + choice1 + "(Choose with the number):\n\t1. Bacon($9.55)\n\t2. Chicken($11.55)\n\t3. Fake Chicken from the lab($0.99)\n");
            secondChoice = keyboard.nextInt();
            if (secondChoice < 1 || secondChoice > 3) {
               System.out.println("PLEASE PUT IN A VALID NUMBER.");
            } else {
               switch (secondChoice) {
                  case 1:
                     choice2 = "Bacon";
                     price += 9.55;
                  case 2:
                     choice2 = "Chicken";
                     price += 11.55;
                  case 3:
                     choice2 = "Fake Chicken from the lab";
                     price += 0.99;
               }
            }
         } while (secondChoice < 1 || secondChoice > 3);
         
         do {
            System.out.print("Which of the following would you like with your " + choice1 + " and " + choice2 + "(Choose with number):\n\t1. Ketchup($0.99)\n\t2. Mayo($0.79)\n\t3. Mustard($1.12)\n");
            thirdChoice = keyboard.nextInt();
            if (thirdChoice < 1 || thirdChoice > 3) {
               System.out.println("PLEASE PUT IN A VALID NUMBER.");
            } else {
               switch (thirdChoice) {
                  case 1:
                     choice3 = "Ketchup";
                     price += 0.99;
                  case 2:
                     choice3 = "Mayo";
                     price += 0.79;
                  case 3:
                     choice3 = "Mustard";
                     price += 1.12;
               }
            }
         } while (thirdChoice < 1 || thirdChoice > 3);
         
         System.out.println("Your final order is " + choice1 + " with " + choice2 + " with " + choice3);
         System.out.printf("Subtotal: $%,.2f \n", price);
         tax = (float)taxRate * price;
         System.out.printf("Tax: $%,.2f \n", tax);
         
         do {
            System.out.print("What percent tip would you like to give to the waiter(please put it in decimal form)?");
            tipRate = keyboard.nextFloat();
            if (tipRate < 0) {
               System.out.println("Please enter a valid tip rate.");
            }
         } while (tipRate < 0);
         
         tip = tipRate * price;
         System.out.printf("Tip: $,.2f \n", tip);
         price = tip + price + tax;
         System.out.printf("Your Grand Total is $%,.2f \n", price);
         do {
            System.out.print("Would you like to make another order(0 for no, 1 for yes)");
            choice = keyboard.nextInt();
            if (choice != 0 && choice != 1) {
               System.out.println("PLEASE PUT IN A VALID CHOICE");
            } else {
               if (choice == 0) {
                  repeat = false;
               }
            }
         } while (choice != 0 && choice != 1);
      } while (repeat == true);
   }
}