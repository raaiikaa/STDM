public class TicTacToe {
    public static void main(String[] args) {
        tictactoe(4, 9);
    }

    public static void tictactoe(int tief, int hoch){
        for(int i=tief; i<=hoch; i++){
            String s = "";
            if(i%2==0){
                s = "tic";
            }
            if(i%3==0){
                s = s + "tac";
            }
            if(i%2!=0 && i%3!=0){
                s = s + "toe";
            }
            System.out.println(i + " " + s);
        }
    }
}
