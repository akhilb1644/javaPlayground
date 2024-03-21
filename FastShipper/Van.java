public class Van extends Vehicle {
	public Van() {
		super();
	}

	public Van(short fuelCapacity,byte milesPerGallon,int volume,int price) {
		super(fuelCapacity,milesPerGallon,volume,price);
	}

	@Override
	public String toString() {
		String info = "Type of Vehicle: Van\n";
		info += super.toString();
      
      return info;
	}
}