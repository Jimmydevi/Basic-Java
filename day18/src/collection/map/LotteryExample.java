package collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LotteryExample {

	public static void main(String[] args) {
		//로또복권 번호를 적재할 컬렉션 생성
		//제네릭에는 int대신 Integer로 넣어야함
		List<Integer> lottoWinNumbers = new ArrayList<>();
		
		//Random 클래스를 생성해서 난수발생
		Random rn = new Random();
		
		//번호 6개가 중복없이 당첨되려면 몇 바퀴를 돌아야 하는지 모르므로 while 문
		while(lottoWinNumbers.size() < 6) {
			//1~45 범위로 난수 발생해 변수에 저장
			Integer thisTimeGetNumber = rn.nextInt(1,46);
			// 기존에 이미 뽑았던 숫자인지 확인한 후
			if(!lottoWinNumbers.contains(thisTimeGetNumber)) {
				lottoWinNumbers.add(thisTimeGetNumber);
			}
			//번호 정렬
			Collections.sort(lottoWinNumbers);
		}
		//당첨번호 체크
		System.out.println(lottoWinNumbers);
	}
}
