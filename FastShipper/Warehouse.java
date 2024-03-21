public class Warehouse extends Building {

	// Constructors
	
	public Warehouse() {
		super();
	}

	public Warehouse(short x,short y,City city) {
		super(city.getName() + " Warehouse",x,y,city);
	}

	// Copy Constructor

	public Warehouse(Warehouse warehouse) {
		super(warehouse);
	}
}