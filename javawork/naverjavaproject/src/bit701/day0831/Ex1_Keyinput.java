package bit701.day0831;

import java.util.Scanner;

public class Ex1_Keyinput {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("문자열 입력"); // "가" 입력
		String text1 = sc.nextLine();
		System.out.println("잘했어요");
		

		System.out.println("정수 입력"); // "100" 입력
		int number1=sc.nextInt();
		System.out.println("잘했어요");
		//엔터가 버퍼로 들어감
		
		//숫자 입력후 문자열은 입력이 안됨 왜?
		//숫자 입력후 발생하는 엔터값이 버퍼에 저장되는데 문자열 입력시
		//이 버퍼를 먼저 읽고 없을 경우 키보드로 읽는다
		
		
		//방법1 : 버퍼의 엔터문자를 먼저 읽어서 없앤다
		sc.nextLine(); //엔터 버퍼를 여기 넣은 후 진행
		//방법2는 숫자를 읽을경우도 무조건 nextLine 으로 문자열로 입력후 변환해서 사용한다.
		//String age=sc.nextLine();
		//Integer.parseInt(age)

		System.out.println("다시 문자열 입력"); //"나" 입력
		String text2 = sc.nextLine();
		System.out.println("잘했어요");
	}
}