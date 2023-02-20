package OOPS_4.Tic_Tac_Toe_Game;

public class Board {

    private int boardSize =3;
    private char board[][];
    private char player1;
    private char player2;
    private int count;
    public final static int player1_win = 1;
    public final static int player2_win = 2;
    public final static int DRAW = 3;
    public final static int Incomplete = 4;
    public final static int Invalid = 5;

    public Board(char p1Symbol, char p2symbol){
        board = new char[boardSize][boardSize];
        for(int i =0;i<boardSize;i++){
            for(int j =0;j<board[i].length;j++){
                board[i][j] = ' ';
            }
        }
        this.player1 = p1Symbol;
        this.player2 = p2symbol;
    }
    public int move(char symbol,int x, int y){
        if(x<0 || x>boardSize || y<0 || y>boardSize){
            return Invalid;
        }
        board[x][y] = symbol;
        count++;

        if(board[x][0]==board[x][1] && board[x][0]==board[x][2]){
            return symbol== player1 ? player1_win : player2_win;
        }
        if(board[0][y] == board[1][y] && board[0][y] == board[2][y]){
            return symbol== player1 ? player1_win : player2_win;
        }
        if(board[0][0] !=' ' && board[0][0] == board[1][1] && board[0][0]==board[2][2]){
            return symbol== player1 ? player1_win : player2_win;
        }
        if(board[0][2] !=' ' && board[0][2] == board[1][1] && board[0][2]==board[2][0]){
            return symbol== player1 ? player1_win : player2_win;
        }
        if(count==boardSize*boardSize){
            return DRAW;
        }
        return Incomplete;

    }
    public void print(){
        for(int i =0;i<board.length;i++){
            for(int j =0;j<board[i].length;j++){
                System.out.print("|" + board[i][j]+"|");
            }
            System.out.println();
        }
    }
}
