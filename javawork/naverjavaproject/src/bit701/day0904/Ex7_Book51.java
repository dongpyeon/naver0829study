package bit701.day0904;

public class Ex7_Book51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// json 데이타 {"키":"값"}
		String jdata="{\"name\":\"이진\"}";
		System.out.println(jdata);
		
		//jdk13 에서 추가된 텍스트 블록 문법 """
		String jdata2 = """
				{"name" : "캔디","address","역삼동"}
				""";
		System.out.println(jdata2);
		
		String name = "마이클잭슨";
		int age = 32;

				

		String jdata4="""
				{"name":"%s","age":%d}
				""".formatted(name,age);
		System.out.println(jdata4);
		
		// """ """ 는 이 안에 어떤것이든 보이는 그대로 입력되는 것이다.
		String str2="""
				red
				blue
				pink
				""";
		System.out.println(str2);
	}

}
