
public class ArrayDemo4 {
	public static void main(String[] array) {
		//cmd에 입력 : java ArrayDemo4 45 + 78 
//		for(int i=0; i<array.length; i++) {
//			System.out.println("array["+i+"] = "+ array[i]);
			//array[0]= 45 array[1]= +  array[2]= 78
//	}
			if(array.length !=3) {
				System.err.println("Usage Error");
				System.exit(-1); //0은 정상종료 -1은 비정상 종료	
			
			int first = Integer.parseInt(array[0]); //글자 45를 숫자 45로 바꿔줌
			int second = Integer.parseInt(array[2]); //"78" -> 78
			
			switch(array[1]) { // 스위치 쓸때 중요한것 4가지 알것
			case "+" : System.out.printf("%d + %d = %d\n",first , second, (first+second));
			break;
			case "-" : System.out.printf("%d - %d = %d\n",first , second, (first-second));
			break;
			case "x" : System.out.printf("%d x %d = %d\n",first , second, (first*second));
			break;
			case "/" : System.out.printf("%d / %d = %d\n",first , second, (first/second));
			break;
			case "%" : System.out.printf("%d %% %d = %d\n",first , second, (first%second)); // %%두번 사용 하여야 %연산자
			default : System.out.println("그런 연산자는 없습니다.");
			}
		}
	}
}
