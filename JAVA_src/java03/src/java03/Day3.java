package java03;

public class Day3 {

	public static void main(String[] args) {
		/*오늘 아침에 대한 정보 출력(변수에 저장해서 출력)
		 * ------------------
		 * 오늘 아침을 먹고 왔나요? true
		 * 오늘 타고 온 버스의 번호나 지하철 노선은? 정수로2호선
		 * 오늘은 어제(10.5)보다 5.5도 낮아요. 오늘의 온도는:9
		 * 오늘부터 프로젝트 함께 할 우리의 조원의 이름은: 홍길동
		 */
		boolean br = true;
		int tr = 2;
		double tem1 = 10.5;
		double tem2 = 9;
		double result = tem1 - tem2;
		String name = "홍길동";
		System.out.println("오늘 아침을 먹고 왔나요?" + br);
		System.out.println("오늘 타고 온 버스의 번호나 지하철 노선은?" + tr +"호선");
		System.out.println("오늘은 어제(" + tem1 + ")보다" + result +"도 낮아요." + "오늘의 온도는:"+tem2);
		System.out.println("오늘부터 프로젝트 함께 할 우리의 조원의 이름은:"+name);
		
	
	}

}
