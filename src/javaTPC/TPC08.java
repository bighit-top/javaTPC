package javaTPC;

public class TPC08 {

	public static void main(String[] args) {
		// JVM 메모리 구조의 이해
		int a = 30;
		int b = 50;
		int v = add(a,b); // static method call
		
		System.out.println(v);

	}
	
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

}
