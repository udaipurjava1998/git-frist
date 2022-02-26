package variable;    // 2 VARIABLE IN CLASS AND 1 VARIBLE IN LOCAL 

public class abcDemo {

	static int i = 10;
	int j = 5;

	public static void main(String[] args) {

		int k = 2;
		System.out.println(i);

		abcDemo abcDemo = new abcDemo();
		System.out.println(abcDemo.j);

		System.out.println(k);
	}

}
