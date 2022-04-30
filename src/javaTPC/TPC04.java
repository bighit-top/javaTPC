package javaTPC;

public class TPC04 {

	public static void main(String[] args) {
		// 데이터의 이동 (변수 VS 배열)
		
		// 변수
		int a,b,c;
		a = 10;
		b = 20;
		c = 30;
		// a+b+c=?
		hap(a,b,c);
		
		
		//배열
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		// a+b+c=?
		arrHap(arr);
		
	}
	
	// 변수 합 메서드
	public static void hap(int x, int y, int z) {
		int sum = x+y+z;
		System.out.println(sum);
	}
	
	// 배열 합 메서드
	public static void arrHap(int[] x) {
		int sum = x[0]+x[1]+x[2];
		System.out.println(sum);
		
		//반복문
		int forSum = 0;
		for (int num : x) {
			forSum += num;
		}
		System.out.println(forSum);
	}

}
