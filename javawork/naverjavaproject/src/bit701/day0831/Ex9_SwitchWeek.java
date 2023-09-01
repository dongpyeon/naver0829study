package bit701.day0831;

import java.util.Scanner;

public class Ex9_SwitchWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//연도와 월을 입력하면 몇일까지 있는지 출력해보자
		//일단 해당 년도가 윤년인지 아닌지 부터 판단해보자
		System.out.println("년도 4자리 숫자를 입력하세요");
		int year = sc.nextInt();
		System.out.println("월 (1-12)을 입력하세요");
		int month = sc.nextInt();
		//잘못 월을 입력하였을 경우 종료한다
		if(month<1 || month>12) {
			System.out.println("잘못입력하셨어요 ㅋㅋ");
			return;
		}
		
		System.out.printf("입력한 년도와 월 : %d년 %d월 \n\n",year,month);
		int days=0;
		boolean b=year%4==0 && year%100!=0 || year%400==0;
		if (b) System.out.println("윤년");
		else System.out.println("평년");
		System.out.println();
		
		switch(month)
		{
		case 2:
			days=b?29:28; //b가 true면 29일 아니면 28일을 days에 저장
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		default:
			days=31;
		}
		
		System.out.printf("%d년 %d월은 %d일 까지 있어요!! \n",year,month,days);
		
		
		
		
	}

}
