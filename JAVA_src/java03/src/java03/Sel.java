package java03;

import java.util.Scanner;

public class Sel {

	public static void main(String[] args) {
		//컨트롤+쉬프트+O(영문자)
		//3. 입력값을 받아서, 학점계산
		//90점이상 A
		//80점이상 B
		//70점이상 C
		//60점이상 D
		//아니면 F
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 점수 입력:");
		int jumsu = sc.nextInt();
		if(jumsu >= 90) {
			result = "A";
			
		}else if(jumsu >= 80) {
			result = "B";
			
		}else if(jumsu >= 70) {
			result = "C";
			
		}else if(jumsu >= 60) {
			result = "D";
			
		}else if{
			result = "F";
		}
		
		
		System.out.println("당신의 학점은" + result = "입니다.");
		
		System.out.println(result + "학점의 학생은 이번 학기에");
		
	}// main end.

}// class end.
