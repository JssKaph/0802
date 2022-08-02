
public class MethodDemo {
	public static void main(String[] args) { // main 또한 메소드이다.
		System.out.println("Program is Starting...");
		MethodDemo md = new MethodDemo();
		md.makeSum(); 
		md.makeSum(); 
		System.out.println("Program if Over...");
	}

	void makeSum() { // 이름이 있어야한다, 메소드엔 ()가 들어감, 끝나고 나면 복귀를 위한 리턴 타입, = 메소드의 필수 3요소
		System.out.println("Method is Start...");
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println("sum = " + sum);
		System.out.println("Method is Over...");
	}
}
