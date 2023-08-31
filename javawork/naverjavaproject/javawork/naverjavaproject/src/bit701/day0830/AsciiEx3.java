package bit701.day0830;

public class AsciiEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char, int는 같은 타입이라고 봐도 된다네?
		char a1 = 65; // 숫자를 문자로 인식해서 가능
		int a2 = 'B'; // 문자를 아스키코드로 인식해서 문자도 ㄱㅊ
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println();
		
		System.out.println((int)a1);
		System.out.println((char)a2);
		
		System.out.printf("%d 의 아스키 문자는 %c이다",(int)a1,a2);

		char b1='C';
		int b2=68;
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1+1); //묵시적 형변환에 의해서 char 에 int를 더하면 int가 나옴

		/*
		 * char + int = int
		 * double + int = double
		 * String + int = String
		 * String + double = String
		 * 
		 * 큰 순서대로 이김
		 * String > long > double > int, ,, ,,, 
		 */
		
		System.out.println((char)(b1+1));
		System.out.println(5/2); // int 랑 int 연산이라 int 됨
		System.out.println(5.0/2); // double 과 int 연산이라 double이 나옴 (2.5)
		
		
		System.out.println();
		
		System.out.println((double)5/2);
		System.out.println((double)(5/2));
		
		/*print나 println 은 모든타입 출렵이 가능하다
		 * 이유는 타입별로 여러개를 같은 이름으로 만들어놨기 떄문
		 * print 라이브러리 까보면 엄청 많다 
		 * 이런 메서드를 중복함수 (overloading method) 라고 한다네요~ 
		 */
		
	}

}
