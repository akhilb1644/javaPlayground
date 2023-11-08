import java.util.ArrayList;

public class Alliance {
   private ArrayList<Country> countries = new ArrayList<Country>();
   private String allianceName;

   public Alliance(String name,Country... countries) {
      allianceName = name;
      for (Country country: countries) {
         this.countries.add(country);
      }
   }
   
   public void printCountries() {
      System.out.printf("The countries of the %s are: \n------------------------------------------------------------------------\n",allianceName);
      for (Country country: countries) {
         System.out.println(country + "\n");
      }
   }
}