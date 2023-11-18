public class College extends University {
   private final int MINIMUM_SAT_SCORE;
   private final int MINIMUM_ACT_SCORE;
   private final int MINIMUM_NUM_ACTIVITIES;
   private final int MINIMUM_NUM_HONORS;
   private String name;
   private University university;
   
   public College(University university,String name,int minSat,int minAct,int minActivities,int minHonors) {
      super(university.getName(),university.getState(),university.getMinSat(),university.getMinAct(),university.getMinNumActivities(),university.getMinNumHonors(),university.getMascot());
   
      MINIMUM_SAT_SCORE = minSat;
      MINIMUM_ACT_SCORE = minAct;
      MINIMUM_NUM_ACTIVITIES = minActivities;
      MINIMUM_NUM_HONORS = minHonors;
      this.name = name;
      this.university = new University(university);
   }
   
   public String toString() {
      String dialogue = "The name of the college is " + name + " and it is a part of the university " + university.getName();
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