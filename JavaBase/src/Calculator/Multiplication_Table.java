package Calculator;

public class Multiplication_Table {
	public static void main(String[] args) {
		// 구구단 만들기
		for (int i = 3; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%2d X%2d= %d", i,j, i*j);
			}
			System.out.println("\n");
		}

	}
}
