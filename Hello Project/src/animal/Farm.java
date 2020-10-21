package animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
	public String farmId;
	public String address;
	public Owner owner;

	public List<Animal> animals = new ArrayList();

	public Farm(String farmId, String address, Owner owner) {
		super();
		this.farmId = farmId;
		this.address = address;
		this.owner = owner;
	}

}
