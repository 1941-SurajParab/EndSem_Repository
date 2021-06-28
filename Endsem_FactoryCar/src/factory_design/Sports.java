package factory_design;

public class Sports implements Design {

	public String designType() {
		return "Sports car";
	}

	
	public Design getClone() {				
		return new Sports();
	}

}
