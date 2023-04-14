package day08;

public class Yourclassname{
	public static class BasketballPlayer {
	public String name;
	public int height;
	public int age;
	public int salary;
	
	//showInfo를 만들어주세요.
	// 호출시 위 4가지 요소를 콘솔에 찍어줍니다.
	
	public void showBasketballPlayerInfo() {
	System.out.println(name);
	System.out.println(height);
	System.out.println(age);
	System.out.println(salary);
}

	public void dunkshoot() {
		if(height > 190) {
			System.out.println("덩크슛 성공!");
		} else {
			System.out.println("골대에 안닿음");
		}
	}
}
}