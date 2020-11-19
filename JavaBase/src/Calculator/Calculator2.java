package Calculator;

import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] agrs) {

		int one;
		int two;
		char cmt;
		int result;

		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요:) ");
		one = s.nextInt();

		System.out.println("연산자를 입력하세요:) ");
		cmt = s.next().charAt(0);

		System.out.println("두번쪠 수를 입력하세요:) ");
		two = s.nextInt();

		if (cmt == '+') {
			result = one + two;
			System.out.println(one + "+" + two + "=" + result);
		} else if (cmt == '-') {
			result = one - two;
			System.out.println(one + "-" + two + "=" + result);
		} else if (cmt == '*') {
			result = one - two;
			System.out.println(one + "-" + two + "=" + result);
		} else if (cmt == '/') {
			result = one / two;
			System.out.println(one + "-" + two + "=" + result);
		} else {
			System.out.println("잘못 입력하셨습니다");
		}

	}

}
