package animal;

public class Animal {
	public String id;
	public String name;
	public String breed;
	public boolean sex;
	public Animal mother;
	public Animal father;
	public boolean dead;
	public Farm farm;

	public Animal(String id,
					String name,
					boolean sex,
					Farm farm) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.farm = farm;
	}
}