package java03;

import java.util.Random;
import java.util.Scanner;

public class IfTest6 {

	public static void main(String[] args) {
		int targer = 55;
		Scanner sc = new Scanner(System.in);
		Random random =new Random();
		int target = random.nextInt(100);
		while(true) {
			int count = 0;
			count = count + 1;
			System.out.println("당신이 생각한 숫자를 입력해보세요>>");
			int guess = sc.nextInt();
			if(target == guess) {
			System.out.println("정답입니다.");
			System.out.println("당신이 시도하는 횟수는" + count);
			
			break;
			
		}else {
			System.out.println("정답이 아닙디다");
			System.out.println("다시 입력해 주세요.");
			if (target < guess) {
				System.out.println("정답보다 너무 커요");
				}else {
					System.out.println("정답보다 너무 작아요");
				}
			
			}
		}
		}

	}//main


