package jpMorgan.banking.withdraw;
import java.util.Scanner;

public class Employee {
	String name, des;
	int sal;
	

	public static void main(String[] args) {
		Employee ee = new Employee();
		Scanner sc = new Scanner(System.in);
		Boolean exit  =false;
		while(!exit) {
			System.out.println("\n\nEnter Your Choice. \n1) Create a new Employee.\n2) Display Details of employee.\n3) Raise Salary of employee.\n4) Exit.\n");
			int ch = sc.nextInt();
			switch(ch) {
			case 1: ee.create();
			break;
			case 2:  ee.disp();
			break;
			case 3: ee.raise();
			break;
			default: exit=true; 
				return;
			}
		}
	}
	
	void create() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		this.name = sc.nextLine();
		String[] names = name.split(" ");
		if(names.length>3) {
			System.out.println("Please Enter a Proper Name!");
			this.name = null;
			return;
		}
		System.out.println("Enter Employee Designation: ");
		this.des = sc.nextLine();
		System.out.println("Enter Employee Salary: ");
		this.sal = sc.nextInt();
		System.out.println("Employee Created Successfully");
	}
	void disp() {
		System.out.println("Employee details: \nName: "+this.name+"\nDesignation: "+this.des+"\nSalary: "+this.sal);
	}
	void raise() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Current Salary: "+this.sal);
		System.out.println("Enter Salary to Raise: ");
		this.sal=sc.nextInt();
		System.out.println("Salary Raised Successfully!");
		
	}

}
