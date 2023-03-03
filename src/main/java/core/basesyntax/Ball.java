package core.basesyntax;

public class Ball {
    private String colour;
    private int number;
    
    public Ball(String colour, int number) {
        this.colour = colour;
        this.number = number;
    }
    
    public String getColour() {
        return this.colour;
    }
    
    public int getNumber() {
        return this.number;
    }
  
    @Override
    public String toString() {
        return "The " + getColour() + " ball with number: " + getNumber();
    }
}