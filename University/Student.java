public class Student {
   private String name;
   private Tests testType;
   private int score;
   private int numHonors;
   private int numActivities;

   public Student(String firstName,String lastName,Tests test,int score,int honors,int activities) {
      name = firstName + " " + lastName;
      testType = test;
      this.score = score;
      numHonors = honors;
      numActivities = activities;
   }
   
   public Student(Student student) {
      name = student.getName();
      testType = student.getTestType();
      score = student.getScore();
      numHonors = student.getNumHonors();
      numActivities = student.getNumActivities();
   }
   
   public String getName() {
      return name;
   }
   
   public Tests getTestType() {
      return testType;
   }
   
   public int getScore() {
      return score;
   }
   
   public int getNumHonors() {
      return numHonors;
   }
   
   public int getNumActivities() {
      return numActivities;
   }
}