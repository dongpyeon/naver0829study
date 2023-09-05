package bit701.day0905;

import java.util.Scanner;

public class Ex1_JuminNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String year,month,day,num,sex;
		
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			System.out.println("주민번호를 입력하세요");
			System.out.println("xxxxxx-xxxxxxx");
			num = sc.nextLine();
			//q or Q 입력시 종료
			if(num.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			year=num.substring(0,2);
			month=num.substring(2,4);
			day=num.substring(4,6);
			char gender=num.charAt(7);
			System.out.printf("%s년 %s월 %s일생 \n",year,month,day);
			
			if(gender=='1' ||gender=='2' ||gender=='3' ||gender=='4')
				System.out.println("내국인");
			else if(gender=='5' ||gender=='6')
				System.out.println("외국인");
			else
				System.out.println("제대로좀 입력하세염");
			
			switch(gender) {
			case '1': case '3': case '5':
				System.out.println("남자!");
				break;
			case '2': case '4': case '6':
				System.out.println("여자");
				break;
			
			}

		
		}
		
	}

}
