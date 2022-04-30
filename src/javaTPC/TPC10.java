package javaTPC;

import kr.tpc.BookDTO;

public class TPC10 {

	public static void main(String[] args) {
		// int, float, char, boolean -> PDT(기본 자료형)
		int a;
		a = 10;
		
		// 책(BookDTO)이라는 자료형 -> class, UDDT(자용자 자료형)
		BookDTO b = new BookDTO();
		b.title = "자바";
		b.price = 20000;
		b.company = "영진";
		b.page = 670;
		
		System.out.print(b.title+"\t");		
		System.out.print(b.price+"\t");		
		System.out.print(b.company+"\t");		
		System.out.println(b.page);		
	}

}
