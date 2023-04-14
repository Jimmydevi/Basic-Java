package day06;

public class ForStarQuiz3_2 {
public static void main(String[] args) {
	
//중첩 반복문을 쓰되, if 문으로 " "와 "*"을 통제
	for(int i = 1; i <= 5; i++) {
		for (int k = 1; k <= 5; k++) {
			if(i < 5-k) {
				System.out.print(" ");
			}else {
				System.out.print("*");
				
			}
		}
	}
	
}
}
