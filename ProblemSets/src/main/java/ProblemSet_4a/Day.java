package ProblemSet_4a;

public class Day {

	private String day;
	private String module;
	private int startTime;
	private int endTime;

	public Day(String newDay) {
		day = newDay;
	}

	public String getName() {
		return day;
	}

	public void setSession(int i, String newModule, int newStartTime, int newEndTime) {
		module = newModule;
		startTime = newStartTime;
		endTime = newEndTime;
	}

	public String getSessions(int i) {
		return null;
	}

}
