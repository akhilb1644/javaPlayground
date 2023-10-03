import java.io.*;
import java.util.*;

public class people {
   public static void main(String[] args) throws IOException {
      File file = new File("gensec.txt");
      Scanner fileInfo = new Scanner(file);
      ArrayList<GenSec> gensecretaries = new ArrayList<>();
      
      String fname;
      String lname;
      int byear;
      int dyear;
      
      while (fileInfo.hasNext()) {
         fname = fileInfo.nextLine();
         lname = fileInfo.nextLine();
         byear = fileInfo.nextInt();
         dyear = fileInfo.nextInt();
         
         gensecretaries.add(new GenSec(fname,lname,byear,dyear));
         
         if (fileInfo.hasNext()) {
            fileInfo.nextLine();
         } 
         if (fileInfo.hasNext()) {
            fileInfo.nextLine();
         }
      }
      
      for (GenSec gensecretary: gensecretaries) {
         gensecretary.printInformation();
      }
   }
}