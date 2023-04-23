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
    public static void bestStudent(Puffenduy puffenduy1, Puffenduy puffenduy2) {
        int puffenduySum1 =puffenduy1.getDiligence()+puffenduy1.getLoyalty()+puffenduy1.getHonesty();
        int puffenduySum2 =puffenduy2.getDiligence()+puffenduy2.getLoyalty()+puffenduy2.getHonesty();

        if (puffenduySum1>puffenduySum2) {
            System.out.println(puffenduy1.getName()+" лучший Пуфендуец , чем "+puffenduy2.getName()+
                    ". "+puffenduySum1+"/"+puffenduySum2);
        } else if (puffenduySum2>puffenduySum1) {
            System.out.println(puffenduy2.getName()+" лучший Пуфендуец, чем "+puffenduy1.getName()+
                    ". "+puffenduySum2+"/"+puffenduySum1);
        } else System.out.println("Ученики, " +puffenduy1.getName()+" и "+puffenduy2.getName()+
                " равны в своих характеристиках. "+puffenduySum1+"/"+puffenduySum2);
    }
    @Override
    public String toString() {
        return super.toString() + ", трудолюбие = " + diligence + ", верность = " + loyalty + ", честность = " + honesty;
    }
}
