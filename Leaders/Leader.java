public class Leader {
   private String firstName;
   private String lastName;
   private int birthYear;
   private int deathYear;
   private String originCountry;
   
   public Leader(String fname, String lname, String country, int byear, int dyear) {
      firstName = fname;
      lastName = lname;
      originCountry = country;
      birthYear = byear;
      deathYear = dyear;
   }
   
   public String returnDialogue() {
      String dialogue;
      dialogue = String.format("%s %s was born in %s in the year %d and died in %d.",firstName,lastName,originCountry,birthYear,deathYear);
      return dialogue;
   }
}