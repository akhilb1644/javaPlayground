public class Plane extends Vehicle {
	public Plane() {
		super();
	}

	public Plane(short fuelCapacity,byte milesPerGallon,short maxHeight,short maxLength,short maxWidth,int price) {
		super(fuelCapacity,milesPerGallon,maxHeight,maxLength,maxWidth,price);
	}

	@Override
	public void modify() {
		; // Fill in something later	
	}
}