import city.Citizen;
import city.army.Soldier;

public abstract class AbstSoldierConscriptionHelper {
    protected abstract Citizen conscriptionCitizen();

    protected abstract void training(Citizen citizen);

    protected abstract void supplyEquipment(Soldier soldier);

    protected abstract Soldier changeOfPosition(Citizen citizen);

    public Soldier conscription(){
        Citizen citizen = conscriptionCitizen();
        training(citizen);
        Soldier soldier = changeOfPosition(citizen);
        supplyEquipment(soldier);
        return soldier;
    }



}
