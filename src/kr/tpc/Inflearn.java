package kr.tpc;

public class Inflearn {
	
//	// 인스턴스 메서드
//	public void tpc() {
//		System.out.println("TPC강의 알차다ㅋㅋ");
//	}
	
//	// 인스턴스 메서드
//	public void java() {
//		System.out.println("JAVA강의 재밌어");
//	}

	// Inflearn 클래스내에 static 클래스 메서드만 가지고 있으므로 private 생성자를 지정하면 new 연산자로 생성할 수 없다.
	private Inflearn() {}
	
	// 클래스 메서드 (static)
	public static void tpc() {
		System.out.println("TPC강의 알차다ㅋㅋ");
	}
	
	// 클래스 메서드 (static)
	public static void java() {
		System.out.println("JAVA강의 재밌어");
	}
}
