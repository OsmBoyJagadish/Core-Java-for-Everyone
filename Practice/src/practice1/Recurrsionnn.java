package practice1;

public class Recurrsionnn {

	public static void mul(int i) {
		if (i <= 10) {
			System.out.println(2 * i);
			mul(i + 1);
		}
	}

	public static void main(String[] args) {
		mul(1);

	}
}
