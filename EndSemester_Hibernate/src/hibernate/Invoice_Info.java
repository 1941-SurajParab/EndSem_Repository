package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Suraj Parab
 *
 */
//@Entity annotation used to mention Contact_Info class as table
@Entity 
//table name "CONTACT_INFO" is given to class Contact_Info
@Table(name="INVOICE_INFO")
public class Invoice_Info {

		//sr_no is auto generated primary key 
		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		private int Sr_no;

		//column name "CONTACT" is given to the variable contact and not null value
		@Column(name="TOTAL_AMOUNT", nullable=false)
		private String Total_amount;
		
		//column name "FULL_NMAE" is given to the variable name and not null value
		@Column(name="CUSTOMER_NAME", nullable=false)
		private String C_Name; 
		
		/**
		 * 
		 * @return
		 */
		public int getSr_no() {
			return Sr_no;
		}

		/**
		 * 
		 * @param sr_no
		 */
		public void setSr_no(int sr_no) {
			Sr_no = sr_no;
		}

		/**
		 * 
		 * @return
		 */
		public String getTotal_amount() {
			return Total_amount;
		}

		/**
		 * 
		 * @param total_amount
		 */
		public void setTotal_amount(String total_amount) {
			Total_amount = total_amount;
		}

		/**
		 * 
		 * @return
		 */
		public String getC_Name() {
			return C_Name;
		}

		/**
		 * 
		 * @param c_Name
		 */
		public void setC_Name(String c_Name) {
			C_Name = c_Name;
		}
			
		
}