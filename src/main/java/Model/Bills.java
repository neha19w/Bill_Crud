package Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bills")
public class Bills {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	private int bill_Number;
	private String billed_To;
	private Date billed_Date;
	private String billed_price;
	private String billed_tax;
	private String total_price;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBill_Number() {
		return bill_Number;
	}
	public void setBill_Number(int bill_Number) {
		this.bill_Number = bill_Number;
	}
	public String getBilled_To() {
		return billed_To;
	}
	public void setBilled_To(String billed_To) {
		this.billed_To = billed_To;
	}
	public Date getBilled_Date() {
		return billed_Date;
	}
	public void setBilled_Date(Date billed_Date) {
		this.billed_Date = billed_Date;
	}
	public String getBilled_price() {
		return billed_price;
	}
	public void setBilled_price(String billed_price) {
		this.billed_price = billed_price;
	}
	public String getBilled_tax() {
		return billed_tax;
	}
	public void setBilled_tax(String billed_tax) {
		this.billed_tax = billed_tax;
	}
	public String getTotal_price() {
		return total_price;
	}
	public void setTotal_price(String total_price) {
		this.total_price = total_price;
	}
	
	
	
	
	

	
}
