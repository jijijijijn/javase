package day03.operator;

/*
 * 3. 비교 연산자
 * 
 * 	>  : 크다
 * 	>= : 크거나 같다
 * 	<  : 작다
 * 	<= : 작거나 같다
 * 	== : 같다
 * 	!= : 다르다
 * 
 *  비교한 결과값 boolean 타입으로 실행
 * 
 * 
 */

public class Mainclass03 {
	public static void main(String[] args) {
		boolean result = 10 > 20;
		System.out.println("10 > 20 : "+result);
		if(result) {
			System.out.println("10은 20보다 작다");
		}
		
		if(10==10) {
			System.out.println("10은 10과 같아요");
		}
		
		if(10!=20) {
			System.out.println("10과 20은 달라요");
		}
	}

}
