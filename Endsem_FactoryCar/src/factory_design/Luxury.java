package factory_design;

public class Luxury implements Design {

	public String designType() {
		return "Luxry car";
	}

	
	public Design getClone() {				
		return new Sports();
	}

}

