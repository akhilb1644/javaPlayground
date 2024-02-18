public class LessMemoryNumber<T extends Number> { // classes always come before interfaces

/*
<T extends "class" & "Interface">

The object must fit all conditions
*/
	private T number;

	public LessMemoryNumber(T number) {
		this.number = number;
	}

	public int giveTheHash() {
		return number.hashCode();
	}
}