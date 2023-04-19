public class Slizerin extends Hogwarts{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustPower;
    public Slizerin (String name, int transgressionDistance, int magicPower, int trick, int determination,
                      int ambition, int resourcefulness, int lustPower) {
        super(name, transgressionDistance, magicPower);
        this.trick=trick;
        this.determination=determination;
        this.ambition=ambition;
        this.resourcefulness=resourcefulness;
        this.lustPower=lustPower;

    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustPower() {
        return lustPower;
    }

    public void setLustPower(int lustPower) {
        this.lustPower = lustPower;
    }

    public static void bestStudent(Slizerin slizerin1, Slizerin slizerin2) {
        int slizerinSum1 =slizerin1.getTrick()+slizerin1.getDetermination()+slizerin1.getAmbition()+
                slizerin1.getResourcefulness()+ slizerin1.getLustPower();
        int slizerinSum2 =slizerin2.getTrick()+slizerin2.getDetermination()+slizerin2.getAmbition()+
                slizerin2.getResourcefulness()+ slizerin2.getLustPower();

        if (slizerinSum1>slizerinSum2) {
            System.out.println(slizerin1.getName()+" лучший Слизеринец , чем "+slizerin2.getName()+
                    ". "+slizerinSum1+"/"+slizerinSum2);
        } else if (slizerinSum2>slizerinSum1) {
            System.out.println(slizerin2.getName()+" лучший Слизеринец, чем "+slizerin1.getName()+
                    ". "+slizerinSum2+"/"+slizerinSum1);
        } else System.out.println("Ученики равны в своих характеристиках. "+slizerinSum1+"/"+slizerinSum2);
    }
    @Override
    public String toString() {
        return super.toString() + ", хитрость = " + trick + ", решительность = " + determination + "," +
                ", амбициозность = " + ambition+ ", находчивость = "+resourcefulness+ "," +
                " жажда власти = "+lustPower;
    }
}
