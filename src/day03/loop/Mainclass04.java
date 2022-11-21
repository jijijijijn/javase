package day03.loop;
/*
 * 
 * for 반복문 연습
 주말 숙제 2중 for문 코드 분석하기
 
 
 2번 숙제
       *
      ** 
     ***
    ****
   *****
  ******
 *******
 만들기
 
 3번
  		*
       *** 
      *****
     *******
    *********


4번 
  		
       * 
      ***
     *****
    *******						-> if문..
     *****
      ***
       *
 
 */

public class Mainclass04 {
	public static void main(String[] args) {
		//1번 숙제
		for(int i = 0; i <7; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
