package Objektorientierung;

public class BruchMain {
    public static void main(String[] args) {
        Bruch a,b,c,d;

        a = new Bruch(3,4);
        b = new Bruch(5,3);
        c = a.mult(b);
        d = a.add(b);

        System.out.println("a = " + a + " = " + a.asDouble());
        System.out.println("b = " + b + " = " + b.asDouble());
        System.out.println("c = " + c + " = " + c.asDouble());
        System.out.println("d = " + d + " = " + d.asDouble());
        System.out.println("a = " + a + " = " + a.asDouble());
    }
}
