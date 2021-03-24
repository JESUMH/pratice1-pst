package exercise_5;

public class FlightTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flight fly1 = new Flight("Line1",1);
		Flight fly2 = new Flight("Line2",2);
		
		
		System.out.println(fly1.toString());
		System.out.println(fly2.toString());
		
		//Modify fly2
		
		fly2.setFlightId(3);
		System.out.println(fly2.toString());
		
		//Get fly 1 name;
		System.out.println(fly1.getLineName());
	}

}
