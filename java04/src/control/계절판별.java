package control;

import java.util.Date;

public class 계절판별 {

	public static void main(String[] args) {
		Date date = new Date();
		int month = date.getMonth() +1;
		
		String result = ""; 
		
		switch(month) {
		case 3: case 4: case 5:
			result = "봄"; break;
		case 6: case 7: case 8:
			result = "여름"; break;
		case 9: case 10: case 11:
			result = "가을"; break;
		default:
			result = "겨울";
			break;
			
		}
		System.out.println(result);
	}
}
		
	/*	if(3 <= month && month<=5) {
			result = "봄";
			
		}else if(6 <= month && month <= 8) {
			result = "여름";
			
		}else if(9 <= month && month <= 11) {
			result = "가을";
		}else if(12 <= month && month <= 2)
			result = "겨울";
		
		
	
		System.out.println("지금은"+ month +"월,"+ result);
		
		
		

	}*/
