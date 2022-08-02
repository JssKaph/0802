//주소 Swapping

public class MethodDemo6 {
	public static void main(String[] args) {
		int[] array = new int[] {5,9}; //주소 = 배열로 만든다 
		System.out.println("Before swap : a = " +array[0]+", b = "+array[1]);
		swap(array);
		System.out.println("After swap : a = " +array[0]+", b = "+array[1]);
		// Call by reference 주소를 사용하기 때문에 스와핑이 가능하다.
	}
	static void swap(int [] array) { //배열이 들어오기 때문에 배열로 변경, 주소에 의한 호출 (Call by reference)
		System.out.println("In method, Before swap : c = " +array[0]+", d = "+array[1]);
		int temp =array[0]; 
		array[0]=array[1];
		array[1]=temp;
		System.out.println("In method, After swap : c = " +array[0]+", d = "+array[1]);
	}
}
