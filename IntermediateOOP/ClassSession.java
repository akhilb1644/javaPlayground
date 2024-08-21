package IntermediateOOP;

public class ClassSession extends Session {
	protected String leader; // could be teacher of professor
	
	public ClassSession(String leader) {
		this.leader= leader;	
	}
	
	public String getLeader() {
		return leader;
	}
	
	public void setLeader(String leader) {
		this.leader = leader;
	}
}
