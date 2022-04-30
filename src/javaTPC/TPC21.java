package javaTPC;

import kr.tpc.*;
public class TPC21 {

	public static void main(String[] args) {
		// 
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		c.night();
		
		// Dog.class, Cat.class 
		Animal ani = new Dog(); // Upcasting
		ani.eat();
		
		ani = new Cat(); // Upcasting
		ani.eat();
		((Cat)ani).night(); //DownCasting();
		

	}

}
