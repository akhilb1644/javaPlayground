public class UsefulNumber<N extends Number> { // bounded type parameters
	private N number;

	public UsefulNumber(N number) {
		this.number = number;
	}

	public void printInfo() {
		System.out.println(number);
	}

	public int getHashCode() {
		return number.hashCode();
	}
}  