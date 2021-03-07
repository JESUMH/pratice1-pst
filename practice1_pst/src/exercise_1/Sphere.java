package exercise_1;

public class Sphere {
	
	private String name;
	private double diameter;
	
	public Sphere (double diameter) {
		this.diameter = diameter;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVolumeOfSphere(double diameter) {
		return this.calculateVolumeSphere(diameter);
	}
	
	private double calculateVolumeSphere(double diameter) {
		double volume = 0;
		volume = 4*Math.PI*Math.pow(diameter/2,2);
		return volume;
	}

	@Override
	public String toString() {
		return "Sphere name: " + name +"," +" diameter: " + diameter + "," + "volume: " + calculateVolumeSphere(diameter);
	}
}
