public class MehrdimensionalesArray {
    public static void main(String[] args) {
        char [][] t = new char[3][4];
        t[0][0] = 'a'; t[0][1] = 'b'; t[0][2] = 'c'; t[0][3] = 'd';
        t[1][0] = 'e'; t[1][1] = 'f'; t[1][2] = 'g'; t[1][3] = 'h';
        t[2][0] = 'i'; t[2][1] = 'j'; t[2][2] = 'k'; t[2][3] = 'l';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >= 0; j--) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 2; i >= 0; i--) {
            for (int j = 3; j >= 0; j--) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] ma = {{9,8,7}, {6,5}, {4}};
        printMA(ma);

        System.out.println();
        testMethode();

    }

    static void printMA(int[][] ma){
        int a=0;
        for(int i=0; i<ma.length;i++){
            for(int j=0; j<ma[i].length; j++){
                System.out.print(ma[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void testMethode() {
        int[][] anArray = new int[5][];
        int[] oneLine = new int[6];
        for (int y = 0; y < 5; y++) {
            anArray[y] = oneLine;
            for (int x = 0; x < 6; x++) {
                anArray[y][x] = 10 * y + x;
                System.out.print(anArray[y][x] + " ");
            }
            System.out.println();
        }
        System.out.println();
        printMA(anArray); // printMA ist die Methode von oben9
    }
}
