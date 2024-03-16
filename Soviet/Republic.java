public class Republic implements Subdivision {
	protected Type republicType;
	protected String name;

	public Republic() {
		name = "";
		this.republicType = Type.UNION;
	}

	public Republic(String name,Type republicType) {
		this.name = name;
		this.republicType = republicType;
	}

	public Republic(Republic r) {
		name = r.getName();
		republicType = r.getRepublicType();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getRepublicType() {
		return republicType;
	}

	public void setRepublicType(Type republicType) {
		this.republicType = republicType;
	}
}