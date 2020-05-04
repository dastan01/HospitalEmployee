public class Administrator extends Employee
{
	
	public Administrator(String name, String address, String phone, 
		int employee_number)
    {
        super(name, address, phone, employee_number);
    }

    
    public void paySalary()
    {
    	System.out.println("All employees have been paid.");
    }

    
    public void orderEquipment()
    {
    	System.out.println("Equipment ordered!");
    }