package IntermediateOOP;

public class ClubSession extends Session {
	protected String setting;
	
	public ClubSession(int population, String topic, String setting) {
		this.population = population;
		this.topic = topic;
		this.setting = setting;
	}
	
	public String getSetting() {
		return setting;
	}
	
	public void setSetting(String setting) {
		this.setting = setting;
	}
}
