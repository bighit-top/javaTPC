package javaTPC;

import kr.tpc.*;

public class TPC32 {

	public static void main(String[] args) {
		// Oracl, MySQL - > Driver class
		Dbconnect conn = new JavaOracle();
		conn.getConnection("url", "id", "password");
		
		conn = new JavaMySQL();
		conn.getConnection("url", "id", "password");

	}

}
