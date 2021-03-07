package exercise_1;

public class MultiSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere sphere1 = new Sphere(2.0);
		sphere1.setName("sphere1");
		Sphere sphere2 = new Sphere(4.0);
		sphere2.setName("sphere2");
		System.out.println(sphere1.toString());
		System.out.println(sphere2.toString());
		
		sphere1.setName("sphere1Modified");
		sphere1.setDiameter(10.0);
		
		System.out.println(sphere1.toString());


	}

}
