package javaTPC;

import kr.tpc.*;

public class TPC23 {

	public static void main(String[] args) {
		//1. 다형성 인수
		Dog d = new Dog();
		display(d);
		Cat c = new Cat();
		display(c);
	

	}
	
	// 다형성 인수
	private static void display(Animal r) { //upcasting
		r.eat();
//		r.night();
		if(r instanceof Cat) ((Cat)r).night(); //downcasting
		
	}

	

}
