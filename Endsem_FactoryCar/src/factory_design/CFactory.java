package factory_design;


public class CFactory {
	public Design getInstance(Ctype type) {
		
		Design design = null;
			
		switch(type) 
		{
		
			case SPORTS:
				design = new Sports();
			break;
				
			case LUXURY:
				design = new Luxury();
				break;
				
			case XUV:
				design = new Xuv();
				break;
		}
		
		return design;
	}	
}