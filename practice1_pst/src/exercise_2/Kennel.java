package exercise_2;

public class Kennel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog("Rex",5);
		Dog dog2 = new Dog("Leo",10);
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		
		
		dog1.setName("Dog1Renamed");
		dog1.setAge(9);
		
		System.out.println(dog1.toString());

	}

}
