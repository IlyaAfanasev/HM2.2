public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Gryffindor (String name, int transgressionDistance, int magicPower, int nobility, int honor,
                       int bravery) {
        super(name, transgressionDistance, magicPower);
        this.nobility=nobility;
        this.honor=honor;
        this.bravery=bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public static void bestStudent(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        int gryffindorSum1 =gryffindor1.getNobility()+gryffindor1.getHonor()+gryffindor1.getBravery();
        int gryffindorSum2 =gryffindor2.getNobility()+gryffindor2.getHonor()+gryffindor2.getBravery();

        if (gryffindorSum1>gryffindorSum2) {
            System.out.println(gryffindor1.getName()+" лучший Гриффиндорец , чем "+gryffindor2.getName()+
                    ". "+gryffindorSum1+"/"+gryffindorSum2);
        } else if (gryffindorSum2>gryffindorSum1) {
            System.out.println(gryffindor2.getName()+" лучший Гриффиндорец, чем "+gryffindor1.getName()+
                    ". "+gryffindorSum2+"/"+gryffindorSum1);
        } else System.out.println("Ученики, " +gryffindor1.getName()+" и "+gryffindor2.getName()+
                " равны в своих характеристиках. "+gryffindorSum1+"/"+gryffindorSum2);
    }

    @Override

    public String toString() {
        return super.toString() + ", благородство = " + nobility + ", честь = " + honor + ", храбрость = " + bravery;
    }
}
