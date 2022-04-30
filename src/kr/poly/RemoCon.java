package kr.poly;

public interface RemoCon { // 객체 생성 불가. RemoCon r = new RemoCon(); 
	
	// 상수를 사용 가능 - RemoCon.MAXCH
	public static final int MAXCH = 100; // public static final이 생략되어있음
	int MINCH = 1;
	
	public abstract void chUp(); // interface는 abstract가 생략되있음
	public void chDown();
	public void internet();
}
