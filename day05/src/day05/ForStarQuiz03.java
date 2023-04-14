package day05;

import java.util.Scanner;

public class ForStarQuiz03 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	int starTowerFloor = scan.nextInt();
	scan.close();
	
	for(int i = 1; i <= starTowerFloor; i++) {
		for(int j = starTowerFloor-i; j >= 1; j--) {
System.out.print(" ");
	
}//j for문 닫는부분
for(int k = 1; k <= i; k++) {
System.out.print("*");

}// k for 문 닫는ㄴ붑분
System.out.println();

//i for문 닫는부분
	}
}
}
