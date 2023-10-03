public class GenSec {
   private String firstName;
   private String lastName;
   private int birthYear;
   private int deathYear;

   public GenSec(String fName,String lName,int byear,int dyear) {
      firstName = fName;
      lastName = lName;
      birthYear = byear;
      deathYear = dyear;
   }
   
   private int calculateAge() {
      return (deathYear - birthYear);
   }
   
   public void printInformation() {
      System.out.printf("\nComrade %s %s was born in %d and died in %d. He lived for ~%d years.",firstName,lastName,birthYear,deathYear,calculateAge());
   }
}