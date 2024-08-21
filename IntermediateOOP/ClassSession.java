package IntermediateOOP;

public class ClassSession extends Session {
	protected String leader; // could be teacher of professor
	protected EduSetting setting;
	
	public ClassSession(int population, String topic, String leader,EduSetting setting) {
		this.population = population;
		this.topic = topic;
		this.leader= leader;
		this.setting = setting;
	}
	
	final String getLeader() {
		return leader;
	}
	
	final void setLeader(String leader) {
		this.leader = leader;
	}
	
	final EduSetting getSetting() {
		return setting;
	}
	
	final void setSetting(EduSetting setting) {
		this.setting = setting;
	}
}
