package bit701.day0904;

import java.util.Scanner;

public class Ex6_RandomWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rnd,count,num;
		
		Exit:
		while(true) {
			rnd=(int)(Math.random()*100)+1;
			count=0;
			
			while(true)
			{
				System.out.println(++count+":");
				//num=sc.nextInt();
				num=Integer.parseInt(sc.nextLine());
				if(num>rnd)
					System.out.println("\t"+num+"보다 작습니다");
				else if(num<rnd)
					System.out.println("\t"+num+"보다 큽니다");
				else {
					System.out.println("\t정답입니다("+rnd+")" );
					//계속할지 묻는다
					System.out.println("계속 하려면 y를 입력해주세요, y가 아닐 경우 종료");
					String ans=sc.nextLine();
					if(ans.equalsIgnoreCase("y")) // 대소문자 상관없이 철자 맞으면ture
					{
						System.out.println("새로운 난수를 발생하겠습니다");
						continue Exit; // 바깥쪽 와일문 조건식으로 이동
					}
					else {
						break Exit; //두개의 와일문 빠져나감
					}
				}
			}
		}
				

	}

}
