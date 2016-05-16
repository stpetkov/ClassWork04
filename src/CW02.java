
public class CW02 {

	public static void main(String[] args) {
		int array[][] = new int[4][4];
		int a = 0;
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				array[i][j] = a++;
				System.out.print(array[i][j] + " ");

			}
			System.out.println("  ");
		}
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				if (array[i][j] % 2 != 0) {
					array[i][j] *= 2;
				}
				System.out.print(array[i][j] + " ");
			}
			System.out.println("  ");
		}

	}
}
