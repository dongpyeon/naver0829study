package bit701.day0831;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex10_Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 상품명과 수량, 단가를 각각 입력받은 후 총 금액을 출력하시오
		 * 그리고 수량이 5개 이상일 경우 10프로 할인된 최종 금액도 출력해주세요
		 * 
		 * (예)
		 * 상품명 : 딸기
		 * 수량 : 6
		 * 단가 : 1000
		 * 
		 * 총금액 : 6000 원
		 * 5개 이상 10프로 할인된 금액 : 5400원
		 */
		NumberFormat numberFormat = NumberFormat.getInstance();
		Scanner sc=new Scanner(System.in);
		System.out.println("상품명을 입력하시오");
		String product = sc.nextLine();
		System.out.println("수량을 입력하시오");
		//String amount = sc.nextLine();
		//Integer.parseInt(amount);
		int amount = sc.nextInt();
		System.out.println("단가를 입력하시오");
		//String cost = sc.nextLine();
		//Integer.parseInt(cost);
		int cost = sc.nextInt();
		int total = amount*cost;
		int discount =0;
		
		
		String newamount = numberFormat.format(amount);
		String newcost = numberFormat.format(cost);
		String newtotal = numberFormat.format(total);
		//System.out.printf("상품명 : %s \n수량 : %d\n단가 : %d\n총금액 :%d 원\n",product,amount,cost,total);
		System.out.println("상품명 :"+product);
		System.out.println("수량 :"+newamount);
		System.out.println("단가 :"+newcost);
		System.out.println("총금액 :"+newtotal);
		
		if(amount>=5) {
			discount = total-(total/10);
			
			
		}
		String newdiscount = numberFormat.format(discount);
		System.out.printf("5개 이상 10프로 할인된 금액 : %s원\"",newdiscount);
				
		
		
		
		
	}

}
