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
 * 오버로딩
 *		메소드 명이 같아도, 매개변수 갯수 또는 타입이 다르면 사용가능
 * 
 * 
 */
public class Mainclass01 {
	public static String name;	//전역변수 name 선언
	
	public static void main(String[] args) {
		System.out.println("main method 시작");
		
		//hello 메소드 호출하기
		hello();
		
		//printName 메소드 호출하기
		PrintName("혜진");
		setName("피카츄");
		
		String strName = getName();
		
		System.out.println("전역변수 name: "+strName);

		
		String eMon = getEvolution("꼬부기");

		System.out.println(eMon);

	}
	//인자 x 리턴 x - 실행하고 끝나는 메소드
	public static void hello() {
		System.out.println("Hello world");

	}
	//인자(매개변수) O 리턴 X
	public static void PrintName(String name) {
		System.out.println(" 이름: "+ name);
	}
	
	//오버로딩메서드	인자(매개변수)O 리턴 X
	public static void printName(String name, int age) { //-> // 오버로드
		System.out.println(" 이름: "+ name);
		System.out.println(" 나이: "+ age);
		
	}
	
	//인자O 리턴X -> 매개변수를 전역변수 name에 대입
	public static void setName(String name) {
		Mainclass01.name = name;
		
	}
	
	//인자X 리턴 O -> 전역변수 name을 변환 한다.
	public static String getName() {
		return name;	//Mainclass01.name
		
		
	}
	
	
	public static String getEvolution(String mon) {
		String eMon = "";
		if(mon.equals("꼬부기")) {
			eMon="어니부기";
		}else if(mon.equals("어니부기")) {
			eMon="거북왕";
		}
		
		return eMon;
		
	}
	
	
}









