package com.md.entity;
public class User {
	private int id;
	private String name;
	private String password;
	private int age;
	private int deptId;
	private int empno;
	
	public User() {
		super();
	}
	public User(int id, String name, String password, int age, int deptId, int empno) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.deptId = deptId;
		this.empno = empno;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", deptId=" + deptId
				+ ", empno=" + empno + "]";
	}

	
	
}
