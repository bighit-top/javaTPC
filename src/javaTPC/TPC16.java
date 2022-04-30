package javaTPC;

import kr.tpc.OverLoad;

public class TPC16 {

	public static void main(String[] args) {
		// 
		OverLoad ov = new OverLoad();
		ov.hap(20, 50);		// ov.hap_int_int(20,50)
		ov.hap(23.4f, 50);	// ov.hap_float_int(23.4f,50)
		ov.hap(30, 50.5f);	// ov.hap_int_float(30,50.5f)
	}

}
