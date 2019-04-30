package control;

import java.util.Date;

public class 요일 {

	public static void main(String[] args) {
		Date date = new Date();
		int day = date.getDay();
		String result = ""; 
		
		switch(day) {
		case 1:
			result = "학원가는 날"; break;
		case 2:
			result = "동네 도는날"; break;
		case 3:
			result = "운동가는날"; break;
		case 4:
			result = "알바가는날"; break;
		case 5:
			result = "산책하는날"; break;	
		case 6:
			result = "공부하는날"; break;
		default:
			result = "친구만나는나ㅣㄹ";
			break;
			
		}
		System.out.println(result);
		
		
		
		
		
		
		/*if(day == "월요일") {
			System.out.println("학원가는 날");
			
		}else if(day == "화요일") {
			System.out.println("동네 한바퀴 도는 날");
		}else if(day == "수요일") { 
			System.out.println("운동가는 날");
		}else if(day == "목요일") {
			System.out.println("알바가는 날");
		}else {
			System.out.println("친구만나는 날");
		}*/
		
		

	}

}
