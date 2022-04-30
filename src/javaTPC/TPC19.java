package javaTPC;

import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {

	public static void main(String[] args) {
		// dog, cat -> animal
		
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		
		// Dog.java(x), Dog.class(o) -> 소스파일이 비공개로 제공되지 않을 때, IDE를 사용하지 않으면 클래스에서 어떤 기능들을 제공하는지 알 수 없음
		// TV를 조작하기 위해 리모콘이 제공되지만 
//		Dog dd = new Dog();
		
		// Animal <--- [Dog.class, Cat.calss]
//		Dog dd- new Dog();
//		dd.eat();
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		
	}

}
