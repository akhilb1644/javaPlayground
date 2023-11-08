public class Country {
   protected String countryName;
   protected Continent continent;

   public Country(String countryName,Continent continent) {
      this.countryName = countryName;
      this.continent = continent;
   }
   
   public String getCountryName() {
      return countryName;
   }
   
   public Continent getContinent() {
      return continent;
   }
   
   public String toString() {
      String dialogue = "Country Name: " + countryName + "\nContinent: " + continent;
      return dialogue;
   }
   
   public boolean equals(Country country) {
      boolean equal = false;
   
      if (countryName.equals(country.getCountryName())) {
         if (continent.compareTo(country.getContinent()) == 0) {
            equal = true;
         }
      }
      
      return equal;
   }
}