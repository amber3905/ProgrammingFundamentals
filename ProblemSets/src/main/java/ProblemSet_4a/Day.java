package ProblemSet_4a;

public class Day {

	private String day;
	private Session[] sessions;

	public Day(String day) {
		this.day = day;
		this.sessions = new Session[4];
	}

	public String getName() {
		return day;
	}

    public void setSession(int index, String sessionName, int startTime, int endTime) {
        if (index >= 0 && index < sessions.length) {
            sessions[index] = new Session(sessionName, startTime, endTime);
        } else {
            System.out.println("Index out of bounds. Session not added.");
        }
    }

    public Session getSessions(int index) {
        if (index >= 0 && index < sessions.length) {
            return sessions[index];
        }
        return null;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Session session : sessions) {
            if (session != null) {
                result.append(session.toString()).append("\n");
            }
        }
        return result.toString();
    }

    public void display() {
        System.out.println(this.toString());
    }
}
