package strategy.hw;

public class Main {
    public static void main(String[] args) {
        Character obj = new King();

        obj.display();
        obj.fight();

        obj.setWeaponBehavior(new AxeBehavior());
        System.out.println("Here we can see another weapon: ");
        obj.fight();
    }
}
