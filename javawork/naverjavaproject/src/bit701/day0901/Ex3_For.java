package bit701.day0901;

public class Ex3_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a =1; a<0; a++) { //초기값은 1, a가0보다 작을떄, a가올라가라는 뜻
			System.out.println("a="+a);
		}
		
		System.out.println("=".repeat(30)); // "="을 30번 반복
		
		for(int a=1; a<=10; a++)
			System.out.printf("%3d",a);
		System.out.println("\n"+"=".repeat(30)); // "="을 30번 반복
		
		
		for(int a=1; a<=20; a+=3)
			System.out.printf("%3d",a);
		System.out.println("\n"+"=".repeat(30)); //
		
		for(int a=10; a>=1; a--)
			System.out.printf("%3d",a);
		System.out.println("\n"+"=".repeat(30)); //
		
		
		
		//다중 for문
		for(int i=1; i<=3; i++) {
			System.out.println("i=" +i);
			
			for(int j=1; j<=5; j++) {
				System.out.printf("%3d",j);
			}
			System.out.println(); //줄넘김

		}
		System.out.println("\n"+"=".repeat(30)); //
		
	}

}
