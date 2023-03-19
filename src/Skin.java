public class Skin extends Organ {
    private String skinColor;
    private int skinSoftness;

    public Skin(String name, String medicalCondition, String skinColor, int skinSoftness) {
        super(name, medicalCondition);
        this.skinColor = skinColor;
        this.skinSoftness = skinSoftness;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin Color: "+ getSkinColor());
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public int getSkinSoftness() {
        return skinSoftness;
    }

    public void setSkinSoftness(int skinSoftness) {
        this.skinSoftness = skinSoftness;
    }
}
