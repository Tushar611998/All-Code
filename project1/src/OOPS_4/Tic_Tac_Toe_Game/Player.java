package OOPS_4.Tic_Tac_Toe_Game;

public class Player {
    private String name;
    private char symbol;
    
    public Player(String name, char symbol){
        setName(name);
        setSymbol(symbol);
    }
    public void setName(String name){
        if(name != "\0"){
            this.name = name;
        }
    }
    public String getName(){
        return this.name;
    }
    public void setSymbol(char symbol){
        this.symbol = symbol;
    }
    public char getSymbol(){
        return this.symbol;
    }

}
