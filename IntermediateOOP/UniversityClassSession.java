package IntermediateOOP;

public class UniversityClassSession extends ClassSession {
	protected String major;
	
	public UniversityClassSession (int population, String topic, String leader,String major) {
		super(population,topic,leader,EduSetting.UNIVERSITY);
		
		this.major = major;
	}
	
	final String getMajor() {
		return major;
	}
	
	final void setMajor(String major) {
		this.major = major;
	}
}
