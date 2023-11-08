public class Subdivision extends Country {
   private String subdivisionName;
   
   public Subdivision(String subdivisionName,Country country) {
      super(country.getCountryName(),country.getContinent());
      this.subdivisionName = subdivisionName;
   }
   
   public String getSubdivisionName() {
      return subdivisionName;
   }
   
   public String toString() {
      String dialogue = "Country Name: " + countryName + "\nContinent: " + continent + "\nSubdivision Name: " + subdivisionName;
      return dialogue;
   }
   
   public boolean equals(Subdivision subdivision) {
      boolean equal = false;;
      
      if (countryName.equals(subdivision.getCountryName())) {
         if (continent.compareTo(subdivision.getContinent()) == 0) {
            if (subdivisionName.equals(subdivision.getSubdivisionName())) {
               equal = true;
            }
         }
      }
      
      return equal;
   }
}