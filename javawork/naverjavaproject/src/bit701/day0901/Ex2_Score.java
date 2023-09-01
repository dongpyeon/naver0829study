package bit701.day0901;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Ex2_Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  이름,3과목의 점수(kor,eng,mat)를 입력받은 후 총점과 평균
		 *  (소숫점 1자리 까지만 출력-NumberForamt)
		 *  그리고 등급을 출력(grade : 평균이 90 이상이면 "Excellent!",
		 *  80이상이면 "Good" 나머지는 "Try" 라고 출력
		 *  if-else 사용하시오
		 *  
		 */
		
		//선언
		Scanner sc = new Scanner(System.in);
		NumberFormat numberFormat = NumberFormat.getInstance();
		NumberFormat formatter = new DecimalFormat("0.#");


		
		int kor, eng, mat,total;
		double average;
		String grade;
		
		//입력
		System.out.println("kor 점수를 입력하시오");
		kor = sc.nextInt();
		
		System.out.println("eng 점수를 입력하시오");
		eng = sc.nextInt();
		
		System.out.println("mat 점수를 입력하시오");
		mat = sc.nextInt();
		
		total=kor+eng+mat;
		average=total/3.0;

		//계산
		if(average>=90) 
			grade="Excellent";
		else if(average>=80)
			grade="Good";
		else
			grade="Try";
		//출력
		System.out.println("총점 : "+total+
				   "\n평균 : "+formatter.format(average)+
				   "\n"+grade);

	}

}
