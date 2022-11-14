package day02.basic;
/*
 * [[기본 자료형]]
 * 1. 논리형 (boolean)
 * 
 *  - 선언방법
 *  	boolean 변수명;
 *  
 *  - 가질수 있는 범위 : true, false 두가지 값 저장 가능. 
 * 
 *  
 */
public class Mainclass02 {
//	boolean isGloabal = ; //지역변수 -> 사라지지X
	
	public static void main(String[] args) {
		// 논리형 지역변수 선언하기 
		boolean iswait;
		// 선언한 변수에 값 대입하기
		iswait = true;
		// 저장된 값을 문자열로 출력하기
		System.out.println("논리형 변수에 저장된 값 : "+iswait);
		
		// 지역변수는 일반적으로 선언과 동시에 값을 넣어주어야 한다.
		boolean canRun = false; //변수 선언과 동시에 값 대입
		
		//변수에 저장된 값을 실행도중에 바꿀수 있다.
		iswait = false;
		canRun = true;
		
		// 줄복사 ctrl + art + 방향키 아래
		// 줄삭제 ctrl + D
		System.out.println("iswait : "+iswait);
		System.out.println("canRun : "+canRun);
		
//		 주석 퍼리 ctrl + /
		boolean isArea; // 초기화 
//		System.out.println(isArea);
		
	}

}
