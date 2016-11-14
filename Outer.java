public class Outer {

	class Inner {

	}

	public String toString() {
		Inner i = new Inner();
		return "Outer [" + i.toString() + "]";
	}

	public static void main(String [] args) {
		
		Outer o = new Outer();
		System.out.println("o=" + o.toString());

		//System.out.println(toString());

		//Inner i = new Inner();

	}


}