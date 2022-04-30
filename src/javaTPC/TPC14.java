package javaTPC;

import kr.tpc.MemberVO;

public class TPC14 {

	public static void main(String[] args) {
		// 정보은닉
		MemberVO m = new MemberVO(); 
//		m.name = "김우빈";
//		m.age = 34;
//		m.tel = "010-0000-0000";
//		m.addr = "서울";
//		
//		System.out.print(m.name+"\t");
//		System.out.print(m.age+"\t");
//		System.out.print(m.tel+"\t");
//		System.out.println(m.addr);
		
		m.setName("김우빈");
		m.setAge(34);
		m.setTel("010-0000-0000");
		m.setAddr("서울");
		
		System.out.print(m.getName()+"\t");
		System.out.print(m.getAge()+"\t");
		System.out.print(m.getTel()+"\t");
		System.out.println(m.getAddr());
		
	}

}
