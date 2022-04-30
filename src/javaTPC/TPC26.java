package javaTPC;

import kr.poly.*;

public class TPC26 {

	public static void main(String[] args) {
		// 인터페이스
		//RemoCon r = new RemoCon(); // 불가
		
		RemoCon r = new TV();
		r.chUp();
		r.chDown();
		r.internet();
		
		r = new Radio();
		r.chUp();
		r.chDown();
		r.internet();

	}

}
