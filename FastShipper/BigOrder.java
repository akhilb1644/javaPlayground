public class BigOrder<T extends Number> extends Order<T> {
	protected Warehouse start;
	protected Warehouse end;

	// Constructors

	public BigOrder(T value,T payment,City start,City end) {
		super(value,payment);
		this.start = start.getWarehouse();
		this.end = end.getWarehouse();
	}

	// Getters

	public Warehouse getStart() {
		return new Warehouse(start);
	}

	public Warehouse getEnd() {
		return new Warehouse(end);
	}

	// Setters

	public void setStart(City start) {
		this.start = start.getWarehouse();
	}

	public void setEnd(City end) {
		this.end = end.getWarehouse();
	}
}