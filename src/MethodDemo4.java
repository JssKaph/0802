
public class MethodDemo4 {
	public static void main(String[] args) {
//	static void mymethod(int su, double weight, char grade, String str) { //받을 때는 갯수, 순서 일치 + 타입 일치
		int original = 5;
		System.out.println("Before Calling method, target = " + original);
		mymethod(original);
		System.out.println("After calling method, target = " + original); // 복사가 안됨
		
	
	}
//	static void mymethod(Student mystudent) { // 주소(student)가 넘어오면 주소(student)로 받는다 (call bu reference)
	static void mymethod(int target) {
		System.out.println("In method, target = " + target);
		target = 100;
		System.out.println("In method, target = " + target);
	}
}
