package OOPS_4.Othelo_Game;

public class Board {
    private int boardSize = 8;
    private int player1Symbol;
    private int player2Symbol;
    private int[][] board;

    public final static int Incomplete = 1;
    public final static int Invalid =2;
    public final static int player1_wins =3;
    public final static int player2_wins =4;
    public final static int Draw =5;

    private int[] ans1 = {0,-1,-1,-1,0,1,1,1};
    private int[] ans2 = {-1,-1,0,1,1,1,0,-1};

    public Board(int player1Symbol, int player2Symbol){
        board = new int[boardSize][boardSize];
        board[3][3] = player1Symbol;
        board[3][4] = player2Symbol;
        board[4][4] = player1Symbol;
        board[4][3] = player2Symbol;

        for(int i =0;i<board.length;i++){
            for(int j =0;j<board[i].length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }
    public void print(){
        for(int i =0;i<board.length;i++){
            for(int j =0;j<board[i].length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int move(int playerSymbol,int x, int y){
        if(x<0 || x>boardSize || y<0 || y>boardSize){
            return Invalid;
        }
        int c=0;
        boolean valid =false;
        for(int i =0;i<ans1.length;i++){
            valid = true;
            int X = x+ ans1[i];
            int Y = y+ ans2[i];
            int count=0;
            while(X>=0 && Y>=0 && board[X][Y]!=0 && board[X][Y]!=playerSymbol){
                count++;
                X+=ans1[i];
                Y+=ans2[i];
            }
            if(count==0){
                valid =false;
            }
            if(valid && board[X][Y]==playerSymbol ){
                board[x][y] = playerSymbol;
                X=x+ans1[i];
                Y = y+ans2[i];
                while(X>=0 && Y>=0 && board[X][Y]!=0 && board[X][Y]!=playerSymbol){
                    board[X][Y] = playerSymbol;
                    X+=ans1[i];
                    Y+=ans2[i];
                }
            }
            c++;
        }
        if(c==0){
            return Invalid;
//            int player1Count=0;
//            int player2count =0;
//            for(int i =0;i<board.length;i++){
//                for(int j =0;j<board[i].length;j++){
//                    if(board[i][j]==playerSymbol){
//                        player1Count++;
//                    }else{
//                        player2count++;
//                    }
//                }
//            }
//            if(playerSymbol==player1Symbol && player1Count>player2count){
//                return player1_wins;
//            }else if(playerSymbol==player2Symbol && player1Count<player2count){
//                return player2_wins;
//            }else{
//                return Draw;
//            }
        }
        return Incomplete;
    }
}
