package strategy.hw;

public class Knight extends Character {
    public Knight(){
        super(new BowAndArrowBehavior());
    }

    @Override
    public void display() {
        System.out.println("Hello, I am Knight!");
    }
}
