package bit701.day0830;

public class OperEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*비교연산자와 논리 연산자, 결과값은 무조건 참(True),거짓(false) 		 */
		int kor =100, eng =90, mat=100;
		System.out.println(kor>=80);
		System.out.println(kor>=80 || kor!=mat); //or 인 경우 앞이 참이면 뒤 조건을 보지도 않음
		System.out.println(kor<80 || kor!=mat);
		System.out.println(kor>=80 && kor!=mat);
		System.out.println(kor>=80 && kor!=mat);
		System.out.println(!(kor>=80));
		System.out.println(kor>=95 && eng>=95 && mat>=95);
		System.out.println(kor>=95 && eng>=95 || mat>=95);
		System.out.println(kor>=95 || eng>=95 && mat>=95);

		int year = 2023;
		// 올해가 윤년인지 확인해보자
		//4년마다 돌아오므로 4로 나눠서 나머지가 0
		//
		System.out.println("===========================");
		System.out.println(year%4==0 && year%100!=0 || year%400==0);
		
		
		
		
		
		
	}

}
