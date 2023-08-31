package bit701.day0831;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class EX7_Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//패턴을 이용해서 다양하게 날짜,시간을 출력해보자
		Date date=new Date();

		//패턴1
		SimpleDateFormat dateFormat1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
		System.out.println(dateFormat1.format(date));


		//패턴1
		SimpleDateFormat dateFormat2=new SimpleDateFormat("yyyy년MM월dd일 a hh:mm:ss EEEE");
		System.out.println(dateFormat2.format(date));

		//숫자를 포멧 양식에 맞게 출력하기
		int money=4567890;
		
		NumberFormat numberFormat1=NumberFormat.getInstance();
		System.out.println(numberFormat1.format(money));//4,567,890
		
		NumberFormat numberFormat2=NumberFormat.getCurrencyInstance(); //지역설정된 화폐단위 붙여서 출력
		System.out.println(numberFormat2.format(money));
		
		double num = 456.12345;
		System.out.println(numberFormat1.format(num));
		
		numberFormat1.setMaximumFractionDigits(1); //소숫점 한자리로 출력하고 싶을 때
		System.out.println(numberFormat1.format(num)); //
		
		
	}

}
