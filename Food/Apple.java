public class Apple extends Food {
   public Apple(int id) {
      super("Apple",FoodGroup.FRUIT,95,id);
   }
   
   public void printFeeling() {
      super.printFeeling("apple like");
   }
}