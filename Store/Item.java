import java.io.*;
import java.util.*;

public class Item {
   private String itemName;
   private float itemPrice;
   private int quantity;
   Scanner keyboard = new Scanner(System.in);

   public Item(String name,float price,int number) {
      itemName = name;
      itemPrice = price;
      quantity = number;
   }
   
   public String getName() {
      return itemName;
   }
   
   public float getPrice() {
      return itemPrice;
   }
   
   public int getQuantity() {
      return quantity;
   }
   
   public void takeSome(int requestedNumber) {
      while (requestedNumber > quantity) {
         System.out.printf("Please pick a number less than %d. ",quantity);
         requestedNumber = keyboard.nextInt();
      }
      
      quantity -= requestedNumber;
   }
   
   public String returnInformation(int quantity) {
      String dialogue;
      dialogue = String.format("%-15s %-15d $%.2f",itemName,quantity,itemPrice);
      return dialogue;
   }
}