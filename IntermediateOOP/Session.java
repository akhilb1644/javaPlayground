package IntermediateOOP;

abstract class Session {
	protected int population; // refers to number of students
	protected String topic; // subject, such as "Biology", "Golfing"(like a Golfing club), or "Intro to News Editing"
	
	public int getPopulation() {
		return population;
	}
	
	public String getTopic() {
		return topic;
	}
	
	public void setPopulation(int p) {
		population = p;
	}
	
	public void setTopic(String t) {
		topic = t;
	}
}
