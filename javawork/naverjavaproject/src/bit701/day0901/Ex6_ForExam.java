package bit701.day0901;

import java.util.Scanner;

public class Ex6_ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선언
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 구구단을 출력할 시작단 입력
		 * 3
		 * 구구단을 출력할 끝단 입력
		 * 6
		 * 
		 * 
		 *   4단  5단  6단

		 * 4x1=4  5x1=5 6x1= 6 - 단일 for 문
		 * 
		 * . 
		 * .
		 * .
		 * .
		 * 4x9=36 5x9=45 6x9 =54 -다중 for문
		 */
		
		int si =0;
		int kket=0;
		System.out.println("시작 단 입력");
		si = sc.nextInt();
		System.out.println("끝날 단 입력");
		kket = sc.nextInt();
		
		//시작값이 끝값보다클 경우 두 변수를 바꿔보자
		if(si>kket) {
			int temp = si;
			si = kket;
			kket = temp;
		}
		
		
		
		//제목 출력
		for(int a=si; a<=kket; a++) {
			System.out.printf("%7d단 ",a);
		}
		
		//계산
		for(int i=1; i<=9; i++) {
			System.out.println();
			for(int j=si; j<=kket; j++) {
				System.out.printf("%5dx%d=%2d",j,i,j*i);
				
			}
		}
			
			
	}

}
