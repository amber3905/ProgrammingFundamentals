package ProblemSet_2c;

import java.util.ArrayList;
import java.util.List;

public class Module {

    private String moduleName;
    private List<Assessment> assessments;

    public Module(Assessment... assessments) {
        this.assessments = new ArrayList<>();
        for (Assessment assessment : assessments) {
            this.assessments.add(assessment);
        }
        this.moduleName = "COM1027";
    }

    public double calculateAverage() {
        double total = 0;
        for (Assessment assessment : assessments) {
            total += assessment.getMark();
        }
        return assessments.isEmpty() ? 0 : total / assessments.size();
    }

    public String toString() {
        return moduleName + " (" + String.format("%.1f", calculateAverage()) + "%)";
    }
}
