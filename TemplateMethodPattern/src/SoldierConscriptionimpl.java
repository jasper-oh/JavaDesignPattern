import city.Citizen;
import city.army.Soldier;
import city.army.armor.SteelAmor;
import city.army.weapon.Gun;

public class SoldierConscriptionimpl extends AbstSoldierConscriptionHelper{
    @Override
    protected Citizen conscriptionCitizen() {
        System.out.println("징집 !");

        return new Citizen();
    }

    @Override
    protected void training(Citizen citizen) {
        citizen.updateStrength(5);
        citizen.updateAgility(4);
        citizen.updateIntelligence(-3);
        System.out.println("병사 훈련 !");
    }

    @Override
    protected void supplyEquipment(Soldier soldier) {
        soldier.setAmor(new SteelAmor());
        soldier.setWeapon(new Gun());

        System.out.println("장비 보급! ");
    }

    @Override
    protected Soldier changeOfPosition(Citizen citizen) {
        System.out.println("시민 -> 병사 변경 ! ");

        return new Soldier(citizen);
    }
}
