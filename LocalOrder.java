public class LocalOrder<T extends Number> extends Order<T> {
	protected String start;
	protected String end;

	// Constructors

	public LocalOrder(T value,T payment,String start,String end) {
		super(value,payment);
		this.start = start;
		this.end = end;
	}

	// Getters

	public T getValue() {
		return super.getValue();
	}

	public String getStart() {
		return start;
	}

	public String getEnd() {
		return end;
	}
}