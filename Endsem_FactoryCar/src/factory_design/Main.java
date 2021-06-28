package factory_design;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		CFactory shapefactory = new CFactory();
		System.out.println(" Select car design you want ");
        System.out.println("\t1. Sports");
        System.out.println("\t2. Luxury");
        System.out.println("\t3. SUV ");
        System.out.println("\t4. Exit ");
        int choice = s.nextInt();
	
        	
        switch(choice) 
        {
        	case 1:
        		Design sports = shapefactory.getInstance(Ctype.SPORTS);
        		System.out.println("Car type you have selected:"+sports.designType());
     
        		System.out.println("***Features****");
        		System.out.println("top speed: 	250");
        		System.out.println("engine is: 	3000bhp");
        		System.out.println("safetey: 	airbrakes and airbags");
        		System.out.println("price: 		$75000");
        		
        		Design sports3 = sports.getClone();
        		System.out.println("You order for"+sports3.designType()+" is confirmed");
        		
        		
        		break;
        	
        	case 2:
        		Design luxury = shapefactory.getInstance(Ctype.LUXURY);
        		System.out.println("Car type you have selected "+luxury.designType());
        		
        		System.out.println("***Features****");
        		System.out.println("top speed: 	200");
        		System.out.println("engine is: 	2000bhp");
        		System.out.println("safety: 	airbrakes and airbags");
        		System.out.println("price: 		$1200000");
        		
        		Design luxury2 = luxury.getClone();
        		System.out.println("You order for "+luxury2.designType()+" is confirmed");
        		break;
        		
        	case 3:
        		Design xuv = shapefactory.getInstance(Ctype.XUV);
        		System.out.println("Car type you have selected "+xuv.designType());
        		
        		System.out.println("***Features****");
        		System.out.println("top speed: 	150");
        		System.out.println("engine is: 	2000bhp");
        		System.out.println("safety: 	airbrakes and airbags");
        		System.out.println("price: 		$60000");
        		
        		Design xuv2 = xuv.getClone();
        		System.out.println("You order for "+xuv2.designType()+" is confirmed");
        		break;
        	
        	case 4:
        		break;
        	
        	default:
        		System.out.println("Enter valid option");
        		break;
        }
        
        s.close();
        
	}

	}