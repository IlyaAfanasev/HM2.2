public class Kogtevran extends Hogwarts{
    private int smartness;
    private int wisdom;
    private int wit;
    private int creativity;
    public Kogtevran (String name, int transgressionDistance, int magicPower, int smartness, int wisdom,
                       int wit, int creativity) {
        super(name, transgressionDistance, magicPower);
        this.smartness=smartness;
        this.wisdom=wisdom;
        this.wit=wit;
        this.creativity=creativity;
    }

    public int getSmartness() {
        return smartness;
    }

    public void setSmartness(int smartness) {
        this.smartness = smartness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Kogtevran{" +
                ", name='" + name + '\'' +
                "smartness=" + smartness +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
