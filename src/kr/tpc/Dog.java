package kr.tpc;

public class Dog extends Animal {
	// 이름, 나이 종 : 상태정보
	// Override 재정
	public void eat() {
		System.out.println("개가 먹다.");
	}
	
	public Dog() {
		super(); // new Animal();
	}
}
