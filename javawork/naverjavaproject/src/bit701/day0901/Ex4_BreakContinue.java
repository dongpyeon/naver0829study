package bit701.day0901;

public class Ex4_BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1; a<=10; a++) {
			
			System.out.printf("%4d",a);
			if(a==5)
				break; // 5까지 출력후 반복문을 빠져나간다
		}
		System.out.println();
		System.out.println("=".repeat(30));
		
		
		for(int a=1; a<=10; a++) {
			if(a%2==0)
				continue; // 짝수일때 프린트로 쓰지 않고 바로 증감식으로 컨티뉴
			System.out.printf("%3d",a);
		}
		System.out.println();
		System.out.println("=".repeat(30));
		
		//다중 for문인 경우 한꺼번에 2개의 반복문을 빠져나가고자 할 경우
		Exit:
		for(int i=1; i<=3; i++) {
			System.out.println("i="+i);
			
			for(int j=1; j<=5; j++) {
				System.out.printf("%3d",j);
				if(j==3)
					break Exit;
				
			}
			System.out.println();
		}
		System.out.println("=".repeat(30));
		
		
	}

}
