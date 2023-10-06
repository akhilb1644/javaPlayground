import java.io.*;
import java.util.*;

/*
I would just like to say that if you want to run this code on your end, feel free to change the items in the inventory, but keep this same format:

Name
Price
Number available

Ex:
Couch
2000
12
*/

public class ItemDemo {
   public static void main(String[] args) throws IOException {
      String prefix = "temporaryRecipt";
      String filename;
      FileWriter permRecipt = new FileWriter("permanentRecipt.txt");
      PrintWriter totalRecipt = new PrintWriter(permRecipt);
      File file = new File("inventory.txt");
      Scanner inventory = new Scanner(file);
      ArrayList<Item> items = new ArrayList<>();
      ArrayList<Item> existingItems = new ArrayList<>();
      Scanner keyboard = new Scanner(System.in);
      
      String name;
      float price;
      float totalPrice = 0;
      int number;
      
      while(inventory.hasNext()) {
         name = inventory.nextLine();
         price = inventory.nextFloat();
         number = inventory.nextInt();
         
         items.add(new Item(name,price,number));
         
         if (inventory.hasNext()) {
            inventory.nextLine();
         }
         if (inventory.hasNext()) {
            inventory.nextLine();
         }
      }
      
      int attempt = 0;
      int choice;
      int quant;
      String repeat;
      
      do {
         attempt += 1;
         price = 0;
         filename = String.format("%s%d.txt",prefix,attempt);
         PrintWriter tempRecipt = new PrintWriter(filename);
         tempRecipt.printf("%-15s %-15s %s%n","Item","Quantity","Price");
         do {
            for (Item item: items) {
               if (item.getQuantity() > 0) {
                  existingItems.add(item);
               }
            }   
            System.out.println("Hello, welcome to the store! Pick out the item you would like.");
            for (int i=0;i<items.size();i++) {
               System.out.printf("%d) %s\n",i+1,existingItems.get(i).getName());
            }
            System.out.print("Which number would you like");
            choice = keyboard.nextInt();
            System.out.print("How many would you like");
            quant = keyboard.nextInt();
            existingItems.get(choice-1).takeSome(quant);
            keyboard.nextLine();
            tempRecipt.println(existingItems.get(choice-1).returnInformation(quant));
            System.out.print("Would you like to get another item?(Y for yes and any other key for no)");
            repeat = keyboard.nextLine();
            price += quant * existingItems.get(choice-1).getPrice();
         } while(repeat.equalsIgnoreCase("Y"));
         
         tempRecipt.println("------------------------------------------------");
         
         tempRecipt.printf("Total Price: $%,.2f%n",price);
         
         totalRecipt.printf("Total price for attempt %d is: $%,.2f%n",attempt,price);
         
         totalPrice += price;
         
         System.out.print("Would you like to complete another shopping session?(Y for yes and any other key for no)");
         repeat = keyboard.nextLine();
         
         tempRecipt.close();
      } while(repeat.equalsIgnoreCase("Y"));
      
      totalRecipt.close();
   }
}
