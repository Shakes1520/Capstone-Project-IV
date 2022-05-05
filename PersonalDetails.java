
public class PersonalDetails 
{	// Personal details attributes
	private String name;
	private String telephone_number;
	private String email_address;
	private String physical_address;
	
	public PersonalDetails(String name, String telephone_number, String email_address, String physical_address) 
	{
		this.name = name;
		this.telephone_number = telephone_number;
		this.email_address = email_address;
		this.physical_address = physical_address;
	}
	
	public String get_name() 
	{
		return name;
	}
	
	public void set_name(String new_name) 
	{
		name = new_name ;
	}
	
	public String get_telephone_number() 
	{
		return telephone_number;
	}
	
	public void set_telephone_number(String new_telephone_number) 
	{
		telephone_number = new_telephone_number ;
	}
	
	public String get_email_address() 
	{
		return email_address;
	}
	
	public void set_email_address(String new_email_address) 
	{
		email_address = new_email_address ;
	}
	
	public String get_physical_address() 
	{
		return physical_address;
	}
	
	public void set_physical_address(String new_physical_address) 
	{
		physical_address = new_physical_address ;
	}
	
	public String output_display()
	{
		
		String output = "The name of the customer is "+name;
		output += "\n"+ "The telephone number is "+telephone_number;
		output += "\n"+ "The email address is "+email_address;
		output += "\n"+ "The physical address is "+physical_address;
		
		return output;
	}

	

	

}
