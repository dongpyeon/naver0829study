package bit701.day0904;

public class Ex9_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 ="apple";
		String str2 ="AppLe";
		String str3 ="Have a Good Day";
		String str4 = "		Happy		";
		
		System.out.println(str3.length()); // 길이
		System.out.println(str2.toLowerCase()); //소문자로
		System.out.println(str2.toUpperCase()); //대문자로
		System.out.println(str3.substring(5)); // str3의 인덱스 5번쨰 이후를 출력
		System.out.println(str3.substring(7, 11));
		System.out.println(str3.charAt(0)); //str3 에서 0번째 인덱스 문자 출력
		System.out.println(str3.charAt(7));
		System.out.println(str1.indexOf('a')); //str1 에서 첫번쨰로 a가 있는 인덱스 번호를 출력
		System.out.println(str3.lastIndexOf('a')); //str1에서 마지막에 a가 있는 인덱스 번호 출력
		System.out.println(str4.length()); //길이
		System.out.println(str4.trim().length()); //공백 제거, 후 길이
		System.out.println(str3.startsWith("Have")); //Have로 시작하면 트
		System.out.println(str3.endsWith("day")); //day로 끝나면 트루
		System.out.println(str1.equals(str2)); //일치하면 트ㅜㄹ
		System.out.println(str1.equalsIgnoreCase(str2)); //대소문자 무시하고 맞으면 트루
		System.out.println(str1.compareTo(str2)); // 두값을 비교해서 str1이 크면 양수 작으면 음수 일치하
		System.out.println(str1.compareTo("apple"));
		
		
		

	}

}
