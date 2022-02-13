package variable;

public class int_a_b_c_return {

	public int plus(int a, int b) {
    System.out.println("adding");
    int c = 0;
	
	c=a+b;
	return c;

	}
	

	public static void main(String[] args) {
		int_a_b_c_return int_a_b_c_return = new int_a_b_c_return ();
				int a = int_a_b_c_return.plus(5, 5);
		System.out.println(a);
	}

}
