package day03.loop;

/*
 * 
 * break문
 * 반복문 종료
 * 
 */

public class Mainclass06 {
	public static void main(String[] args) {
		for(int i =0; i<5; i++) {
			if(i ==3) {
				break;			//제일 가까운 반복문 종
			}
			System.out.println("i : "+i);
		}
	}

}
