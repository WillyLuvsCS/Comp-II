public class Contract extends Employee {

    private double nbHours = -1.0;
    private double hourRate = -1.0;
    private double percentHourSup  = -1.0;
    private static final double dueHour  = 40.0;

    Contract(String name) {
        super(name);
    }

    Contract(String name, double nbHours, double hourRate, double percentHourSup) {
        super(name);
        setSalaryInfo(nbHours, hourRate, percentHourSup);
    }

    public void setSalaryInfo(double nbHours, double hourRate, double percentHourSup) {
        if (nbHours >= 0) this.nbHours = nbHours;
        if (hourRate >= 0) this.hourRate = hourRate;
        if (percentHourSup >= 0) this.percentHourSup = percentHourSup;
    }

    public double getSalary() {
        // If salary info not set, match Test.java behavior
        if (nbHours == -1.0 || hourRate == -1.0 || percentHourSup == -1.0) {
            return -1.0;
        }

        if (nbHours <= dueHour) {
            return nbHours * hourRate;
        } else {
            double overtimeHours = nbHours - dueHour;
            double overtimeRate = hourRate * (1.0 + percentHourSup / 100.0);
            return dueHour * hourRate + overtimeHours * overtimeRate;
        }
    }

    public double getNbHours() {
        return nbHours;
    }

    public double getHourRate() {
        return hourRate;
    }

    public double getPercentHourSup() {
        return percentHourSup;
    }

    public String toString() {
        return super.toString() + "; nbHours=" + nbHours
                + "; Hour rate=" + hourRate + "; % Hour Sup=" + percentHourSup;
    }
}