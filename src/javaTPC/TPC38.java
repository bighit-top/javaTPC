package javaTPC;

import java.util.*;
import kr.tpc.*;

public class TPC38 {

	public static void main(String[] args) {
		
		ArrayList<BookDTO> list = new ArrayList<BookDTO>(1); //Object[]->BookDTO[] 제네릭으로 타입을 정해주는게 안전
		
		list.add(new BookDTO("자바", 12000, "이지스", 600));
		list.add(new BookDTO("C언어", 17000, "에이콘", 700));
		list.add(new BookDTO("Python", 15000, "제이펍", 800));
		
		for(int i=0; i<list.size(); i++) {
			// ArrayList는 타입을 정해주어야 upcasting, downcasting 생략이 가능하다.
//			Object o = list.get(i);
//			BookDTO vo = (BookDTO)o;
			BookDTO vo = list.get(i);
			System.out.println(vo.title+"\t"+vo.price+"\t"+vo.company+"\t"+vo.page);
		}
		
	}

}
