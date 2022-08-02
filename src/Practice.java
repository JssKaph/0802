//2차원 배열

public class Practice {
	public static void main(String[] args) {
		int [] dap = {1,2,3,4,1,2,3,4,1,2};
		int [][] array = {
				{1,2,2,4,2,2,3,4,1,2},
				{1,2,3,4,1,1,1,4,1,1},
				{1,2,3,4,1,2,3,4,1,2},
				{1,3,3,3,3,3,3,3,1,2},
				{1,2,3,4,1,2,3,1,1,2}
		};
		char[][] array1 = {
				{'a','a','a','a','a','a','a','a','a','a'},
				{'a','a','a','a','a','a','a','a','a','a'},
				{'a','a','a','a','a','a','a','a','a','a'},
				{'a','a','a','a','a','a','a','a','a','a'},
				{'a','a','a','a','a','a','a','a','a','a'},
		};
		int i, j;
		int count=0;
		int cnt1=0;
		int cnt2=0;
		int[] score = {0,0,0,0,0};
		for (i=0; i<array.length ; i++) {
			for (j=0; j<array[i].length; j++) {
				if (array[i][j] == dap[j]) { 
					array1[i][j] = 'o'; 
					score[i] += 10;
				}
				else {
				array1[i][j] = 'x';		
				}
				System.out.print(array1[i][j]);
			}
			System.out.println();	
			System.out.println(score[i]);
		}	
	}
}
