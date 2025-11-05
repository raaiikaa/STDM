package Vererbung;

public class Test {
    public static void main(String[] args) {
        Deutscher deutscher = new Deutscher();
        System.out.println(deutscher.getGruss("de"));
        System.out.println(deutscher.getChef("de"));
        Deutscher deutscher1 = new Deutscher("Peter");
        System.out.println(deutscher1.getGruss("de"));
        System.out.println(deutscher1.getChef("de"));

        System.out.println();

        USAmerikaner usAmerikaner = new USAmerikaner();
        System.out.println(usAmerikaner.getGruss("en"));
        System.out.println(usAmerikaner.getChef("en"));
        USAmerikaner usAmerikaner1 = new USAmerikaner("Spike");
        System.out.println(usAmerikaner1.getGruss("en"));
        System.out.println(usAmerikaner1.getChef("en"));

        System.out.println();

        Franzose franzose = new Franzose();
        System.out.println(franzose.getGruss("fr"));
        System.out.println(franzose.getChef("fr"));
        Franzose franzose1 = new Franzose("Maurice");
        System.out.println(franzose1.getGruss("fr"));
        System.out.println(franzose1.getChef("fr"));

        System.out.println();

        Brite brite = new Brite();
        System.out.println(brite.getGruss("en"));
        System.out.println(brite.getChef("en"));
        Brite brite1 = new Brite("John");
        System.out.println(brite1.getGruss("en"));
        System.out.println(brite1.getChef("en"));

        System.out.println();

        Italiener italiener = new Italiener();
        System.out.println(italiener.getGruss("it"));
        System.out.println(italiener.getChef("it"));
        Italiener italiener1 = new Italiener("Umberto");
        System.out.println(italiener1.getGruss("it"));
        System.out.println(italiener1.getChef("it"));

    }
}
