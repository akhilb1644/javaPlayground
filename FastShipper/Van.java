public class Van extends Vehicle {
	public Van() {
		super();
	}

	public Van(short fuelCapacity,byte milesPerGallon,short maxHeight,short maxLength,short maxWidth,int price) {
		super(fuelCapacity,milesPerGallon,maxHeight,maxLength,maxWidth,price);
	}

	@Override
	public void modify() {
		; // edit this later and add more code
	}
}