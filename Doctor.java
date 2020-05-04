public class Doctor extends PatientCare
{
    
    public Doctor(String name, String address, String phone, 
        int employee_number, int permit_number, String permit_expiry_date)
    {
        super(name, address, phone, employee_number, permit_number, 
            permit_expiry_date);
    }

   
    public void prescribeDrug()
    {
        System.out.println("Take these drugs on time and visit again when needed");
    }

    
    public void print () 
    {
        System.out.println("Hospital Doctor Employee Data...");
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Phone Number: "+phone);
        System.out.println("Employee Number: "+employee_number);
        System.out.println("Permit Number: "+ permit_number);
        System.out.println("Permit Expiry Date: "+permit_expiry_date);
    }
}
