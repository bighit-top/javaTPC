package javaTPC;

import kr.poly.*;

public class TPC25 {

	public static void main(String[] args) {
		// eat() -> override(재정의) -> eat()
//		Animal a = new Animal(); // 인스턴스 생성 불가
//		a.eat();
		
		// upcatsting(부모의 역할로 사용 -> override를 유도하고 명령을 내리는 역할)
		Animal ani = new Dog();
		ani.eat(); // 동적 바인딩 : ? -> 개가 먹다.
		ani.move();
		
		ani = new Cat();
		ani.eat(); // 동적 바인딩 : ? -> 고양이가 먹다.
		ani.move();
		((Cat)ani).night();

	}

}
