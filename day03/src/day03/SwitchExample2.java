package day03;

import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		// 앞서 배운 배열과 연동해서 코드를 작성해보겠습니다.
	
		String[] foods = {"삼겹살", "돈카츠", "베이징덕", "팟씨유", "커리"};
		
		// 0 ~4 범위 정수 난수를 얻도록 해주세요.
		int idx = (int)(Math.random() * 5);
		System.out.println(foods[idx]);
		switch(foods[idx]) {
		//여러분들이 최애 3개 요리는 case에서 체크해서
		//"xx식입니다" 라고 출력하게 해주시고
		// 나저미 2개가 걸린 경우는 default문을 이용해 "기타요리입니다" 라고 출력해주세요.
		case "삼겹살":
			System.out.println("한식입니다");
			break;
		case "베이징덕":
			System.out.println("중식입니다");
			break;
		case "팟씨유":
			System.out.println("오리엔탈입니다");
			break;
		default:
			System.out.println("기타요리입니다");
			
		}

	}

}
