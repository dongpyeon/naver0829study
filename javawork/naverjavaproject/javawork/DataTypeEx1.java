public class DataTypeEx1{
	public static void main(String []args)
	{
	//이 라인은 주석임니다 ㅋㅋ
	/* 
		2023.08.30 
		데이타 타입 예제
	*/
	//byte 는 1byte 크기의 정수형 타입입니다 ㅋㅋ
	// 크기는 -128~ 127 숫자만 저장 가능
	byte a=127;
	System.out.println("a="+a);

	byte b=(byte)200; // 200을 바이트에 넣는 강제형변환
	System.out.println("b="+b); //값손실 나온다잉
	
	//실행시 인자로 넘어오는 문자열을 확인해보자
	System.out.println(args[0]); //배열의 첫문자열 출력





	}
}