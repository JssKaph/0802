
public class ArrayDemo1 {
	public static void main(String[] args) {
		//<<Rectangular Array>>
		
		//1st way
//		int [][] array= null; // Declaration 선언
//		array = new int[2][3]; // Creation 생성 4x6 24바이트의 공간
//		array [0][0] = (int)(Math.random()*10+1); // Assignment 할당 1~10까지
//		array [0][1] = (int)(Math.random()*10+1);
//		array [0][2] = (int)(Math.random()*10+1);
//		array [1][0] = (int)(Math.random()*10+1);
//		array [1][1] = (int)(Math.random()*10+1);
//		array [1][2] = (int)(Math.random()*10+1);
		
		//2nd way
//		int [][] array; // 선언
//		array = new int [][] {{3,4,5,6}, {7,8,9,10}}; // Creation & Assignment 생성 할당
		
		//3rd way
//		int [][] array = { //컴파일러가 new를 만들어 준다.
//				{1,2,3,4},
//				{5,6,7,8},
//				{9,10,11,12}
//		};
		
		//<<Ragged(Jagged) Array>>
		// 자바는 각층의 열의 갯수는 다를 수 있다.
		
		//1st way
//		int [][] array; 
//		array = new int[3][];
//		array[0] = new int[3]; //1행에 3열
//		array[1] = new int[2]; //2행에 2열
//		array[2] = new int[1]; //3행에 1열
//		array[0][0] = (int)(Math.random()*10+1);
//		array[0][1] = (int)(Math.random()*10+1);
//		array[0][2] = (int)(Math.random()*10+1);	
//		array[1][0] = (int)(Math.random()*10+1);	
//		array[1][1] = (int)(Math.random()*10+1);	
//		array[2][0] = (int)(Math.random()*10+1);	
		
		//2rd way
//		int [][] array;
//		array = new int [3][];
//		array[0] = new int[] {3,4,5,6,7,8};
//		array[1] = new int[] {9,10};
//		array[2] = new int[] {11,12,13,14};
		
		//3nd way
		int [][] array = {
				{3,4,5,6,},
				{7,8},
				{9,10,11,12,13,14}
		};
		//자바는 메모리에 표로 만들어 지지 않기 때문에 열의 갯수가 달라도 상관 없다.
		//각행은 열에대한 주소이다.
		
		for (int i=0; i<array.length; i++) { // 행의 갯수 까지
			System.out.println("array"+i+"층");
			for (int j=0; j<array[i].length; j++) { //i층의 length (각 층의 길이)
				System.out.print("array["+i+"]["+j+"] = "+array[i][j]+"\t\t");
			}
			System.out.println();
		}
	}
}
