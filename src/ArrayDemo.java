import java.util.Arrays; // 배열 객체

public class ArrayDemo {
	public static void main(String[] args) {
		int [] array = {4,7,2,1,5,8,3,8,6,2,6,9,};
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(array)); // 문자열로 출력 해 줌
		
		Arrays.sort(array); // 오름차순 객체 사용
		System.out.println("After Ascding Sorting");
		System.out.println(Arrays.toString(array)); // 문자열로 출력 해 줌
	
		System.out.println("After Descding Sorting");
		System.out.print("[");
		for(int i = array.length -1; i>=0; i--) { // 주소를 거꾸로 생성
			System.out.print(array[i] + ", ");
		}
		System.out.println("]");
	}
}
