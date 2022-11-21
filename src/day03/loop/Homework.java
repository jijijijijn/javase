package day03.loop;

public class Homework {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) { 				// 줄(행,세로 의미)
//			for (int j = 0; j <= i; j++) {			// 칸(열,가로 의미)
//				System.out.print("*");
//			}
			for (int j = 7; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("3번===================");

		for (int i = 0; i < 7; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
			for (int j = 7; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int m = 1; m <= i; m++) {
				System.out.print(" ");
			}
			System.out.println(" ");

		}
		System.out.println("else=====================");
		for(int i =0; i<7; i++) {
			for(int j =0; j<7; j++) {
				System.out.print(" ");
				
			}
		}
		
/*
 * 4번 
  		
       * 
      ***
     *****
    *******						-> if문..
     *****
      ***
       *
 
 * 
 */
		System.out.println("4번================");

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i < 4) {
					if (j + i < (7 / 2)) {
						System.out.print(" ");
					} else if (j - i > (7 / 2)) {
						System.out.print(" ");

					} else {
						System.out.print("*");
					}
				} else if (i - j > 3) {
					System.out.print(" ");
				} else if (i + j > 9) {
					System.out.print(" ");

				} else {
					System.out.print("*");
				}

			}
			System.out.println(" ");

		}

	}
}







