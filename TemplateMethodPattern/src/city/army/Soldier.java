package city.army;

import city.Citizen;
import city.army.armor.Amor;
import city.army.weapon.Weapon;

public class Soldier extends Citizen {
    private Weapon weapon;
    private Amor amor;


    public void attact(){
        if(weapon == null){
            System.out.println("맨손 공격");
        }
    }

    public void defense(){
        if(amor == null){
            System.out.println("맨손 방어");
        }
    }

    public Soldier() {
        super();
    }

    public Soldier(Weapon weapon, Amor amor) {
        this.weapon = weapon;
        this.amor = amor;
    }

    public Soldier(Citizen citizen) {
        super(citizen);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Amor getAmor() {
        return amor;
    }

    public void setAmor(Amor amor) {
        this.amor = amor;
    }

    @Override
    public String toString() {
        return "Soldier{" +
                "weapon=" + weapon +
                ", amor=" + amor +
                '}';
    }
}
