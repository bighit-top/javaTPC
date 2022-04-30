package javaTPC;

import java.util.ArrayList;
import kr.inflearn.ObjectArray;
import kr.tpc.*;

public class TPC37 {

	public static void main(String[] args) {
		
		// 자체 API - ObjectArray
//		ObjectArray arr = new ObjectArray(5);
		ArrayList arr = new ArrayList(5); // Object[], 배열의 길이에 제약이 없
		arr.add(new A());
		arr.add(new B());
		arr.add(new A());
		arr.add(new B());
		arr.add(new B());
		arr.add(new A());
		arr.add(new B());
		arr.add(new A());
		arr.add(new B());
		arr.add(new B());
		
		for(int i=0; i<arr.size(); i++) {
			Object o = arr.get(i);
			if(o instanceof A) {
				((A)o).go();
			} else {
				((B)o).go();
			}
		}
		
	}

}
