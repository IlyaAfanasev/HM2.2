public class Main {
    public static void main(String[] args) {
        Gryffindor potter = new Gryffindor("Гарри Поттер", 10, 10,
                9, 10, 10);
        Gryffindor greynger = new Gryffindor("Гермиона Грейнджер", 10, 10,
                10, 10, 10);
        Gryffindor uizly= new Gryffindor("Рон Уизли",5,5,7,10,8);

        Puffenduy smit=new Puffenduy("Захария Смит", 8, 5, 7,
                9, 7);
        Puffenduy diggori = new Puffenduy("Седрик Диггори", 8, 5, 6,
                7, 9);
        Puffenduy finch_flechly=new Puffenduy("Джастин Финч-Флечли",6,7,5,
                4,7);
        Kogtevran chang = new Kogtevran("Джоу Чанг", 6, 6, 7, 9,
                4, 8);
        Kogtevran patil = new Kogtevran("Падма Патил", 7, 6, 7, 9,
                9, 7);
        Kogtevran belby = new Kogtevran("Маркус Белби", 8, 4, 9, 7,
                9, 8);
        Slizerin malfoy=new Slizerin("Драко Малфой",10,9,9,10,9,
                9,8);
        Slizerin montegyu = new Slizerin("Грэхэм Монтегю", 8, 6, 7, 9,
                7, 9,9);
        Slizerin goyl= new Slizerin("Грегори Гойл",8,9,6,4,7,
                5,7);

        System.out.println(potter.toString());
        System.out.println(smit.toString());
        System.out.println(patil.toString());
        System.out.println(malfoy.toString());
        Hogwarts.bestStudent(greynger, malfoy);
        Hogwarts.bestStudent(smit, patil);
        Gryffindor.bestStudent(potter,greynger);
        Puffenduy.bestStudent(smit, finch_flechly);
        Kogtevran.bestStudent(chang, belby);
        Slizerin.bestStudent(montegyu, goyl);
    }

}