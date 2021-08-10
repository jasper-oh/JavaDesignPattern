import city.Citizen;
import city.army.Soldier;

public class main {
    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        AbstSoldierConscriptionHelper helper = new SoldierConscriptionimpl();
        Soldier soldier = helper.conscription();
        soldier.attact();
        soldier.defense();
    }
}

// 일정한 프로세스를 가진 요구사항을 알고리즘으로 정의할 때 알고리즘의 구조를 메소드에 정의 후 하위 클래스에서
// 알고리즘 구조의 변경 없이 알고리즘을 재정의 하는 패턴을 템플릿 메서드 패턴이라 한다.
