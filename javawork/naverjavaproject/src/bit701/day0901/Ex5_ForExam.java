package bit701.day0901;

import java.util.Scanner;

public class Ex5_ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선언
		Scanner sc = new Scanner(System.in);
		
		
		// 1. 숫자 n을 입력받은 후 1부터 n까지의 총 합계를 출력하시오
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int total =0;
		
		for(int a=1; a<=num; a++) {
		total+=a;	
		}
		System.out.println("1부터 "+num+ "까지의 합은 " +total+ "입니다");
		
		
		/* 2. 구구단 숫자 2~9 사이의 숫자를 입력받은 후 범위를 벗어날 경우
		// "잘못 입력하여 종료합니다" 라며 종료 (return)
		// 제대로 입력시 해당 숫자 구구단 출력
		
		
		5입력 시
		**5단**
		5 x 1 = 5
		5 x 2 = 10
		.
		.
		5 x 9 = 45
		
		
		*/
		
		
		System.out.println("숫자를 입력하세요");
		int dan = sc.nextInt();
		if(dan>9 || dan<2) {
			System.out.println("잘못입력해서 종료");
			return;
		}
		
		System.out.println("\t**"+dan+"단 ** \n");
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%6d X %d = %2d\n",dan,i,dan*1);
			
		}
		}

	}


