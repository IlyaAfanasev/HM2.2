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
        if (hogwarts1.getMagicPower()+hogwarts1.getTransgressionDistance()>hogwarts2.getMagicPower()+hogwarts2.getTransgressionDistance()) {
            System.out.println(hogwarts1.getName()+" лучший Слизеринец, чем "+hogwarts2);
        }
    }
}
