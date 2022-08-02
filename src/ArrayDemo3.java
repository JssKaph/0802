import java.util.Arrays;

public class ArrayDemo3 {
	public static void main(String[] args) {
//		String [] array = {"Hello", "World", "한지민", "정수승"}; // 번지 저장
//		for(int i=0; i<array.length; i++) { // 자바는 방의 갯수를 런타임때 결정하기 때문에 "변수.length"를 사용해야 오류가 생기지 않는다.
//			System.out.println(array[i]);
//		}
		
//		int [] array = {1,2};
//		array = new int[3]; // 2번째 방 주소를 새로 받는다.(오류가 생기기 때문에)
//		array[2] = 3; // 2번째 방이 없어 오류가 난다. <<배열은 늘어나지 않는다.>>
		
		//값 복사
		// 갯수도 신경쓰고, 범위도 신경 써야함
		// system.arraycopy() 메소드 사용
		int [] original = {1,2,3,4,5};
		int [] target = {10,9,8,7,6,5,4,3,2,1};
//		System.arraycopy(original, 2, target, 0, 3); //original의 3,4,5를 target의 10, 9 ,8에 덮어쓰기 (메소드 사용)
//		System.out.println(Arrays.toString(target));
//		original[2] = 100; // 값이 바뀌었기 때문에 바뀌지 않는다.
//		System.out.println(Arrays.toString(target));
//		System.arraycopy(original, 0, target, 9, 5); // 오리지날의 0번째 값부터 타겟의 9번째 방에 5개 집어넣겠다, <오류> 타겟의 어디서 부터 넣을 것인지 잘 정해야 한다.
	}
}
