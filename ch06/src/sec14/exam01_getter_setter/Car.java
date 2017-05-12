package sec14.exam01_getter_setter;

public class Car {
	private int speed;
	private boolean stop;
	
	private int auto1;
	public int getAuto2() {
		return auto2;
	}

	public void setAuto1(int auto1) {
		this.auto1 = auto1;
	}

	private int auto2;
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) {
			speed = 0;
		}
	}
}
