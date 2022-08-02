import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int [][] array = {
				{1,2,3,4,5,},
				{10,9,8,7,6,5,4,3,2,1}
		};
		//서로의 행을 바꿔 보자.
		System.out.println("Before Swapping");
		System.out.println("<<0층>>");
		System.out.println(Arrays.toString(array[0]));
		System.out.println("<<1층>>");
		System.out.println(Arrays.toString(array[1]));
		
		int[] temp = array[0]; // 임시변수에 임시로 저장하고 교환 (주소 복사)
		array[0] = array[1];
		array[1] = temp;
		
		System.out.println("Before Swapping");
		System.out.println("<<0층>>");
		System.out.println(Arrays.toString(array[0]));
		System.out.println("<<1층>>");
		System.out.println(Arrays.toString(array[1]));
	}
}
