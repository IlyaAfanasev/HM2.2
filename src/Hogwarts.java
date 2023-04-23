public abstract class Hogwarts {
    private String name;

    private int magicPower;
    private int transgressionDistance;

    public Hogwarts(String name, int transgressionDistance, int magicPower) {
        this.name=name;
        this.transgressionDistance=transgressionDistance;
        this.magicPower=magicPower;
    }

    public String getName() {
        return name;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
    public static void bestStudent(Hogwarts hogwarts1, Hogwarts hogwarts2) {
        int hogwartsSum1 =hogwarts1.getMagicPower()+hogwarts1.getTransgressionDistance();
        int hogwartsSum2 =hogwarts2.getMagicPower()+hogwarts2.getTransgressionDistance();

        if (hogwartsSum1>hogwartsSum2) {
            System.out.println(hogwarts1.getName()+" лучший ученик , чем "+hogwarts2.getName()+ ". "+hogwartsSum1+"/"+hogwartsSum2);
        } else if (hogwartsSum2>hogwartsSum1) {
            System.out.println(hogwarts2.getName()+" лучший ученик, чем "+hogwarts1.getName()+ ". "+hogwartsSum2+"/"+hogwartsSum1);
        } else System.out.println("Ученики, " +hogwarts1.getName()+" и "+hogwarts2.getName()+
                ", равны в магических силах. "+hogwartsSum1+"/"+hogwartsSum2);
    }

    @Override
    public String toString() {
        return  name +" " +getClass()+ ", сила магии = " + magicPower +
                ", расстояние трансгресии= " + transgressionDistance;
    }
}
