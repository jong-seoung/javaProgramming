package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dnum = 1.2;
		float fnum = 0.9F;
		
		int inum3 = (int)dnum + (int)fnum;
		int inum4 = (int)(dnum + fnum);
		System.out.println(inum3);
		System.out.println(inum4);

	}

}
