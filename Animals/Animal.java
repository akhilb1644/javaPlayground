public class Animal {
   protected String name;
   protected String genus;
   protected String species;
   protected int age;
   protected int offspringNum;

   public Animal(String name,String genus,String species,int age,int offspringNum) {
      this.name = name;
      this.genus = genus;
      this.species = species;
      this.age = age;
      this.offspringNum = offspringNum;
   }
   
   public String getName() {
      return name;
   }
   
   public String getGenus() {
      return genus;
   }
   
   public String getSpecies() {
      return species;
   }
   
   public int getAge() {
      return age;
   }
   
   public int getOffspringNum() {
      return offspringNum;
   }
   
   public boolean equals(Animal animal) {
      boolean equals = false;
      
      if (name.equals(animal.getName())) {
         if (genus.equals(animal.getGenus())) {
            if (species.equals(animal.getSpecies())) {
               if (age == animal.getAge()) {
                  if (offspringNum == animal.getOffspringNum()) {
                     equals = true;
                  }
               }
            }
         }
      }
      
      return equals;
   }
   
   public String toString() {
      String dialogue = "Name: " + name + "\n" + "Genus: " + genus + "\n" + "Species: " + species + "\n" + "Age: " + age + "\n" + "Number of Offspring: " + offspringNum;
      
      return dialogue;
   }
}