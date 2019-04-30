package 반복문;

import java.util.Scanner;

public class S {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 수를 입력하세요");
		System.out.println("숫자1입력:");
		int num1 =sc.nextInt();
		System.out.println("숫자2입력:");
		int num2 =sc.nextInt();
		System.out.println("숫자3입력:");
		int num3 =sc.nextInt();
		int sum = 0;
		while(true) {
			sum = num1 + num2 + num3;
			break;
		}
		System.out.println("세 수를 더한 값은" + sum);
		
	}

}
