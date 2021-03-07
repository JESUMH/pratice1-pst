package exercise_2.exercise_3;

public class BoxText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box smallBox = new Box(20, 15, 20);
		Box mediumBox = new Box(80,40,40);
		Box bigBox = new Box(150,100,100);
		
		//Print default boxes
		System.out.println(smallBox.toString());
		System.out.println(mediumBox.toString());
		System.out.println(bigBox.toString());
		
		//Full smallBox and change width
		smallBox.setWidth(40);
		smallBox.setFull(true);
		
		//Print small box modified
		System.out.println(smallBox.toString());

	}

}
