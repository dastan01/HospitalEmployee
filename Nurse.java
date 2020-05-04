public class Nurse extends Employee
{
	public boolean isORSet = false;

	
	public Nurse(String name, String address, String phone, 
		int employee_number)
	{
		super(name, address, phone, employee_number);
	}

	
	public void setOR()
	{
		isORSet = true;
	}
}