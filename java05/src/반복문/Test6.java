package 반복문;

public class Test6 {

	public static void main(String[] args) {
		int start = 1;
		int mul = 1;
		while(start<10) {
			mul = mul * start;
			start = start + 1;
		}
		System.out.println(mul);
	}

}
