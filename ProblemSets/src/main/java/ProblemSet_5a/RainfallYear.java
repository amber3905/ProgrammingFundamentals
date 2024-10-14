package ProblemSet_5a;

public class RainfallYear {
    private int year;
    private double[] rainfallMonths;

    public RainfallYear(int year) {
        this.year = year;
        this.rainfallMonths = new double[12];
    }

    public int getYear() {
        return year;
    }

    public void enterData(double[] data) {
        if (data.length == 12) {
            this.rainfallMonths = data;
        }
    }

    public double getRainfallMonth(String month) {
        switch (month.toUpperCase()) {
            case "JANUARY": return rainfallMonths[0];
            case "FEBRUARY": return rainfallMonths[1];
            case "MARCH": return rainfallMonths[2];
            case "APRIL": return rainfallMonths[3];
            case "MAY": return rainfallMonths[4];
            case "JUNE": return rainfallMonths[5];
            case "JULY": return rainfallMonths[6];
            case "AUGUST": return rainfallMonths[7];
            case "SEPTEMBER": return rainfallMonths[8];
            case "OCTOBER": return rainfallMonths[9];
            case "NOVEMBER": return rainfallMonths[10];
            case "DECEMBER": return rainfallMonths[11];
            default: return 0;
        }
    }

    public double calculateMeanRainfall() {
        double total = 0;
        for (double rainfall : rainfallMonths) {
            total += rainfall;
        }
        return total / 12;
    }

    public double calculateHighestRainfall() {
        double highest = 0;
        for (double rainfall : rainfallMonths) {
            if (rainfall > highest) {
                highest = rainfall;
            }
        }
        return highest;
    }
}
