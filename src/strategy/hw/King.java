package strategy.hw;

public class King extends Character {
    public King(){
        super(new SwordBehavior());
    }

    @Override
    public void display() {
        System.out.println("Hello, I am King!");
    }
}
