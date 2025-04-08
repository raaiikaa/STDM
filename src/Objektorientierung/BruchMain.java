package Objektorientierung;

public class BruchMain {
    public static void main(String[] args) {
        Bruch a,b,c,d;

        a = new Bruch(3,4);
        b = new Bruch(5,3);
        c = a.mult(b);
        d = a.add(b);

        System.out.println(a.asDouble());

        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("d = " +d);
        System.out.println("a = " +a);
    }
}
