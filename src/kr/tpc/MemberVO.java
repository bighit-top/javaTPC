package kr.tpc;

public class MemberVO {
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	// default 생성자 - 사용자정의 생성자를 사용하든 사용하지 않든 항상 정의해놓는게 좋다.
	public MemberVO() {}
	
	// 사용자 정의 생성자
	public MemberVO(String name, int age, String tel, String addr) {
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}
	
	
	// setter, getter method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
	
	
	
	
	
	
}
