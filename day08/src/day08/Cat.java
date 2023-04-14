package day08;

public class Cat {

	public String name;
	public int age;
	public String type;
	public String color;
	
	//설계 클래스 내부에 선언하는 메서드는 static을 쓰지 않습니다.
	public void showCatInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(type);
		System.out.println(color);
	}
}
