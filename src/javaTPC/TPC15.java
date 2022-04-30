package javaTPC;

import kr.tpc.MemberVO;

public class TPC15 {

	public static void main(String[] args) {
		
		// 생성자 사용시
		MemberVO m = new MemberVO("홍길동", 40, "010-0000-0000", "서울");
		System.out.println(m.toString());
		
		// setter, getter 사용시
		MemberVO m1 = new MemberVO();
		m1.setName("임꺾정");
		m1.setAge(50);
		m1.setTel("010-1234-1234");
		m1.setAddr("서울");
		
		System.out.print(m1.getName()+"\t");
		System.out.print(m1.getAge()+"\t");
		System.out.print(m1.getTel()+"\t");
		System.out.println(m1.getAddr()+"\t");

		// toString()은 생략이 가능하다.
		System.out.println(m1.toString());
		System.out.println(m1);
		
	}

}
