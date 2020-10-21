package animal;

public class DataProvider {

	public static void main(String[] args) {
		Owner owner = generateOwner();
		System.out.println("�������� � ���������� � ��� "
		+ owner.name);
		owner.farms.forEach(farm->printFarmData(farm));
	}

	private static void printFarmData(Farm farm) {
		System.out.println(
						"����� � �������������: "
								+ farm.farmId+
				" � �����" +farm.address);
		
		farm.animals.forEach(animal->
		System.out.println("������� � ���: "+animal.name+"�� ������ ��� ����� � �������������:"
				+farm.farmId
				
				)
		
				);
	}

	/**
	 * ����� ��������� �������� ����� �� ��� {@link Owner}.
	 * 
	 * @return
	 */
	public static Owner generateOwner() {
		// �������������� �� ����� �� ��� Owner,
		// ���� ��������� �� ������� �����������
		Owner owner = new Owner();
		// ��������� �� ����� �� ��������� ��������� �� ������,
		// ���� �������� ���������� �� ������������ �� ������
		owner.egn = "8611155566";
		owner.email = "owner1@.abv.bg";
		owner.name = "���� ������";
		owner.postCode = 4000;
		generateFarms(owner);
		return owner;
	}

	public static void generateFarms(Owner owner) {
		Farm farm1 = new Farm("Farm342", 
				"������, ��. ����� ����, 5",
				owner);
		Farm farm2 = new Farm("Farm344",
				"�����, ��. ����� ����, 5",
				owner);
		Farm farm3 = new Farm("Farm345",
				"�������, ��. ����� ����, 5",
				owner);
		owner.farms.add(farm1);
		generateAnimals(farm1);
		owner.farms.add(farm2);
		owner.farms.add(farm3);
	}
	
	public static void generateAnimals(Farm farm) {
		Animal animal1 = new Animal("BG985432",
							"������", true, farm);
		Animal animal2 = new Animal("BG235235",
							"������", true, farm);
		Animal animal3 = new Animal("BG324234",
							"���������", false, farm);
	farm.animals.add(animal1);
	farm.animals.add(animal2);
	farm.animals.add(animal3);
	}

}
