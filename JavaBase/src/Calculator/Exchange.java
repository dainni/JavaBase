package Calculator;

import java.util.Scanner;

public class Exchange {
	public static void main(String[] args) {

		int money;
		int oback, back, oship, ship;

		Scanner s = new Scanner(System.in);
		System.out.println("교환할 돈을 입력하세요:)");
		money = s.nextInt();

		oback = money / 500;
		money = money % 500;

		back = money / 100;
		money = money % 100;

		oship = money / 50;
		money = money % 50;

		ship = money / 10;
		money = money % 10;

		System.out.printf("500 : %d\n", oback);
		System.out.printf("100 : %d\n", back);
		System.out.printf("50 : %d\n", oship);
		System.out.printf("10 : %d\n", ship);
		System.out.printf("나머지 : %d\n", money);

	}

}
