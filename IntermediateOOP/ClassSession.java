package IntermediateOOP;

import java.util.Scanner;

public class ClassSession extends Session {
	protected String leader; // could be teacher of professor
	protected EduSetting setting;
	
	public ClassSession(int population, String topic, String leader,EduSetting setting) {
		this.population = population;
		this.topic = topic;
		this.leader= leader;
		this.setting = setting;
	}
	
	public ClassSession() {
		this.population = 0;
		this.topic = "";
		this.leader = "";
		this.setting = EduSetting.OTHER_SCHOOL;
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
	
	protected static Session makeObject() {
		Scanner k = new Scanner(System.in);
		ClassSession cs = new ClassSession();
		String s;
		int i;
		
		System.out.print("What is the population of this session? ");
		i = k.nextInt();
		cs.setPopulation(i);
		
		System.out.print("What is the topic of this session ");
		s = k.nextLine();
		cs.setTopic(s);
		
		k.nextLine();
		
		System.out.print("Who is the leader of this session? ");
		s = k.nextLine();
		cs.setLeader(s);
		
		System.out.print("What is the setting of the session, pick from the below options? ");
		// Add options below based off of enum
		
		return cs;
	}
}
