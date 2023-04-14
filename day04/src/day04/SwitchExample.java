package day04;

import java.util.Scanner;

public class SwitchExample {
public static void main(String[] args) {
	
	/*
	 * 직급 입력하세요
	 * [사원, 대리, 과장, 차장, 부장] -> 200만원, 300만원, 400만원, 500만원, 600만원
	 * >
	 * 대리급여는 300만원 입니다./
	 * or
	 * 사원은 없는 직급입니다.
	 * 직급을 다시 입력해주세요.
	 */
	// 스캐너를 생성해서 직급을 입력 받을수 있게 해주세요.
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("직급을 입력하세요.");
	System.out.println("[사원, 대리, 과장, 차장, 부장]");
	String position = scan.next();
	
	switch(position) {
case "사원":
	System.out.println("200만원");
	break;
case "대리":
	System.out.println("300만원");
	break;
case "과장":
	System.out.println("400만원");
	break;
case "차장":
	System.out.println("500만원");
	break;
case "부장":
	System.out.println("600만원");
default:
	System.out.println(position + "은(는) 없는 직급입니다.");
	System.out.println("직급을 다시 입력해주세요");
	break;
	}
}
}
