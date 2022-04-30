package javaTPC;

public class TPC05 {

	public static void main(String[] args) {
		
		// 1차원 배열
		int[] a = new int[3];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		int sum = 0;
		for (int i=0; i<a.length; i++) {
			sum += a[i];
		}
		System.out.println(sum);
		
		
		// 2차원 배열
		int[][] b = new int[3][3];
		
		b[0][0] = 1;
		b[0][1] = 2;
		b[0][2] = 3;
		
		b[1][0] = 1;
		b[1][1] = 2;
		b[1][2] = 3;
		
		b[2][0] = 1;
		b[2][1] = 2;
		b[2][2] = 3;
		
		for (int i=0; i<b.length; i++) {
			for (int k=0; k<b[i].length; k++) {
				System.out.print(b[i][k]+"\t");
			}
			System.out.println();
		}
		
		
		// 가변길이 배열
		int[][] star = new int[5][];
		star[0] = new int[1];
		star[1] = new int[2];
		star[2] = new int[3];
		star[3] = new int[4];
		star[4] = new int[5];
		
		for (int i=0; i<star.length; i++) {
			for (int k=0; k<star[i].length; k++) {
				star[i][k] = '*';
				System.out.print((char)star[i][k]);
			}
			System.out.println();
		}
		
	}

}
