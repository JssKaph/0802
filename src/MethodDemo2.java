
public class MethodDemo2 {
	public static void main(String[] args) { // main 또한 메소드이다.
		System.out.println("Program is Starting...");
		MethodDemo2 md = new MethodDemo2();
		int start =1, last = 100; // 지역변수 이기 때문에 중복사용 가능
		int result = md.makeSum(start, last);  // ()안의 숫자는 반복 횟수 (1부터 last까지 돌린다) 메소드를 값으로 호출한다
		System.out.println(start +"부터 " +last+ "까지의 sum = " + result);
		start=30; last =50;
		result = md.makeSum(start, last); 
		System.out.println(start +"부터 " +last+ "까지의 sum = " + result);
		System.out.println("Program if Over...");
	}
	// 메소드 헤더, 선언
	int makeSum(int start,int last) { // 이름이 있어야한다, 메소드엔 ()가 들어감, 끝나고 나면 복귀를 위한 리턴 타입, = 메소드의 필수 3요소 (괄호안에 내용) = Call by Value
	System.out.println("Method is Start...");
		int sum = 0;
		for (int i = start; i <= last; i++) {
			sum += i;
		}
		System.out.println("Method is Over...");
		return sum;
		//메소드 바디
	}
}
