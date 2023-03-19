public class Eye extends Organ {
    private String colour;
    private  boolean isEyeOpen;

    public Eye(String patientName, String medicalCondition, String colour, boolean isEyeOpen) {
        super(patientName, medicalCondition);
        this.colour = colour;
        this.isEyeOpen = isEyeOpen;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: "+ this.getColour());
    }

    public void open(){
        this.setEyeOpen(true);
        System.out.println(this.getName()+" Opened");
    }

    public void close(){
        this.setEyeOpen(false);
        System.out.println(this.getName()+" Closed");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isEyeOpen() {
        return isEyeOpen;
    }

    public void setEyeOpen(boolean eyeOpen) {
        isEyeOpen = eyeOpen;
    }
}
