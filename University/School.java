public abstract class School {
   protected String name;
   protected State state;

   public School(String name,State state) {
      this.name = name;
      this.state = state;
   }
   
   public String toString() {
      String dialogue = name + " is in the state of " + state;
      return dialogue;
   }
   
   public abstract boolean getAdmitted(Student student);
}