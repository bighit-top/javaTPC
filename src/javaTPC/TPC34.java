package javaTPC;

public class TPC34 {

	public static void main(String[] args) {
		
//		java.lang.String str = new java.lang.String("APPLE");
		String str = new String("APLLE");
		String v = str.toLowerCase();
		System.out.println(v);
		System.out.println(str.charAt(3));
		System.out.println(str.length());
		System.out.println(str.indexOf("PL"));
		System.out.println(str.indexOf("PX"));
		System.out.println(str.replaceAll("L", "X"));
		
	}

}
