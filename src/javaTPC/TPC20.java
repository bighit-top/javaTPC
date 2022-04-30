package javaTPC;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {

//		Animal d = new Dog();
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// Dog.class, Cat.class 자식클래스가 재공되지 않을 경우
		Animal ani = new Dog(); // Upcasting(자동형변환)
		ani.eat(); // 동적바인딩으로 자식 d.eat()의 개가 먹다 출력
		
		ani = new Cat();
		ani.eat(); // 자식 c.eat()의 고양이가 먹다 출력
		
//		ani.night(); // 자식의 메서드 중 오버라이딩이 아닌 메서드에 바로는 접근 불가
		((Cat)ani).night(); // Downcasting(강제형변환) - 자식의 메서드에도 접근이 가능하다
		
		
	}

}
