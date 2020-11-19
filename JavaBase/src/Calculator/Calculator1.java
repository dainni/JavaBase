package Calculator;

import java.util.Scanner;

//java 프로그램 작성 툴
public class Calculator1 {
	public static void main(String[] args) {

		// if문을 사용한 계산기
		int one, two;
		int click;
		int result;

		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 계산할 값을 입력하세요:)");
		one = s.nextInt();

		System.out.println("<1>덧셈 <2>뺄셈 <3>나눗셈 <4>곱셈");
		click = s.nextInt();

		System.out.println("두번째 계산할 값을 입력하세요:)");
		two = s.nextInt();

		if (click == 1) {
			result = one + two;
			System.out.println(one + " + " + two + " = " + result);
		} else if (click == 2) {
			result = one - two;
			System.out.println(one + " - " + two + " = " + result);
		} else if (click == 3) {
			result = one / two;
			System.out.println(one + " / " + two + " = " + result);
		} else if (click == 4) {
			result = one * two;
			System.out.println(one + " * " + two + " = " + result);
		}
	}
}
