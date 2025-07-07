package Assigment2;

public class Commission {
	private String name;
	private String Address;
	private long phone;
	private int sales_amount;
	
	
	
	public Commission() {
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getSales_amount() {
		return sales_amount;
	}
	public void setSales_amount(int sales_amount) {
		this.sales_amount = sales_amount;
	}
	
	public double comissioncal() {
		double commision = 0;
		if(sales_amount >= 100000) {
			commision = sales_amount * 0.10;
		}
		else if(50000<=sales_amount && sales_amount<100000) {
			commision = sales_amount * 0.05;
		}
		else if(30000 <=sales_amount && sales_amount<50000) {
			commision = sales_amount * 0.03;
		}
		else if (sales_amount<30000){
			commision = 0;
		}
		
		else {
			commision = 0;
		}
		
		return commision;
	}
	
}
