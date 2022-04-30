package kr.poly;

public abstract class Animal { // 추상클래스(불완전한 객체) -> 인스턴스 생성 불가
	// Dog, Cat -> eat
	public abstract void eat(); // 추상메서드(불완전한 메서드)
	
	public void move() { // 공통 기능 : 구현 메서드
		System.out.println("무리를 지어서 이동한다.");
	}
	
}
