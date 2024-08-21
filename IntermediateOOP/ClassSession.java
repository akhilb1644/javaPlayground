package IntermediateOOP;

public class ClassSession extends Session {
	protected String leader; // could be teacher of professor
	
	public ClassSession(int population, String topic, String leader) {
		this.population = population;
		this.topic = topic;
		this.leader= leader;	
	}
	
	public String getLeader() {
		return leader;
	}
	
	public void setLeader(String leader) {
		this.leader = leader;
	}
}
