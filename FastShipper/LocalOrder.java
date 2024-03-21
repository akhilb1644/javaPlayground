public class LocalOrder<T extends Number> extends Order<T> {
	protected Building start;
	protected Building end;

	// Constructors

	public LocalOrder(T value,T payment,Building start,Building end) {
		super(value,payment);
		this.start = new Building(start);
		this.end = new Building(end);
	}

	// Getters

	public Building getStart() {
		return new Building(start);
	}

	public Building getEnd() {
		return new Building(end);
	}

	// Setters

	public void setStart(Building start) {
		this.start = new Building(start);
	}

	public void setEnd(Building end) {
		this.end = new Building(end);
	}
   
   // Other
   
   @Override
   public String toString() {
      String info = super.toString();
      info += "Start: " + start;
      info += "End: " + end;
      
      return info;
   }
}