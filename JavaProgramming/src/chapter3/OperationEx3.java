package chapter3;

public class OperationEx3 {

	public static void main(String[] args) {
		int num = 10;
		int i = 2;
		
		boolean value = ((num = num + 10 ) < 10 ) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);		//�� ������ ���� ���� �����̸� �� ���� ������� �ʾ� i ���� �״��
		
		value = ((num = num + 10) > 10 ) || ((i = i + 2 ) < 10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);		//�� ������ ���� ���� ���̸� �� ���� ������� �ʾ� i ���� �״��

	}

}
