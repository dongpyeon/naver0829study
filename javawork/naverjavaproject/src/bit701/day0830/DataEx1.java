package bit701.day0830;

public class DataEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//printf: %d f %c %s
		//\n 줄넘김  \t 다음탭
		int age =23;
		double weight = 56.7;
		char blood = 'A';
		String name="캐서린";
		System.out.printf("이름:%s\n",name);
		System.out.printf("나이: %d세",age);
		System.out.printf("몸무게: %fKg",weight);
		System.out.printf("몸무게: %1.2fKg",weight);
		System.out.printf("혈액형: %c\n",blood);
		System.out.println("=======================");
		System.out.printf("이름 :%s\n나이 :%d\n몸무게 :%1.1fKg\n혈액형 :%c",name,age,weight,blood);

	}

}
