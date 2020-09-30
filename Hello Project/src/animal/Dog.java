package animal;

import java.util.Arrays;
import java.util.List;

public class Dog {
	public String type;
	public String name;
	public String color;
	public boolean male;

	public static void main(String[] args) {
		Dog alex = new Dog();
		alex.type = "Pincher";
		alex.name = "Alex";
		alex.color = "black";
		alex.male = true;
		
		Dog gosho = new Dog();
		gosho.type = "Dakel";
		gosho.name = "Gosho";
		gosho.color = "black";
		gosho.male = true;
		List<Dog> dogs = 
				Arrays.asList(gosho,alex);
		dogs.forEach(dog->{
			System.out.println(
					"Здравей, aз се казвам " 
					+ dog.name);
		});
		

	}
}
