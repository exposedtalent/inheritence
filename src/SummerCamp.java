public abstract class  SummerCamp {

    protected String title, location;
    protected int numOfWeeks;
    protected double weeklyRate;
    protected double totalCost;

    public SummerCamp(String title, String location, int numOfWeeks, double weeklyRate, double totalCost) {
        this.title = title;
        this.location = location;
        this.numOfWeeks = numOfWeeks;
        this.weeklyRate = weeklyRate;
        this.totalCost = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumOfWeeks() {
        return numOfWeeks;
    }

    public void setNumOfWeeks(int numOfWeeks) {
        this.numOfWeeks = numOfWeeks;
    }

    public double getWeeklyRate() {
        return weeklyRate;
    }

    public void setWeeklyRate(double weeklyRate) {
        this.weeklyRate = weeklyRate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public abstract void computeTotalCost();

    @Override
    public String toString() {
        return "SummerCamp{" +
                "title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", numOfWeeks=" + numOfWeeks +
                ", weeklyRate=" + weeklyRate +
                ", totalCost=" + totalCost +
                '}';
    }
}
