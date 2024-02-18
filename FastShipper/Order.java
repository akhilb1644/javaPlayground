public abstract class Order<T extends Number> {
	protected T value;
	protected T payment;

	// Constructors
	
	public Order(T value,T payment) {
		this.value = value;
		this.payment = payment;
	}

	// Getters
	
	public T getValue() {
		return value;
	}

	public T getPayment() {
		return payment;
	}

	// Setters

	public void setValue(T value) {
		this.value = value;
	}

	public void setPayment(T payment) {
		this.payment = payment;
	}
}