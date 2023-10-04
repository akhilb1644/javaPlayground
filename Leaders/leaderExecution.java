import java.util.*;
import java.io.*;

public class leaderExecution {
   public static void main(String[] args) throws IOException {
      PrintWriter file = new PrintWriter("leaderList.txt");
      Scanner input = new Scanner(System.in);
      String fname;
      String lname;
      String country;
      int byear;
      int dyear;
      Leader chosenOne;
      String another;
      
      while (true) {
         System.out.print("Hello, what is the first name of the leader you would like to put in?");
         fname = input.nextLine();
         System.out.print("Last name?");
         lname = input.nextLine();
         System.out.print("Year of birth?");
         byear = input.nextInt();
         System.out.print("Year of death?");
         dyear = input.nextInt();
         input.nextLine();
         System.out.print("Country of origin?");
         country = input.nextLine();
         
         chosenOne = new Leader(fname,lname,country,byear,dyear);
         file.println(chosenOne.returnDialogue());
         
         do {
            System.out.print("Would you like to try again(Y=yes;N=no)?");
            another = input.nextLine();
         } while(!another.equalsIgnoreCase("Y") && !another.equalsIgnoreCase("N"));
         
         if (another.equalsIgnoreCase("N")) {
            break;
         }
      }
      
      file.close();
   }
}