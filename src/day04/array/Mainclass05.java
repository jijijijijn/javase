package day04.array;
/*
다음주까지 숙제!!
1	2	3	4	5	6	7			[0][0] [0][1] [0][2] [0][3] [0][4] [0][5] [0][6] 
8	9	10	11	12	13	14			[1][0] [1][1] [1][2] [1][3] [1][4] [1][5] [1][6] 
15	16	17	18	19	20	21			[2][0] [2][1] [2][2] [2][3] [2][4] [2][5] [2][6] 
22	23	24	25	26	27	28			[3][0] [3][1] [3][2] [3][3] [3][4] [3][5] [3][6] 
29	30	31	32	33	34	35			[4][0] [4][1] [4][2] [4][3] [4][4] [4][5] [4][6] 
36	37	38	39	40	41	42			[5][0] [5][1] [5][2] [5][3] [5][4] [5][5] [5][6] 
43	44	45	46	47	48	49			[6][0] [6][1] [6][2] [6][3] [6][4] [6][5] [6][6] 

1. 2중 배열 선언하고
2. for문으로 값을 1~49까지 위모양으로 넣으세요ㅕ
3. 출력은 지그제그
순서 :
1
2 8
15 9 3
4 10 16 22
6 12 18 24 30 36
43 37 31 25 19 13 7
14 20 26 32 38 44
45 39 33 27 21
28 34 40 46
47 41 35
42 48
49


 */
public class Mainclass05 {
	public static void main(String[] args) {
		int [][] nums = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}
		};
		
		//9시까지 출력하기
		for(int i =0; i<4; i++) {
			for(int j=0; j<=3; j++) {
				System.out.println(nums[i][j]);
			}
			System.out.println("");
		}
		
		
	}

}


























