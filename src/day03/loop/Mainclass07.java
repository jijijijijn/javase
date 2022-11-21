package day03.loop;

/*
 * continue 문
 * 	반복문 스킵(한번 건너뛰기)
 * 
 */

public class Mainclass07 {
	public static void main(String[] args) {
		for(int i =0; i<5; i++) {
			System.out.println("컨티뉴 전");
			if(i ==3) {
				continue;			//
			}
			System.out.println("i : "+i);
		}
	}

}
