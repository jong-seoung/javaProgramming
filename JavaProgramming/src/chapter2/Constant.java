package chapter2;

public class Constant {

	public static void main(String[] args) {
		final int Max_num = 100;		
		final int Min_num;
		
		Min_num = 0;
		
		System.out.println(Max_num);
		System.out.println(Min_num);
		
		//Max_num = 1000; - 오류 발생 : 상수는 값을 변경할수 없음 

	}

}
