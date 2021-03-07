package exercise_2;

public class Dog {
	
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	private int calculateAge(int age) {
		int ageDogHumman = 0;
		ageDogHumman = 7*age;
		return ageDogHumman;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age dog=" + age + ", "+ "age human= " + calculateAge(age) +"]";
	}
	
	

}
