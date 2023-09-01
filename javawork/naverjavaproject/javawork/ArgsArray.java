public class ArgsArray{
	public static void main(String []args){
	
	//args 로 두개의 숫자를 읽어서 출력해보자
	String str1 = args[0];
	String str2 = args[1];
	System.out.println("str1="+str1);
	System.out.println("str2="+str2);
	System.out.println("두수의합="+(str1+str2));
	
	//참조형인 String 을 기본형인 int로 변환하는 방법이 있따!?
	//integer 라는 Wrapper class를 이용해야 한다
	
	su1 = Integer.parseInt(str1);
	su2 = Integer.parseInt(str2);
	System.out.println("두수의합="+(su1+su2));
	}




}