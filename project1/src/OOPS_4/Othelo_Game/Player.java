package OOPS_4.Othelo_Game;

public class Player {
    private String name ;
    private int symbol;

    public Player(String name,int symbol){
        setName(name);
        setSymbol(symbol);

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setSymbol(int symbol){
        this.symbol = symbol;
    }
    public int getSymbol(){
        return this.symbol;
    }
}
