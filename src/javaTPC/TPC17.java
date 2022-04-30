package javaTPC;

import kr.tpc.MovieVO;

public class TPC17 {

	public static void main(String[] args) {
		//
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 40;
		
		int[] b = {10, 20, 30, 40, 50};
		
		int[] c = new int[] {10, 20, 30, 40, 50};
		
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		System.out.println("-----------------------------------------------------------------");

		
		// 영화(제목,가격,주인공,등급,시간);
		MovieVO mv = new MovieVO("비트", 12000, "정우성", 15, 1.3f);	
		System.out.println(mv);
		System.out.println("-----------------------------------------------------------------");

		// 객체 배열
		MovieVO[] mArr = new MovieVO[3];
		mArr[0] = new MovieVO("비트1", 11000, "정우성", 12, 1.3f);
		mArr[1] = new MovieVO("비트2", 12000, "정우성", 15, 1.4f);
		mArr[2] = new MovieVO("비트3", 13000, "정우성", 19, 1.5f);
		
		System.out.println(mArr[0].toString());
		System.out.println(mArr[1]);
		System.out.println(mArr[2]);
		System.out.println("-----------------------------------------------------------------");

		for (int i=0; i<mArr.length; i++) {
			System.out.println(mArr[i]);
		}
	}

}
