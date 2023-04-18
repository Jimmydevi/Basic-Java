package exception.nothrows;

public class NoThrowsExample {

	public static void showItem(int[] arrays) {
		try {
			for(int i = 0; i < 5; i++) {
				System.out.println(arrays[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
	System.err.println("없는 인덱스로 조회를 하면 안됩니다.");
}
}
	
	public static void main(String[] args) {
		int[] arrays = {1, 2, 3, 4};
		showItem(arrays);
	}
}