package IntermediateOOP;

abstract class Session {
	protected int population; // refers to number of students
	protected String topic; // subject, such as "Biology", "Golfing"(like a Golfing club), or "Intro to News Editing"
	
	final int getPopulation() {
		return population;
	}
	
	final String getTopic() {
		return topic;
	}
	
	final void setPopulation(int p) {
		population = p;
	}
	
	final void setTopic(String t) {
		topic = t;
	}
}
