package day02;

public class TypeDifferenceExample {
	public static void main(String[] args) {
		
		//정수와 실수간 연산은 언뜻 보기에는 당연히 진행이 될 것 같지만
		//실제로는 저장받는 자료형에 따라 다른 결과가 나옵니다.
		
		//정수+ 실수를 정수에 저장하는 경우 연산 불가
		//1 = 00000000 000000000 00000000000 00000000001
		//2.5 = 0aaaaaaaa bbbbbbbbbb bbbbbbbbb bbbbbbbbbbb
		//int result = 1 + 2.5;X
		
		// 정수 + 실수를 실수에 저장하는 경우 가능
		double result2 = 1 + 2.5;
		
		
	}

}