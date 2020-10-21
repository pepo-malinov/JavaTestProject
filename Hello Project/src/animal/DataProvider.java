package animal;

public class DataProvider {

	public static void main(String[] args) {
		Owner owner = generateOwner();
		System.out.println("Създаден е собственик с име "
		+ owner.name);
		owner.farms.forEach(farm->printFarmData(farm));
	}

	private static void printFarmData(Farm farm) {
		System.out.println(
						"Ферма с идентификатор: "
								+ farm.farmId+
				" и адрес" +farm.address);
		
		farm.animals.forEach(animal->
		System.out.println("Животно с име: "+animal.name+"се намира във ферма с идентификатор:"
				+farm.farmId
				
				)
		
				);
	}

	/**
	 * Метод генериращ статичен обект от тип {@link Owner}.
	 * 
	 * @return
	 */
	public static Owner generateOwner() {
		// инициализиране на обект от тип Owner,
		// чрез извикване на неговия конструктор
		Owner owner = new Owner();
		// въвеждане на данни по основните реквизите на обекта,
		// чрез директно достъпване на променливите на обекта
		owner.egn = "8611155566";
		owner.email = "owner1@.abv.bg";
		owner.name = "Иван Петров";
		owner.postCode = 4000;
		generateFarms(owner);
		return owner;
	}

	public static void generateFarms(Owner owner) {
		Farm farm1 = new Farm("Farm342", 
				"Смолян, ул. Стара река, 5",
				owner);
		Farm farm2 = new Farm("Farm344",
				"Враца, ул. Стара река, 5",
				owner);
		Farm farm3 = new Farm("Farm345",
				"Пловдив, ул. Стара река, 5",
				owner);
		owner.farms.add(farm1);
		generateAnimals(farm1);
		owner.farms.add(farm2);
		owner.farms.add(farm3);
	}
	
	public static void generateAnimals(Farm farm) {
		Animal animal1 = new Animal("BG985432",
							"Златка", true, farm);
		Animal animal2 = new Animal("BG235235",
							"Кокиче", true, farm);
		Animal animal3 = new Animal("BG324234",
							"Гладиатор", false, farm);
	farm.animals.add(animal1);
	farm.animals.add(animal2);
	farm.animals.add(animal3);
	}

}
