import java.util.*;

class Employee
{
	String name,address;
	int age,salary;
	long phone;
	Employee(String N,int A,long PH,String Add,int Sal)
	{
		this.name=N;
		this.age=A;
		this.phone=PH;
		this.address=Add;
		this.salary=Sal;
	}
	void printSalary()
	{
		System.out.println("The salary is: "+ salary);
	}
}

class Officer extends Employee
{
	String specialization;
	Officer(String N,int A,long PH,String Add,int Sal,String spcl)
	{
		super(N,A,PH,Add,Sal);
		specialization=spcl;
	}
	void displayOfficer()
	{
		System.out.println(" ");
		System.out.println("Name: "+super.name);
		System.out.println("Age: "+super.age);
		System.out.println("Adress: "+super.address);
		System.out.println("Phone number: "+super.phone);
		super.printSalary();
		System.out.println("Specialization: "+specialization);	
	}
}

class Manager extends Employee
{
	String department;
	Manager(String N,int A,long PH,String Add,int Sal,String dept)
	{
		super(N,A,PH,Add,Sal);
		department=dept;
	}
	void displayManager()
	{
		System.out.println(" ");
		System.out.println("Name: "+super.name);
		System.out.println("Age: "+super.age);
		System.out.println("Adress: "+super.address);
		System.out.println("Phone number: "+super.phone);
		super.printSalary();
		System.out.println("Department: "+department);	 
}
}
class EmployeeDemo
{
	public static void main(String args[])
	{
		String name,address,spcl,dept;
		int age,salary;
		long phone;
		Scanner sc=new Scanner(System.in);

		//Details for Officer
		System.out.println("\nENTER THE DETAILS FOR OFFICER");
		System.out.println("Enter the name:");
		name=sc.nextLine();
		System.out.println("Enter the phone number:");
		phone=sc.nextLong();
		System.out.println("Enter age:");
		age=sc.nextInt();
		System.out.println("Enter address:");
		address=sc.next();
		System.out.println("Enter the salary:");
		salary=sc.nextInt();
		System.out.println("Enter the specialization:");
		spcl=sc.next();
		Officer obj1 = new Officer(name,age,phone,address,salary,spcl);

		//Details for Manager
		System.out.println("\nENTER THE DETAILS FOR MANAGER");
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the phone number:");
		phone=sc.nextLong();
		System.out.println("Enter age:");
		age=sc.nextInt();
		System.out.println("Enter address:");
		address=sc.next();
		System.out.println("Enter the salary:");
		salary=sc.nextInt();
		System.out.println("Enter the department:");
		dept=sc.next();
		Manager obj2= new Manager(name,age,phone,address,salary,dept);

		//To display the entered details
		obj1.displayOfficer();
		obj2.displayManager();
	}
}