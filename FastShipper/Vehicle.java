abstract class Vehicle {
	protected short fuelCapacity;
	protected byte milesPerGallon;
	protected short maxHeight;
	protected short maxLength;
	protected short maxWidth;
	protected int price;
	protected Insurance insurance;

	public Vehicle() {
		fuelCapacity = 0;
		milesPerGallon = 0;
		maxHeight = 0;
		maxLength = 0;
		maxWidth = 0;
		price = 0;
	}

	public Vehicle(short fuelCapacity,byte milesPerGallon,short maxHeight,short maxLength,short maxWidth,int price) {
		this.fuelCapacity = fuelCapacity;
		this.milesPerGallon = milesPerGallon;
		this.maxHeight = maxHeight;
		this.maxLength = maxLength;
		this.maxWidth = maxWidth;
		this.price = price;
	}
	
	abstract void modify();
}