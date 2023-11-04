package UnaryOperator;

public class PreIncrement3 {

	public static void main(String[] args) {
		int a=10;
		int b;
		b=a++ + ++a;
		System.out.println(a);
		System.out.println(b);

	}

}
