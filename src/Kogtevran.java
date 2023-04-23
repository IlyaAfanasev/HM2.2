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
    public static void bestStudent(Kogtevran kogtevran1, Kogtevran kogtevran2) {
        int kogtevranSum1 =kogtevran1.getSmartness()+kogtevran1.getWisdom()+kogtevran1.getWit()+kogtevran1.getCreativity();
        int kogtevranSum2 =kogtevran2.getSmartness()+kogtevran2.getWisdom()+kogtevran2.getWit()+kogtevran2.getCreativity();

        if (kogtevranSum1>kogtevranSum2) {
            System.out.println(kogtevran1.getName()+" лучший Когтевранец , чем "+kogtevran2.getName()+
                    ". "+kogtevranSum1+"/"+kogtevranSum2);
        } else if (kogtevranSum2>kogtevranSum1) {
            System.out.println(kogtevran2.getName()+" лучший Когтевранец, чем "+kogtevran1.getName()+
                    ". "+kogtevranSum2+"/"+kogtevranSum1);
        } else System.out.println("Ученики, " +kogtevran1.getName()+" и "+kogtevran2.getName()+
                " равны в своих характеристиках. "+kogtevranSum1+"/"+kogtevranSum2);
    }
    @Override
    public String toString() {
        return super.toString() + ", ум = " + smartness + ", мудрость = " + wisdom + "," +
                ", остроумие = " + wit+ ", творчество = "+creativity;
    }
}
