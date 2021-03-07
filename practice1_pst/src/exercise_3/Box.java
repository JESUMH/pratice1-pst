package exercise_3;

public class Box {
	
	private double high;
	private double width;
	private double profundity;
	private boolean full;
	
	/**
	* Another constructor for class Box
	* @param high  <High box in centimeters>
	* @param width <Width box in centimeters>
	* @param profundity <Profundity box in centimeters>
	*/
	public Box(double high, double width, double profundity) {
		this.high = high;
		this.width = width;
		this.profundity = profundity;
		//Box is empty by default
		this.full = false;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getProfundity() {
		return profundity;
	}

	public void setProfundity(double profundity) {
		this.profundity = profundity;
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}

	@Override
	public String toString() {
		return "Box [high=" + high + "cm, width=" + width + "cm, profundity=" + profundity + "cm, full=" + full + "]";
	}
	
	

}
