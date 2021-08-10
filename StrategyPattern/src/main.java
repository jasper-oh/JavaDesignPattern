
// 좋은 확장성으로 StategyPattern 을 사용합니다.

public class main {

    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter();
        gameCharacter.attack();

        gameCharacter.setWeapon(new Knife());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Sword());
        gameCharacter.attack();
    }
}
