package kr.tpc;

public class OverLoad {
	// 동작(method)으로만 이루어진 객체
	public void hap(int a, int b) {
		System.out.println("hap_int_int");
		System.out.println(a+b);
	}
	public void hap(float a, int b) {
		System.out.println("hap_float_int");
		System.out.println(a+b);
	}
	public void hap(int a, float b) {
		System.out.println("hap_int_float");
		System.out.println(a+b);
	}
}
