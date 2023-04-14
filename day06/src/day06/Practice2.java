package day06;
import java.util.Scanner;

public class Practice2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("메뉴의 번호를 입력해주세요.");
	System.out.println("1. 카페라떼, 2. 콜라, 3.에스프레소");
	int order = scan.nextInt();
	switch(order) {
		case 1: System.out.println("주문하신 카페라뗴 나왔습니다.");
			break;
		case 2: System.out.println("주문하신 콜라 나왔습니다.");
			break;
		case 3: System.out.println("주문하신 에스프레소 나왔습니다.");
			break;
		default:
			System.out.println("잘못된 주문입니다.");
	}
}
}
