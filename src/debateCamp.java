public class debateCamp extends SummerCamp {
    private double materialFee;
    private boolean groupdiscount;

    public debateCamp(String title, String location, int numOfWeeks, double weeklyRate, double totalCost) {
        super(title, location, numOfWeeks, weeklyRate, totalCost);
        this.materialFee = materialFee;
        this.groupdiscount = groupdiscount;

    }

    @Override
    public   void computeTotalCost() {
        if(groupdiscount == true){
            totalCost = weeklyRate * numOfWeeks * 0.9;
        }
        else{
            totalCost = weeklyRate * numOfWeeks;
        }

    }

    @Override
    public String toString() {
        return "debateCamp{" +
                "materialFee=" + materialFee +
                ", groupdiscount=" + groupdiscount +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                ", numOfWeeks=" + numOfWeeks +
                ", weeklyRate=" + weeklyRate +
                ", totalCost=" + totalCost +
                '}';
    }
}
