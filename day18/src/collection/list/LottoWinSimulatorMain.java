package collection.list;

public class LottoWinSimulatorMain {

	public static void main(String[] args) {
		// 로또 시뮬레이터 클래스의 기능을 실행만 합니다.
		LottoWinSimulatorGoodCase ls = new LottoWinSimulatorGoodCase();
		
		List<Integer> lottoWinNumbers = ls.getLottoNumbers();
		List<Integer> lottoWinNumbers = ls.getLottoNumbers();
		
		ls.tryWinLoop(lottoWinNUmbers, lottoGetNumbers);
		System.out.println("반복 횟수 : " + ls.getCount());
	}

}
