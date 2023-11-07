public class Dog extends Animal {
   private String breed;
   private Color color;

   public Dog(String name,int age,int offspringNum,String breed,Color color) {
      super(name,"Canis","Familiaris",age,offspringNum);
      
      this.breed = breed;
      this.color = color;
   }
   
   public String getBreed() {
      return breed;
   }
   
   public Color getColor() {
      return color;
   }
   
   public boolean equals(Dog dog) {
      boolean equal = false;
   
      if (name.equals(dog.getName())) {
         if (breed.equals(dog.getBreed())) {
            if (color.compareTo(dog.getColor()) == 0) {
               if (age == dog.getAge()) {
                  if (offspringNum == dog.getOffspringNum()) {
                     equal = true;
                  }
               }
            }
         }
      }
      
      return equal;
   }
   
   public String toString() {
      String dialogue = "Name: " + name + "\n" + "Breed: " + breed + "\n" + "Color: " + color + "\n" + "Age: " + age + "\n" + "Number of Offspring: " + offspringNum;
      
      return dialogue;
   }
   
   public void flip() {
      System.out.println(name + " has flipped.");
   }
}