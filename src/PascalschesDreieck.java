public class PascalschesDreieck {
    public static void main(String[] args) {
        int lengthOfSpalte = 20;

        int[][] spaltenArray = new int[lengthOfSpalte][];

        for(int i=0; i < lengthOfSpalte; i++){
            int zeilenArray[] = new int[i+1];
            spaltenArray[i] = zeilenArray;
        }

        for(int a=0; a<spaltenArray.length; a++){
            for(int b=0; b<spaltenArray[a].length; b++){
                if(b==0 || b == spaltenArray[a].length-1){
                    spaltenArray[a][b] = 1;
                }else{
                    spaltenArray[a][b] = spaltenArray[a-1][b-1] + spaltenArray[a-1][b];
                }
            }
        }

        for(int i=0; i<spaltenArray.length; i++){
            for(int y=0; y<spaltenArray[i].length; y++){
                System.out.printf("%6d", spaltenArray[i][y]);
            }
            System.out.println();
        }
    }
}