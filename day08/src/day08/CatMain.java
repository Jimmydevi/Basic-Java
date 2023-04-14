package day08;

public class CatMain {

	public static void main(String[] args) {
		
		Cat c1 = new Cat();
		c1.name = "도도";
		c1.age = 4;
		c1.type = "미상";
		c1.color = "갈색줄무늬";

		
		Cat c2 = new Cat();
		c2.name = "이이";
		c2.age = 5;
		c2.type = "페르시안";
		c2.color = "회색";

		c1.showCatInfo();
		c2.showCatInfo();
	}
	
}
