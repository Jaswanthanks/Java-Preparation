package Assigment2;

public class Main {
    public static void main(String[] args) {
    	
    	Student std = new Student();
    	std.display();
        Commission c = new Commission();
        c.setName("Jash");
        c.setAddress("Chennai");
        c.setPhone(9876543210L);
        c.setSales_amount(80000);

        System.out.println("Commission for " + c.getName() + ": ₹" + c.comissioncal());
    }
}
