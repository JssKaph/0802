
public class MethodDemo3 {
	public static void main(String[] args) {
//		System.out.println(mymethod(50));
//	}
//	static String mymethod(int su) { // 문자열은 void말고 String 사용, 정수는 int, 실수는 double
//		//return; 리턴은 한번에 한개, 여러개 리턴 불가능 if문 사용시 경우에따라 여러 리턴 사용 가능
//		if(su%2==0) 
//			return "Hello";
//			else return "World"; //문자열 리턴

//	}		
//		static int[] mymethod() { // 배열 타입
//		return new int[] {5, 9,4,5,6,7,8,9};	// 배열리턴
	}
		static Student mymethod() { // 객체로 호출
			Student jimin = new Student();
			jimin.name = "한지민";
			jimin.age=26;
			return jimin; //객체 리턴
			
		
	}
}
