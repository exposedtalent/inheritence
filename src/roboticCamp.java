public class roboticCamp extends SummerCamp {
    private double competitionFee, facillityFee;

    public roboticCamp(String title, String location, int numOfWeeks, double weeklyRate, double totalCost) {
        super(title, location, numOfWeeks, weeklyRate, totalCost);
        this.competitionFee = competitionFee;
        this.facillityFee = facillityFee;
    }

    @Override
    public void computeTotalCost() {
        totalCost = (weeklyRate * numOfWeeks) + competitionFee + competitionFee;
    }

    @Override
    public String toString() {
        return "roboticCamp{" +
                "competitionFee=" + competitionFee +
                ", facillityFee=" + facillityFee +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", numOfWeeks=" + numOfWeeks +
                ", weeklyRate=" + weeklyRate +
                ", totalCost=" + totalCost +
                '}';
    }
}
