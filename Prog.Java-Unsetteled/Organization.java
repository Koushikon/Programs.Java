import java.util.Scanner;
class Employee
{
	String name,emp_id;
	double salary;

	Employee(String nm, String id, double sal)
	{
		name=nm;
		emp_id=id;
		salary=sal;
	}
	void sal_incr()
	{
		salary=salary*1.03;
	}
	void display()
	{
		System.out.print("\nName :- "+name+"\nEmployee_ID :- "+emp_id+"\nSalary :- "+salary);
	}
}
class Department
{
	double allownce;
	String dept_name,h_o_d;

	Department(String dnm, double alw)
	{
		dept_name=dnm;
		allownce=alw;
	}

	void set_h_o_d(Employee e)
	{
		h_o_d=e.name;
		e.salary+=allownce;
		e.display();
	}

	void output()
	{
		System.out.print("\nDepartment name :- "+dept_name+"\nHead of department :- "+h_o_d+"\n");
	}
}
class Organization
{
	public static void main(String[] args)
	{
		Employee e1=new Employee("Biren","102",120000.00);
		Employee e2=new Employee("Harish","104",15000.00);
		Employee e3=new Employee("Akhilesh","110",50000.00);
		Department d1=new Department("Security",50000.00);
		Department d2=new Department("Marketing",6000.00);
		e1.sal_incr();
		e2.sal_incr();
		e3.sal_incr();
		d1.set_h_o_d(e1);
		e2.display();
		d1.output();
		d2.set_h_o_d(e3);
		d2.output();
	}
}
