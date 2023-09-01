package bit701.day0831;
import java.util.Scanner;

/*
 * 원래 스위치는 정수,문자만 가능했으나
 * jdk8이후 문자열도 가능
 */

public class Ex8_Switch {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		//숫자를 입력받는데 1 : one 2 : two 3: three 이외 :other number
		System.out.println("숫자를 입력하시오");
		int num = sc.nextInt();
		//switch는 num 값에 따라서 해당 case 실행
		//단 break가 없을 경우 끝까지 실행됨!
		switch (num) {
		case 1:
			System.out.println("one!");
			break;
		case 2:
			System.out.println("two!");
			break;
		case 3:
			System.out.println("three!");
			break;
		default:
			System.out.println("other number!");
		
		
		*/
		
		
		
		System.out.println("영문 색상명을 입력하세요");
		String color=sc.nextLine();
		
		switch(color) {
		case "red": //break가 없으므로 다음 case(대문자)문이 실행된다.
		case "RED":
			System.out.println(color+" : 빨간색");
			break;
		case "green":
		case "Green":
			System.out.println(color+" : 초록색");
			break;
		case "pink":
		case "PINK":
			System.out.println(color+" : 분홍색");
			break;
		default:
			System.out.println(color+" : 그 이외의 색");
		
			
			
			
			
			
		}

	}

}
