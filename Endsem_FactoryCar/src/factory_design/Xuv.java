package factory_design;

public class Xuv implements Design {

	
	public String designType() {
		return "XUV";
	}
	

	public Design getClone() {				
		return new Sports();
	}

}