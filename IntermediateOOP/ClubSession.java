package IntermediateOOP;

public class ClubSession extends Session {
	protected String setting; // can be any type of setting
	
	public ClubSession(int population, String topic, String setting) {
		this.population = population;
		this.topic = topic;
		this.setting = setting;
	}
	
	final String getSetting() {
		return setting;
	}
	
	final void setSetting(String setting) {
		this.setting = setting;
	}
}
