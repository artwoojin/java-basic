package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(); //x001
        // 단 자식의 기능은 호출할 수 없다.
        // poly.childMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod(); // 부모타입을 자식 타입으로 변환 후 기능 호출
        // (이어서) 참조값을 읽은 다음 자식 타입으로 다운캐스팅
        // 캐스팅을 한다고 해서 Parent poly의 타입이 변하는 것은 아니다.
        // 해당 참조값을 꺼내고, 꺼낸 참조값이 Child 타입이 되는 것이다.
        // 따라서 poly의 타입은 Parent로 그대로 유지된다. // x001
    }
}
