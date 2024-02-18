public class DictionaryWord <K,V> {
	private K entry;
	private V description;

	public DictionaryWord(K entry,V description) {
		this.entry = entry;
		this.description = description;
	}

	public K getEntry() {
		return entry;
	}

	public V getDescription() {
		return description;
	}

	// Setters with generic methods

	public void setEntry(K entry) {
		this.entry = entry;
	}

	public void setDescription(V description) {
		this.description = description;
	}

	public void printInfo() {
		System.out.println(entry + ": " + description);
	}
}