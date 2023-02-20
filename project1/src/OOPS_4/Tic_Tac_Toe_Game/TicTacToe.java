package OOPS_4.Tic_Tac_Toe_Game;

import java.util.Scanner;

public class TicTacToe {
    private Player player1;
    private  Player player2;
    private  Board board;

    public void startGame(){
        Scanner sc = new Scanner(System.in);
        // player input
        player1 = playerInput(1);
        player2 = playerInput(2);
        while (player1.getSymbol()==player2.getSymbol()){
            System.out.println("Symbol already exist!! please pick another symbol");
            char symbol = sc.next().charAt(0);
            player2.setSymbol(symbol);
        }
        // create board
        board = new Board(player1.getSymbol(),player2.getSymbol());

        // start the game
        boolean player1turn = true;
        int status = Board.Incomplete;
        while(status == Board.Incomplete || status == Board.Invalid){
            if(player1turn){
                System.out.println("player 1 - "+player1.getName()+"'s turn");
                System.out.println("Entehr y coordinate");
                int i = sc.nextInt();
                System.out.println("Entehr X coordinate");
                int j = sc.nextInt();
                status = board.move(player1.getSymbol(),i,j);
                if(status!= Board.Invalid){
                    player1turn = false;
                    board.print();
                }else{
                    System.out.println("Invalid condition !! please try again!!");
                }
            }else{
                System.out.println("player 2 - "+player2.getName()+"'s turn");
                System.out.println("Entehr X coordinate");
                int i = sc.nextInt();
                System.out.println("Entehr Y coordinate");
                int j = sc.nextInt();
                status = board.move(player2.getSymbol(),i,j);
                if(status!= Board.Invalid){
                    player1turn = true;
                    board.print();
                }else{
                    System.out.println("Invalid condition !! please try again!!");
                }
            }

        }
        if(status==board.player1_win){
            System.out.println("player 1"+ player1.getName()+"wins!!");
        }else if(status==board.player2_win){
            System.out.println("player 2"+ player2.getName()+"wins!!");
        }else{
            System.out.println("Match Draw!!");
        }
    }
    private Player playerInput(int num){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of " +num+" player");
        String name = sc.next();

        System.out.println("Enter Symbol of "+num+" player");
        char symbol = sc.next().charAt(0);

        Player player = new Player(name,symbol);
        return player;
    }
}
