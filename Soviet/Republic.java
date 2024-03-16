public class Republic extends Subdivision {
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

	public Type getRepublicType() {
		return republicType;
	}

	public void setRepublicType(Type republicType) {
		this.republicType = republicType;
	}
}