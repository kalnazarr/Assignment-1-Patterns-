package strategy.hw;

public abstract class Character {
    private WeaponBehavior weapon;

    public Character(WeaponBehavior WeaponBehavior){
        this.weapon = WeaponBehavior;
    }

    public void fight(){
        this.weapon.useWeapon();
    }

    public abstract void display();

    public WeaponBehavior getWeaponBehavior() {
        return weapon;
    }

    public void setWeaponBehavior(strategy.hw.WeaponBehavior weaponBehavior) {
        weapon = weaponBehavior;
    }
}
