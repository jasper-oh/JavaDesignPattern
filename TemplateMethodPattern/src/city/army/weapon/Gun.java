package city.army.weapon;



public class Gun implements Weapon {

    @Override
    public void attack() {
        System.out.println("Bang Bang");
    }
}
