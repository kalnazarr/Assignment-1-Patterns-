package strategy.hw;

public class Troll extends Character {
    public Troll(){
        super(new AxeBehavior());
    }

    @Override
    public void display() {
        System.out.println("Hello, I am Troll!");
    }
}
