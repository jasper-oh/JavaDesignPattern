public class main {
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(50f));
    }
}
// Adapter 라는 객체를 사용해서 twoTime , half 메소드의 알고리즘을 수행했다.
// 이로써 사용자는 Adapter 의 twiceOf 와 half 만 사용하면 그 내부에서 어떤 알고리즘을 사용하던 맞는 결과만 반환하면 된다.


// 연관없는 두 객체를 연결해서 원하는 요구사항을 수용한다면, 생산성 측면에서도 더 높아질수 있다.
// 이를 통해 우리는 매번 요구사항마다 새로운 알고리즘을 만들거나 타입별로 비슷한 알고리즘들을 새로구현할 필요없이 기존의 알고리즘을 변형해
//재활용할 수 있게 됩니다. 예를 들어 리스트 컬렉션을 버블 정렬해야 하는 요구사항이 생겼을 때 나한테 ;배열을 기준으로 버블정렬을 구현한 알고리즘이 있다면, 굳이
// 리스트 컬랙션을 이용한 새로운 알고리즘을 구현할 필요없이 리스트를 배열로 만들어서 알고리즘을 수행후 다시 리스트 컬렉션으로 변환하는게 낫다. ;

