package bit701.day0830;

public class OperEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//증감 연산자 : ++ (1씩증가) --(1씩 감소)
		// 변수 앞에 붙이면 (전치) 1순위
		// 변수 뒤에 붙이면 (후치) 끝순위
		// 단, 단하응로 사용할 경우 당연히 노상관
		
		int a=5;
		int b=5;
		//단항일 경우
		++a; //1증가
		System.out.println(a);
		
		++b; //1증가
		System.out.println(b);
		
		System.out.println(++a);
		System.out.println(b++);
		System.out.println("a="+a+"b="+b);
		
		a=b=5;
		int m=++a;
		int n=b++; //b는 n으로 들어가고 b가 1증가 하는것.
		System.out.printf("a=%d,b=%d, m=%d, n=%d",a,b,m,n);
		
		
	}

}
