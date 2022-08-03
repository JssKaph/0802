//2차원 배열

public class Practice {
	public static void main(String[] args) {
//		int [] dap = {1,2,3,4,1,2,3,4,1,2};
//		int [][] array = {
//				{1,2,2,4,2,2,3,4,1,2},
//				{1,2,3,4,1,1,1,4,1,1},
//				{1,2,3,4,1,2,3,4,1,2},
//				{1,3,3,3,3,3,3,3,1,2},
//				{1,2,3,4,1,2,3,1,1,2}
//		};
//		char[][] array1 = {
//				{'a','a','a','a','a','a','a','a','a','a'},
//				{'a','a','a','a','a','a','a','a','a','a'},
//				{'a','a','a','a','a','a','a','a','a','a'},
//				{'a','a','a','a','a','a','a','a','a','a'},
//				{'a','a','a','a','a','a','a','a','a','a'},
//		};
//		int i, j;
//		int count=0;
//		int cnt1=0;
//		int cnt2=0;
//		int[] score = {0,0,0,0,0};
//		for (i=0; i<array.length ; i++) {
//			for (j=0; j<array[i].length; j++) {
//				if (array[i][j] == dap[j]) { 
//					array1[i][j] = 'o'; 
//					score[i] += 10;
//				}
//				else {
//				array1[i][j] = 'x';		
//				}
//				System.out.print(array1[i][j]);
//			}
//			System.out.println(score[i]);
//			System.out.println();	
//		}	
		
		//강사 코드
		//배열 선언하기
		int [] answer = {1,2,3,4,1,2,3,4,1,2}; // 정답
		String [] names = {"한지민","박지민","홍지민","신지민","김지민"}; // 배열은 다른 타입을 섞을 수 없기 때문에 이름 배열을 따로 선언
		int [][] array = { // array의 각 행은 names의 각 열과 일치한다, 답안지 배열
				{1,2,2,4,2,2,3,4,1,2},
				{1,2,3,4,1,1,1,4,1,1},
				{1,2,3,4,1,2,3,4,1,2},
				{1,3,3,3,3,3,3,3,1,2},
				{1,2,3,4,1,2,3,1,1,2}
		};
		char [][] results = new char[names.length][10]; // ox 배열 선언
		int [] jumsus = new int[names.length]; //점수 배열 선언
		
		//계산 하기
		for (int i=0; i<results.length; i++) { //5행 (세로) ??
			int jumsu = 0; // 점수 초기화
			for (int j =0; j<results[i].length; j++) { // 10열 (가로) ??
				if(array[i][j] == answer[i]) { // 답안지와 정답이 일치하나?
					results[i][j] = 'O'; // 문자열 배열에다가 O 삽입
					jumsu += 10; // O 삽입할 때 마다 10점 중첩
			}
				else 
					results[i][j] = 'X'; // 나머지는 X 삽입
			}
			jumsus[i] = jumsu; // 점수 배열에 중첩 계산된 점수 저장
		} 
		// 출력 for문
		for(int i=0; i<results.length; i++) { //세로 5줄
			System.out.print(names[i]+" : "); // 이름 출력
			for(int j=0; j<results[i].length; j ++) { // 가로 10줄
				System.out.printf("%c\t", results[i][j]); // OX 출력
			}
			System.out.println("(" + jumsus[i] + "점)"); // 점수 출력
		}
		
	}	
}
