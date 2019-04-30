package 반복문;

public class whiletest2 {

	public static void main(String[] args) {
		int start = 1;//초기값
		int sum = 0;
		while(start <= 10) {
			//1부터 10까지 더해줌
			sum = sum + start;
			start = start + 1;//증감식
			//start++;도 가능
			
		}
		System.out.println(sum);
		

	}

}
