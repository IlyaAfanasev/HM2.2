public class Puffenduy extends Hogwarts{
    private int diligence;
    private int loyalty;
    private int honesty;

    public Puffenduy(String name, int transgressionDistance, int magicPower,
                     int diligence, int loyalty,int honesty) {
        super(name, transgressionDistance, magicPower);
        this.diligence=diligence;
        this.loyalty=loyalty;
        this.honesty=honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Puffenduy{" +
                ", name='" + name + '\'' +
                "diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", magicPower=" + magicPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
