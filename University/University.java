public class University extends School {
   private final int MINIMUM_SAT_SCORE;
   private final int MINIMUM_ACT_SCORE;
   private final int MINIMUM_NUM_ACTIVITIES;
   private final int MINIMUM_NUM_HONORS;
   protected String mascot;

   public University(String name,State state,int minSat,int minAct,int minNumActivities,int minNumHonors,String mascot) {
      super(name,state);
      
      MINIMUM_SAT_SCORE = minSat;
      MINIMUM_ACT_SCORE = minAct;
      MINIMUM_NUM_ACTIVITIES = minNumActivities;
      MINIMUM_NUM_HONORS = minNumHonors;
      this.mascot = mascot;
   }
   
   public University(University university) {
      super(university.getName(),university.getState());
      
      MINIMUM_SAT_SCORE = university.getMinSat();
      MINIMUM_ACT_SCORE = university.getMinAct();
      MINIMUM_NUM_ACTIVITIES = university.getMinNumActivities();
      MINIMUM_NUM_HONORS = university.getMinNumHonors();
      mascot = university.getMascot();
   }
   
   public String getName() {
      return name;
   }
   
   public State getState() {
      return state;
   }
   
   public int getMinSat() {
      return MINIMUM_SAT_SCORE;
   }
   
   public int getMinAct() {
      return MINIMUM_ACT_SCORE;
   }
   
   public int getMinNumActivities() {
      return MINIMUM_NUM_ACTIVITIES;
   }
   
   public int getMinNumHonors() {
      return MINIMUM_NUM_HONORS;
   }
   
   public String getMascot() {
      return mascot;
   }
   
   public String toString() {
      String dialogue = "The name of the university is " + name + " and it is located in " + state + ". The mascot of the university is " + mascot + ".";
      return dialogue;
   }
   
   public boolean getAdmitted(Student student) {
      boolean admitted = false;
      // Need to copy the object below with the copy constructor in the Student's JAVA file to prevent security holes.
      Student labrat = new Student(student); // The lab rat just has to be admitted to university. Not too hard.
      Tests type = labrat.getTestType();
      
      if (labrat.getNumActivities() >= MINIMUM_NUM_ACTIVITIES) {
         if (labrat.getNumHonors() >= MINIMUM_NUM_HONORS) {
            if (labrat.getScore() >= MINIMUM_SAT_SCORE && type.compareTo(Tests.SAT) == 0) {
                  admitted = true;
            } else if (labrat.getScore() >= MINIMUM_ACT_SCORE && type.compareTo(Tests.ACT) == 0) {
                  admitted = true;
            }
         }
      }
      
      return admitted;
   }
}