public class Demo {
   public static void main(String[] args) {
      Dog anupet = new Dog("Anu II",12,2,"Golden Retriever",Color.YELLOW);
      System.out.println(anupet.getBreed());
      Dog akhipet = new Dog("Anu II",12,2,"Golden Retriever",Color.YELLOW);
      System.out.println(akhipet.equals(anupet));
      
      anupet.flip();
      System.out.print("\n");
      System.out.print(akhipet);
   }
}