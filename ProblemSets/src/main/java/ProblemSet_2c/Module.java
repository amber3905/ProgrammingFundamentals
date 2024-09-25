package ProblemSet_2c;

import java.util.ArrayList;
import java.util.List;

public class Module {

    private String moduleName;
    private List<Assessment> assessments;

    public Module(Assessment assessment1, Assessment assessment2, Assessment assessment3) {
        this.moduleName = "COM1027";
        assessments = new ArrayList<>();
        assessments.add(assessment1);
        assessments.add(assessment2);
        assessments.add(assessment3);
    }

    public double calculateAverage() {
        double total = 0;
        for (Assessment assessment : assessments) {
            total += assessment.getMark();
        }
        return total / assessments.size();
    }


    public String toString() {
        return String.format("%s (%.1f%%)", moduleName, calculateAverage());
    }
}
