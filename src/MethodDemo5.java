//값 Swapping

public class MethodDemo5 {
	public static void main(String[] args) {
		int a = 5, b= 9;
		System.out.println("Before swap : a = " +a+", b = "+b);
		swap(a,b);
		System.out.println("After swap : a = " +a+", b = "+b);
		// Call by value 로는 돌아오면 값이 바뀌어 있지 않다. 값 복사의 한계, 스와핑 불가능
	}
	static void swap(int c, int d) {
		System.out.println("In method, Before swap : c = " +c+", d = "+d);
		int temp =c; 
		c=d;
		d=temp;
		System.out.println("In method, After swap : c = " +c+", d = "+d);
	}
}
