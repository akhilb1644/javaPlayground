public class UsefulNumber<N> {
	private N number;

	public UsefulNumber(N number) {
		this.number = number;
	}

	public int getHashCode() {
		return number.hashCode();
	}
}  