package 반복문;

import java.util.Scanner;

public class WhileTest4 {

	public static void main(String[] args) {
		//두개의 입력값을 받아서,
		//첫번째값부터 두번째값까지 더함
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		System.out.println("숫자1입력:");
		int num1 =sc.nextInt();
		System.out.println("숫자2입력:");
		int num2 =sc.nextInt();
		
		int sum = 0;
		while(num1 <= num2) {
			sum = sum + num1;
			num1++;
			
		}
		System.out.println("");

	}

}
