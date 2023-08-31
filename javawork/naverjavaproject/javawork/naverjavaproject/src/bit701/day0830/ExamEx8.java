package bit701.day0830;

public class ExamEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String money = args[0];
		int payment = Integer.parseInt(money); //참조형을 기본형으로변환
		System.out.println("money : "+payment+"원");
		System.out.println("만원짜리"+payment/10000+"장");
		System.out.println("천원짜리"+payment%10000/1000+"장");
		System.out.println("백원짜리"+payment%10000%1000/100+"개");
		System.out.println("십원짜리"+payment%10000%1000%100/10+"개");
		System.out.println("일원짜리"+payment%10000%1000%100%10/1+"개");
		/*출력
		 * money : 5674321원
		 * 만원짜리 567장
		 * 천원자리 4장
		 * 백원짜리 3개
		 * 십원짜리 2개
		 * 일원짜리 1개
		 * 
		 * 산술연산자를 사용해서 출력해보세용
		 * 
		 */
		
		System.out.println("*****************************");

		// 만원으로나눴는데 나머지가 있어 그러면 그 나머지가 머니
		int payment10000 = payment/10000;
		int exchange10000 = payment%10000;
		int exchange1000 = exchange10000%10000;
		int exchange100 = exchange1000%1000;
		int exchange10 = exchange100%100;
		int exchange1 = exchange10%10;
		
		System.out.printf("money : %d원 \n만원짜리%d장 \n천원짜리%d장 \n백원짜리%d개 \n십원짜리%d장 \n일원짜리%d개 \n",payment,payment10000,exchange1000/1000,exchange100/100,exchange10/10,exchange1/1);

		
		
		
		
		System.out.println("*****************************");
		//정답
		//파라미터에서 월급여를 읽어서(문자열) 정수타입으로 변환한다
		
		int realmoney = Integer.parseInt(args[0]);
		System.out.println("월 급여:"+realmoney);
		System.out.println("만원짜리 "+realmoney/10000+"장");
		System.out.println("천원짜리 "+realmoney%10000/1000+"장");
		System.out.println("백원짜리 "+realmoney%1000/100+"개");
		System.out.println("십원짜리 "+realmoney%100/10+"개");
		System.out.println("일원짜리 "+realmoney%10/1+"개");
		
		
		
		
		
		
		
		
		
	}

}




