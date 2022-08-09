package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		int num = 10;
		int i = 2;
		
		boolean value = ((num = num + 10 ) < 10 ) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);		//논리 곱에서 앞의 항이 거짓이면 뒷 항이 실행되지 않아 i 값은 그대로
		
		value = ((num = num + 10) > 10 ) || ((i = i + 2 ) < 10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);		//논리 곱에서 앞의 항이 참이면 뒷 항이 실행되지 않아 i 값은 그대로

	}

}
