package multiplicationTable;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		
		System.out.println("������ �� ����� ����? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("����ڰ� �Է��� �� : " + number);
		
		for (int i = 1 ; i < 10 ; i++) {
			System.out.println(number+"X" + i + "=" + number * i);
		}
		
	}

}
