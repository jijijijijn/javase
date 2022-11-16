package day02.basic;
/*
 * [[형변환]]
 * 
 * 1. 업캐스팅(프로모션)
 * 	- 표현 범위가 더 큰 데이터형으로 변환하기
 * 	- 자동으로 된다.
 * 	- 데이터 손실이 없다.
 * 
 * 2. 다운캐스트(디모션)
 * 	- 표현 범위가 더 작은 데이터형으로 변환하기
 * 	- 명시적으로 헤애한다.
 * 	- 데이터 손실이 있을 수 있다.
 * 
 */
public class Mainclass06 {
	public static void main(String[] args) {
		//프로모션의 예
		byte ibyte = 10;
		int iInt = ibyte;	// 자동으로 형변환이 된다.
		
		float ifloat = 10.1f;
		double idouble = ifloat;	//자동으로 형변환이 된다.
		
		//디모션의 예
		float ifloat2 = (float)idouble;
		System.out.println("iInt : "+iInt);
		
		int iInt2 = (int)idouble;
		
		System.out.println("iInt2 = "+iInt2);
		
		
		
	}

}
