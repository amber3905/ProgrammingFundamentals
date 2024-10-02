package ProblemSet_4c;

public class Student {
    private char initial;
    private String surname;
    private Module[] modules;

    public Student(char initial, String surname) {
        this.initial = initial;
        this.surname = surname;
        this.modules = new Module[8];
    }

    public void setModules(int index, String code, double average) {
        if (index >= 0 && index < modules.length) {
            modules[index] = new Module(code, average);
        } else {
            System.out.println("Index out of bounds: " + index);
        }
    }

    public void setModules(int index, Module module) {
        if (index >= 0 && index < modules.length) {
            modules[index] = module;
        } else {
            System.out.println("Index out of bounds: " + index);
        }
    }

    public Module getModules(int index) {
        if (index >= 0 && index < modules.length) {
            return modules[index];
        }
        return null;
    }

    public String displayArray() {
        StringBuilder output = new StringBuilder();
        for (Module module : modules) {
            if (module != null) {
                output.append(module.toString()).append("\n");
            }
        }
        output.append(String.format("Year Average: %.0f%%",
        		calculateYearAverage()));
        return output.toString();
    }

    public double calculateYearAverage() {
        double total = 0;
        int count = 0;
        for (Module module : modules) {
            if (module != null) {
                total += module.getAverage();
                count++;
            }
        }
        return count > 0 ? Math.floor(total / count) : 0;
    }

    public String getStudentDetails() {
        return initial + ". " + surname + " "
    + Math.round(calculateYearAverage()) + "%";
    }

    @Override
    public String toString() {
        return "Student: " + initial + " " + surname;
    }
}
