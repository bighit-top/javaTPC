package javaTPC;

import kr.tpc.*;

public class TPC22 {

	public static void main(String[] args) {
		// Upcasting
//		Cat ani = new Cat();
//		Object ani = new Cat();
		Animal ani = new Cat();
		
		ani.eat(); // 동적바인딩 : 컴파일시점 -> animal, 실행시점 -> Cat
		
		
		// DownCasting
//		Cat c = (Cat)ani;
//		c.night();
		((Cat)ani).night();
		
		// 다형성 : 상위클래스가 하위클래스에게 동일한 메서드로 서로 다르게 동작시키는 원리
		ani = new Dog();
		ani.eat();
		
		Object o = new Dog();
//		o.eat(); // override(재정의)가 되어있지 않기 때문에 불가능
		((Dog)o).eat();
	}

}
