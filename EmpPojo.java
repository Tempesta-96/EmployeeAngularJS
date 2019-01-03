package pojo;

import dao.EmpHibernateEntity;

public class EmpPojo {

	private String name;
	private String designation;
	private int age;
	private int salary;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EmpPojo(EmpHibernateEntity emp) {
		this.name = emp.getName();
		this.age = emp.getAge();
		this.designation = emp.getDesignation();
		this.salary = emp.getSalary();
		this.id = emp.getId();
	}

	public EmpPojo(String name, String designation, int age, int salary, int id) {
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
		this.id = id;
	}

	public EmpPojo(String name, String designation, int age, int salary) {
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.salary = salary;
	}

	public EmpPojo() {
	}

}
