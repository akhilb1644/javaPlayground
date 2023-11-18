public class Demo {
   public static void main(String[] args) {
      Student kuzma = new Student("Kuzma","Podlas",Tests.SAT,1560,4,4);
      Student yan = new Student("Yan","Gamarnik",Tests.ACT,34,4,3);
      University mu = new University("Marker University",State.WASHINGTON,1200,20,3,4,"Eagle"); 
      
      System.out.println(mu.getAdmitted(kuzma));
      System.out.println(mu.getAdmitted(yan));
      System.out.println(mu);
   }
}