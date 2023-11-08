public class Demo {
   public static void main(String[] args) {
      Country china = new Country("People's Republic of China",Continent.ASIA);
      Subdivision amur = new Subdivision("Heilongjiang",china); 
      /*
      Amur River is called Heilongjiang River in China, and thus the name of the province being on the Chinese side of the Amur(unless the Chinese annex Amur Oblast and add that to Heilongjiang province)
      */
      System.out.println(china + "\n");
      System.out.println(amur+"\n");
      
      Country tajikistan = new Country("Republic of Tajikistan",Continent.ASIA);
      Subdivision gb = new Subdivision("Gorno Badakshan",tajikistan);
      
      Alliance pamiri = new Alliance("Pamiri Cooperation Pact",tajikistan,china);
      pamiri.printCountries();
   }
}