
public class MethodDemo1 {
	public static void main(String[] args) { // main 또한 메소드이다.
		System.out.println("Program is Starting...");
		MethodDemo1 md = new MethodDemo1();
		md.makeSum(1, 100);  // ()안의 숫자는 반복 횟수 (1부터 last까지 돌린다) 메소드를 값으로 호출한다
		md.makeSum(30, 50); 
		System.out.println("Program if Over...");
	}
	// 메소드 헤더, 선언
	void makeSum(int start,int last) { // 이름이 있어야한다, 메소드엔 ()가 들어감, 끝나고 나면 복귀를 위한 리턴 타입, = 메소드의 필수 3요소 (괄호안에 내용) = Call by Value
		System.out.println("Method is Start...");
		int sum = 0;
		for (int i = start; i <= last; i++) {
			sum += i;
		}
		System.out.println(start +"부터 " +last+ "까지의 sum = " + sum);
		System.out.println("Method is Over...");
		//메소드 바디
	}
}
