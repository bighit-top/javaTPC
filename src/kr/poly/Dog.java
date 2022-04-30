package kr.poly;

public class Dog extends Animal {

	public Dog() {
		super(); // new Animal();
	}
	
	// Override 재정의
	@Override
	public void eat() {
		System.out.println("개가 먹다.");
	}
	
}
