

import java.text.NumberFormat;

public class Project {

		// Project Attributes
		private String name ;
		private String project_number;
		private String property_type;
		private String physical_address;
		private int ERF_number;
		private int project_fee;
		private int amount_paid;
		private String project_deadline;
		
		public Project(String name, String project_number, String property_type, String physical_address, int ERF_number, int project_fee, int amount_paid, String project_deadline)
		{
			this.name = name;
			this.project_number = project_number;
			this.property_type = property_type;
			this.physical_address = physical_address;
			this.ERF_number = ERF_number;
			this.project_fee = project_fee;
			this.amount_paid = amount_paid;
			this.project_deadline = project_deadline;
		}
		
		public String get_project_name()
		{
			return name;
		}
		
		public void set_project_name(String new_name)
		{
			name = new_name;
		}
		
		public String get_project_number()
		{
			return project_number;
		}
		
		public void set_project_number(String new_project_number)
		{
			project_number = new_project_number;
		}
		
		public String get_property_type()
		{
			return property_type;
		}
		
		public void set_property_type(String new_property_type)
		{
			property_type = new_property_type;
		}
		
		public String get_physical_address()
		{
			return physical_address;
		}
		
		public void set_physical_address(String new_physical_address)
		{
			physical_address = new_physical_address;
		}
		
		public int get_project_fee()
		{
			return project_fee;
		}
		
		public void set_project_fee(int new_project_fee)
		{
			project_fee = new_project_fee;
		}
		
		public int get_amount_paid()
		{
			return amount_paid;
		}
		
		public void set_amount_paid(int new_amount_paid)
		{
			amount_paid = new_amount_paid;
		}
		
		public String get_project_deadline()
		{
			return project_deadline;
		}
		
		public void set_project_deadline(String new_project_deadline)
		{
			project_deadline = new_project_deadline;
		}
		
		
		public String output_display()
		{	
			NumberFormat fmt = NumberFormat.getCurrencyInstance();
			String output = "The name of the project is " + name;
			output += "\n" + "The project number is " + project_number;
			output += "\n" + "The property type is " + property_type;
			output += "\n" + "The physical address is " + physical_address;
			output += "\n" + "The ERF_number is " + ERF_number;
			output += "\n" + "The project_fee is " + fmt.format(project_fee);
			output += "\n" + "The amount paid is " + fmt.format(amount_paid);
			output += "\n" + "The project deadline is " + project_deadline;
			
			
			return output;
		}
		
}

