package linksocial;

// perant class of inheritance 
public class Linkedin2 extends Linkedin {

	public static void main(String[] args) {

		Linkedin2 Linkedin2 = new Linkedin2();
		System.out.println("LINKED IN WEBSITE");
		Linkedin2.Name(" Himanshu Puriohit");
		Linkedin2.Email("purooihit@gmail.com");
		Linkedin2.Number(+966090746);
		Linkedin2.address("Mavli");

	}

	private void address(String address) {
		System.out.println("Your Address Is " + address);

	}

}