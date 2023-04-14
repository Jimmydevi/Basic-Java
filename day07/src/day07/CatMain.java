package day07;

public class CatMain {
	
	
	//고양이를 조회하는 용도로 사용할 전용 메서드를 작성해보겠습니다.
	public static void showCatInfo(Cat cat) {
		System.out.println("반려묘 이름 :"+ cat.name);
		System.out.println("반려묘 이름 :"+ cat.age);
		System.out.println("반려묘 이름 :"+ cat.height);
		System.out.println("반려묘 이름 :"+ cat.kind);
		
	}
public static void main(String[] args) {
	
	Cat c1 = new Cat();
	c1.name ="아치";
	c1.age =10;
	c1.height =50;
	c1.kind ="페르시안";
	showCatInfo(c1);
	
	// c2, c3를 새롭게 생성해주시고
	// 이 고양이들도 showCatInfo로 조회할때
	// 메모리 구조가 어떻게 전개될지 직접
	
	
	Cat c2 = new Cat();
	c2.name = "를루";
	c2.age = 4;
	c2.kind = "스코티시폴드";
	c2.height = 40;
    showCatInfo(c2);
    
    Cat c3 = new Cat();
    c3.name = "미미";
    c3.age = 8;
    c3.kind = "일반";
    c3.height = 40;
    showCatInfo(c3);
    
}
}
