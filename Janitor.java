public class Janitor extends Administrator
{

	
    public Janitor(String name, String address, String phone, 
    	int employee_number)
    {
        super(name, address, phone, employee_number);
    }

    
    public void sweep()
    {
        System.out.println("Hello sweep here...\nHow can I help you");
    }
}