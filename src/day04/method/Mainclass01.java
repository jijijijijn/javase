package day04.method;
/*
 * [[메소드]]
 *	어떤 특정 작업을 수행하기 위한 명령문의 집합
 *
 * 	접근제어자(정작[static사용여부]) 반환타입 메소드이름(메게변수타입 매개변수명){// 선언부
 * 		명령뮨	// 구현부
 * 		
 * 		return //반환값;
 * 
 * }
 * 
 * 
 */
public class Mainclass01 {
	public static void main(String[] args) {
		System.out.println("main method 시작");
		
		//hello 메소드 호출하기
		hello();
		
		//printName 메소드 호출하기
		PrintName("혜진");

	}
	//인자 x 리턴 x - 실행하고 끝나는 메소드
	public static void hello() {
		System.out.println("Hello world");

	}
	
	public static void PrintName(String name) {
		System.out.println(" 이름: "+ name);
	}
	
	
}
