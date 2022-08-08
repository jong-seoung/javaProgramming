package multiplicationTable;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("사용자가 입력한 값 : " + number);
		
		for (int i = 1 ; i < 10 ; i++) {
			System.out.println(number+"X" + i + "=" + number * i);
		}
		
	}

}
