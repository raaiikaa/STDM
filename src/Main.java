public class Main {
    public static void main(String[] args) {
//        methodeOne();
//        methodeTwo();
//        methodeThree();
//        methodeFour();
//        methodeFive();
//        methodeSix();
//        methodeSeven();
        methodeEight();
    }

    static void methodeOne(){
        long a = 100_000;
        long b = a * a / a;
        System.out.printf("%d * %d / %d = %d\n",a,a,a,b);
    }

    static void methodeTwo(){
        long c = 0b0111_1111_1111_1111_1111_1111_1111_1111;
        long d = c+1;
        System.out.printf("%d + 1 = %d\n",c,d);
    }

    static void methodeThree(){
        double e = 3.0;
        double f = 6.0;
        double g = 8.0;
        System.out.printf("%d / %d * %d = %d\n",e,f,g,e / f * g);
    }

    static void methodeFour(){
        float flo = 123456789F;
        System.out.printf("%.0f + 1 = %.0f \n",flo,(flo+1));
    }

    static void methodeFive(){
        float w = 0.0F;
        int cnt = 0;
        while(w<10){
            w += 0.1;
            cnt ++;
        }
        System.out.printf("%d Schritte \n", cnt);
    }

    static void methodeSix(){
        double xd = 1;
        double yd = 0;
        int xi = 1;
        int yi = 0;
        System.out.println(xd/yd);
        System.out.println(xi/yd);
        System.out.println(xd/yi);
        System.out.println(yd/yd);
        System.out.println(xi/yi);
    }

    static void methodeSeven(){
        int a = 3;
        int b = 4;

        String s1 = " String ";
        String s2 = a + s1;
        String s3 = s1 + a;
        String s4 = a + b + s1;
        String s5 = s1 + a + b;
        System.out.printf("%s|%s|%s|%s|%s|\n",s1,s2,s3,s4,s5);
    }

    static void methodeEight(){
        String s1 = "Brat";
        String s2 = "wurst";
        String s3 = "Bratwurst";
        String s4 = s1 + s2;
        String s5 = "Bratwurst";
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
    }
}