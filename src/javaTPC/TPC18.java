package javaTPC;


//import java.lang.*;
import kr.tpc.*;
import com.google.gson.Gson;

public class TPC18 {

	public static void main(String[] args) {
		// 1. Java에서 제공해주는 class : API
		// 문자열(String)
		String str = new String("Apple");
		System.out.println(str.toLowerCase());
		
		// 2. 직접 만들어서 상용하는 class : DTO/VO, DAO, Utillity - API
		MyUtil my = new MyUtil();
		int sum = my.hap();
		System.out.println(sum);
		
		// 3. 다른 회사에서 만들어 놓은 class : OpenAPI
		// Gson -> json : https://mvnrepository.com/
		Gson g = new Gson();
		BookVO vo = new BookVO("Java", 15000, "영진", 700);
		String json = g.toJson(vo);
		
		System.out.println(json);
		
	}

}
