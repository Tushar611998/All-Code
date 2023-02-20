package OOPS_4.Othelo_Game;

import java.util.Scanner;

public class Othello {
    private Player player1;
    private Player player2;
    private Board board;

    public void startGame(){
        Scanner sc = new Scanner(System.in);
        player1 = playerInput(1);
        player2 = playerInput(2);
        board = new Board(player1.getSymbol(),player2.getSymbol());

        boolean player2Turn =true;
        int status = Board.Incomplete;
        while(status==Board.Incomplete || status==Board.Invalid){
            if(player2Turn){
                System.out.println("Player 2 -"+ player2.getName()+"'s turn");
                System.out.println(" Enter X coordinate ");
                int x = sc.nextInt();
                System.out.println("Enter Y coordinate");
                int y = sc.nextInt();
                status = board.move(player2.getSymbol(),x,y);
                if(status!=Board.Invalid){
                    player2Turn = false;
                    board.print();
                }else{
                    System.out.println("Invalid position !! please try again!!");
                }

            }else{
                System.out.println("Player 1 -"+ player1.getName()+"'s turn");
                System.out.println(" Enter X coordinate ");
                int x = sc.nextInt();
                System.out.println("Enter Y coordinate");
                int y = sc.nextInt();
                status = board.move(player2.getSymbol(),x,y);
                if(status!=Board.Invalid){
                    player2Turn = true;
                    board.print();
                }else{
                    System.out.println("Invalid position !! please try again!!");
                }
            }
        }

    }
    public Player playerInput(int num){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name of player-" + num);
        String name = sc.next();
        System.out.println("Enter Symbol of player" + num);
        int symbol = sc.nextInt();
        Player player = new Player(name,symbol);
        return player;

    }
}
