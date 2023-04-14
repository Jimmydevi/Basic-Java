package day08;

public class Car {
	// 차종, 최대승객, 속도, 주인, 연료
	
	public String modelName;//차종
	public int maxPassengers;//최대승객
	public int speed;//속도
	public String owner;//주인
	public int gas;//연료
	
	//상수 선언은 final static으로 선언하면 됩니다.
	public final static int BOOST_SPEED = 10;
	public final static int BREAK_SPEED = 10;
	
	//생성자 들어갈 자리
	public Car(String modelName, int mP, String own); {
	modelName = modelName;
	maxPassengers = mp;
	currentSpeed = 0;
	owner = own;
	gas 100;
	}
	// accelerate
	public void accelerate() ;
	
	speed += 10;
}
