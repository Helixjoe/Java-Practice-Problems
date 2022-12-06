import java.util.Scanner;

class Employee
{
	String Name,Add,Ph;
	int age,sal;
	
	Employee(String name, String ph,int age,String add,int sal)
	{
		this.Name = name;
		this.Ph = ph;
		this.age = age;
		this.Add = add;
		this.sal = sal;
	}
	void PrintSalary()
	{
		System.out.println("Salary is:"+sal);
	
	}

}

class Officer extends Employee
{
	String Spec;
	Officer(String Name,String Ph,int age,String Add,int sal,String spec)
	{
		super(Name,Ph,age,Add,sal);
		this.Spec = spec;
	}
	void PrintOfficer()
	{
		System.out.println("\nDetails of Officer:");
		System.out.println("Name:"+ (super.Name));
		System.out.println("Phone no:"+(super.Ph));
		System.out.println("Age:"+(super.age));
		System.out.println("Address:"+(super.Add));
		super.PrintSalary();
		System.out.println("Specialization is:"+Spec);
	}
}

class Manager extends Employee
{
	String Dept;
	Manager(String Name,String Ph,int age,String Add,int sal,String dept)
	{
		super(Name,Ph,age,Add,sal);
		this.Dept = dept;
	}
	void PrintManager()
	{
		System.out.println("\nDetails of Manager:");
		System.out.println("Name:"+super.Name);
		System.out.println("Phone no:"+super.Ph);
		System.out.println("Age:"+super.age);
		System.out.println("Address:"+super.Add);
		super.PrintSalary();
		System.out.println("Department is:"+Dept);
	}

		
}

class Main
{
	
	public static void main(String[] args)
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Details of Manager:");
		
		System.out.println("Enter Name:");
		String Name = inp.nextLine();
		System.out.println("Enter Address:");
		String Add = inp.nextLine();
		System.out.println("Enter Phone Number");
		String Ph = inp.nextLine();
		System.out.println("Enter Age:");
		int age = inp.nextInt();
		System.out.println("Enter Salary:");
		int sal = inp.nextInt();		

		System.out.println("Enter Department:");
		String dept = inp.next();
		Manager mang = new Manager(Name,Ph,age,Add,sal,dept);
	

		System.out.println("Enter Details of Officer:");
		
		System.out.println("Enter Name:");
		Name = inp.next();
		System.out.println("Enter Address:");
		Add = inp.next();
		System.out.println("Enter Phone Number");
		Ph = inp.next();
		System.out.println("Enter Age:");
		age = inp.nextInt();
		System.out.println("Enter Salary:");
		sal = inp.nextInt();

		System.out.println("Enter Specialization:");
		String spec = inp.next();
		Officer off = new Officer(Name,Ph,age,Add,sal,spec);	
		mang.PrintManager(); 	
		off.PrintOfficer();	
		
			
			
		
	}


}