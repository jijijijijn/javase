package day04.array;

/*
 *  2중배열
 *  
 *  
 */
public class Mainclass04 {
	public static void main(String[] args) {
		int[][] nums = new int[4][3];
		nums[0][0] = 1;
		nums[0][1] = 2;
		nums[0][2] = 3;
		nums[1][0] = 4;
		nums[1][1] = 5;
		nums[1][2] = 6;
		nums[2][0] = 7;
		nums[2][1] = 8;
		nums[2][2] = 9;
		nums[3][0] = 10;
		nums[3][1] = 11;
		nums[3][2] = 12;

		// 2중 배열 출력하기

		for (int i = 0; i <4; i++) {				// i< nums.length
			for (int j = 0; j <3; j++) {			// i< nums[i].length
				System.out.print(nums[i][j]+" "); 
			}
			System.out.println("");
		}
	}

}
