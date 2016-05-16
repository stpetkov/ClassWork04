
public class CW01 {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
			System.out.print(b[i]);
		}
	}

}
