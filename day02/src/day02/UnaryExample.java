package day02;

public class UnaryExample {
public static void main(String[] args) {
	//증강연산자 ++, --
	int i = 1;
	int j = i++; //후위 연산자는 먼저 해당코드를 수행하고, 뒤늦게 연산자 로직을 수행 합니다
	// int j = 1를 먼저 수행하고 (i는 1)
	// i++를 수행해 1을 더합니다. (i는 2)
	// 최종적으로 j는 1, i는 2를 저장 받습니다.
	
	System.out.println(i);
	System.out.println(j);
	System.out.println("--------------------------");
	
	int x = 1;
	int y = ++x;
	//아래쪽에 주석으로 23, 24번 라인에 출력될 값과 그 이유를 9,10번 라인처럼 서술해 주세요.
	// ++x이므로, x에 저장된 값을 먼저 1 증가 시킵니다. (x 는2)
	// x는 2이므로, y에 2를 대입합니다.
	
	System.out.println(x);
	System.out.println(y);
}
}
