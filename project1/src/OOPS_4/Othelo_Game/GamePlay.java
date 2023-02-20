package OOPS_4.Othelo_Game;

public class GamePlay {
    public static void main(String[] args) {
        int player1Sybol = 1;
        int player2Symbol = 2;
        Board b = new Board(player1Sybol,player2Symbol);
        Othello a = new Othello();
        a.startGame();

    }
}
