package bit701.day0831;

import java.util.Date;
import java.util.Scanner;

public class Ex2_KeyInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		
		int curYear=date.getYear()+1900; //나이 구하기
		
		System.out.println("현재 연도:"+curYear);
		System.out.println("얌마 너 몇년생이야?");
		int birthYear = Integer.parseInt(sc.nextLine());
		int age = curYear-birthYear;
		System.out.println(birthYear+"년생 이라고? "+age+"살이네?");
	
		//20세 이상이면 "성인", 아니면 "미성년자"
		//조건(삼항) 연산자로
		//String msg= age>=20? "성인" : "미성년자";
		
		String msg = ""; // 지역변수는 초기값을 지정하는것이 좋다.
		//지역변수를 구역(if)안에 넣을 경우 구역을 나오게되면 자동소멸되므로 미리 넣는다
		
		
		if(age>=20) {
			msg="성인";
		}
		else {
			msg="미성년자";
		}
		
		System.out.println("당신은 "+msg+"\n");
		
		
		System.out.println("사는 곳은 어데노");
		String address = sc.nextLine();
		System.out.println(address+"에 산다고? 덜덜\n");
        
		System.out.printf("그니까 너가 %d 년생(%d세)이고 %s에 산다는거지?",birthYear,age,address);
	}

}
