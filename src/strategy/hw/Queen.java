package strategy.hw;

public class Queen extends Character {
    public Queen(){
        super(new KnifeBehavior());
    }

    @Override
    public void display() {
        System.out.println("Hello, I am Queen!");
    }
}
