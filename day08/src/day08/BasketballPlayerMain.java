package day08;

public class BasketballPlayerMain {

	
	public static void main(String[] args) {
		//농구선수를 둘 만들어주세요.
		//하나는 덩크슛에 성공하게
		//하나는 실패하게 만들어주세요.
	BasketballPlayer b1 = new BasketballPlayer();
	BasketballPlayer b2 = new BasketballPlayer();
	
	b1.name = "코비";
	b1.height = 190;
	b1.age = 32;
	b1.salary = 1000;
	
	b2.name = "킹제임스";
	b2.height = 195;
	b2.age = 33;
	b2.salary = 2000;
	
	b1.showBasketballPlayerInfo();
	dunkShoot();
	
	b2.showBasketballPlayerInfo();
	b2.dunkShoot();
	
		
		
	}
}
