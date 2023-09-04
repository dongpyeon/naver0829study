package bit701.day0904;

public class Ex1_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 반복문에는 for,while,do-while 3가지가 있다
		 * for문은 주로 반복 횟수가 정해져 있을때
		 * while 이나 do-while 은 반복 횟수가 미정일 때.
		 * while과 do-while 차이는 조건을 먼저 주느냐 나중에 주느냐(선조건,후조건)
		 */
		int a=65; //대문자 A의 아스키코드값
		while(a<=90)//91이 되면 빠져나간다.
		{
			//System.out.println((char)a);
			//a++;
			
			//위의 코드를 한줄로 줄여보세요
			System.out.print((char)a++);
			
		}
		System.out.println();
		System.out.println("빠져나온후 a값"+a);
		
		a=65;
		while(true) {
			System.out.print((char)a++);
			if(a>90) {
				break;
			}
			
		}
		
		System.out.println();
		a=65;
		do {
			System.out.print((char)a++);
		}while(a<=90);//조건 뒤에 반드시 ; 추가
		
		int n=10;
//		while(n<10) {
//			System.out.print(n--);
//		}
//		
		do {
			System.out.print(n--);
		}while(n<10);
	}

}
