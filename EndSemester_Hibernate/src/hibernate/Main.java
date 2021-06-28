package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
/**
 * 
 * @author Suraj Parab
 *
 */
public class Main {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		//object called contact1 is created 
		Invoice_Info invoice1 = new Invoice_Info();
		invoice1.setTotal_amount("10000"); //total amount value "10000" is set to the object
		invoice1.setC_Name("Suraj Parab");//customer name value "Suraj Parab" is set to the object

		//SessionFactory is an Interface which is present in org. hibernate package and it is used to create Session Object.
		SessionFactory sessionfactory = new AnnotationConfiguration().configure().buildSessionFactory();
		//The Session object is lightweight and designed to be instantiated each time an interaction is needed with the database.
		Session session=sessionfactory.openSession();
		session.beginTransaction();
		
		session.save(invoice1);

		session.getTransaction().commit();
		session.close();
		sessionfactory.close();

	}

}