package day06;

public class Practice {
public static void main(String[] args) {
	int score = (int)(Math.random() * 101);
	
	if(score >= 60) {
		System.out.println(score);
		System.out.println("합격하셨습니다.");
	} else {
		System.out.println(score);
		System.out.println("불합격하셨습니다. 재시도");
	}
}
}
