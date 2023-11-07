public class Food {
   protected String name;
   protected FoodGroup foodGroup;
   protected int calories;
   protected int id;

   public Food(String name,FoodGroup foodGroup,int calories,int id) {
      this.name = name;
      this.foodGroup = foodGroup;
      this.calories = calories;
      this.id = id;
   }
   
   public String getName() {
      return name;
   }
   
   public FoodGroup getFoodGroup() {
      return foodGroup;
   }
   
   public int getCalories() {
      return calories;
   }
   
   public int getID() {
      return id;
   }
   
   public String toString() {
      String dialogue = "Name: " + name + "\nFood Group: " + foodGroup + "\nCalories: " + calories;
      return dialogue;
   }
   
   public boolean equals(Food food) {
      boolean equal = false;
      
      if (name.equals(food.getName())) {
         if (foodGroup.compareTo(food.getFoodGroup()) == 0) {
            if (calories == food.getCalories()) {
               if (id == food.getID()) {
                  equal = true;
               }
            }
         }
      }
      
      return equal;
   }
   
   public void printFeeling(String taste) {
      System.out.print(name + " tastes " + taste + ".");
   }
}