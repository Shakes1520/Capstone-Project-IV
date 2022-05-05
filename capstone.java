import java.util.Scanner;

public class capstone {

	public static void main(String[] args) {
	// Declaring and creating class object
	
		
		// Scan inputs from the keyboard
		Scanner input_int = new Scanner(System.in);	
		Scanner input_string = new Scanner(System.in);	
			
		// Declaring variables
		String name, telephone_number, email_address, physical_address;
		String project_name, project_number, property_type, project_site, project_deadline;
		int ERF_number, project_fee, amount_paid, choice;
		
		// Capture the contractor's details 
		System.out.print("Please enter the name of the contractor: ");	
	    name = input_string .nextLine();
	    System.out.print("Please enter the telephone number of the contractor: ");	
	    telephone_number = input_string .nextLine();
	    System.out.print("Please enter the email address of the contractor: ");	
	    email_address = input_string .nextLine();
	    System.out.print("Please enter the physical address of the contractor: ");	
	    physical_address = input_string .nextLine();
	   
	    PersonalDetails contractor = new PersonalDetails(name,telephone_number,
	 									 email_address,physical_address);
	
		
	    // Capture the project's details 
		System.out.print("Please enter the name of the project: ");	
		project_name = input_string .nextLine();
		System.out.print("Please enter the project number: ");	
		project_number = input_string .nextLine();
		System.out.print("Please enter the type of the build being designed: ");	
		property_type = input_string .nextLine();
		System.out.print("Please enter the physical address for the project: ");	
		project_site = input_string .nextLine();
		System.out.print("Please enter the ERF number: ");	
		ERF_number = input_int .nextInt();
		System.out.print("Please enter the total fee being charged for the project fee: ");	
		project_fee = input_int .nextInt();
		System.out.print("Please enter the total amount paid to date: ");	
		amount_paid = input_int .nextInt();
		System.out.print("Please enter the deadline for the project: ");	
		project_deadline = input_string.nextLine();

		Project project = new Project(project_name, project_number, property_type,
									project_site, ERF_number, project_fee, amount_paid, project_deadline);
		
		do 
		{
				// Menu object
				
				System.out.println("1.To change the due date of the project ");
				System.out.println("2.To change the total amount of fee paid to date");
				System.out.println("3.To update the contractor's contact details");
				System.out.println("Enter 5 to stop the program");
				System.out.print("Please make a choice: ");
				choice = input_int.nextInt();
			
				switch (choice) 
				{	
				
					case 1:
						
						//  Change the due date of the project
						System.out.print("Please enter the new due date: ");
						String new_date = input_string.nextLine();
						project.set_project_deadline(new_date);
						
						System.out.print("\n");
						System.out.println(project.output_display());
						System.out.print("\n");
					   
					break;
						
						
					case 2:
						
						//  Change the total amount of the fee paid to date
						System.out.print("Please enter the new total amount of the fee paid to date: ");
						int new_total_amount = input_int.nextInt();
						project.set_amount_paid(new_total_amount);
						
						System.out.print("\n");
						System.out.println(project.output_display());
						System.out.print("\n");
						
					break;
					
					case 3:
						
						//  Update a contractor’s contact details
						System.out.print("Please enter the new contact number of the contractor: ");
						String new_contact_details = input_string.nextLine();
						contractor.set_telephone_number(new_contact_details);
						
						System.out.print("\n");
						System.out.println(contractor.output_display());
						System.out.print("\n");
						
					break;
					
				}				
			} while(choice != 5);


	}

}
