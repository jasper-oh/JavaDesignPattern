public class GameCharacter {

    // 접근점
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    // 교환가능
    public void attack(){
        if(weapon == null){
            System.out.println("Hand Attack");
        }else {

            // 위임 ( Delegate )
            weapon.attact();
        }
    }

}
