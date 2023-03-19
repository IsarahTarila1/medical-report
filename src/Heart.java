public class Heart extends Organ {
    private int rateOfHeartBeat;

    public Heart(String name, String medicalCondition, int rateOfHeartBeat) {
        super(name, medicalCondition);
        this.rateOfHeartBeat = rateOfHeartBeat;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart rate "+this.rateOfHeartBeat);
    }

    public int getRateOfHeartBeat() {
        return rateOfHeartBeat;
    }

    public void setRateOfHeartBeat(int rateOfHeartBeat) {
        this.rateOfHeartBeat = rateOfHeartBeat;
    }
}
