package dao;

import javax.persistence.*;

import pojo.EmpPojo;

@Entity
@Table(name = "EmployeeTable")
public class EmpHibernateEntity {
	
	EmpHibernateEntity() {}
	
	@Id
	@Column(name = "emp_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "emp_Name")
	private String name;

	@Column(name = "emp_Designation")
	private String designation;

	@Column(name = "emp_Age")
	private int age;

	@Column(name = "emp_Salary")
	private int salary;

	public EmpHibernateEntity(EmpPojo ep) {

		this.name = ep.getName();
		this.id = ep.getId();
		this.designation = ep.getDesignation();
		this.age = ep.getAge();
		this.salary = ep.getSalary();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

}
