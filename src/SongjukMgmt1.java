import java.util.Scanner;

public class SongjukMgmt1 {
	public static void main(String[] args) {
		System.out.println("성적 관리 프로그램 시작");
		Student jimin = new Student();
		Input.input(jimin); // Input class 메소드 불러오기 (static 이기 때문에 주소없이 불러오기 가능)
		Calc.calc(jimin); // Calc class 메소드 불러오기
		Output.output(jimin); // Output class 메소드 불러오기	
		System.out.println("성적 관리 프로그램 끝");
	}
}
