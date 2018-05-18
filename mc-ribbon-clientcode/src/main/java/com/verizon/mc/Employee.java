package com.verizon.mc;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
		
		private int empId;
		private String empName;
		private String city;
		private double salary;
		
		//Not created the default constructor
		public Employee(){
			
		}
		
		public Employee(int empId, String empName, String city, double salary) {
			this.empId = empId;
			this.empName = empName;
			this.city = city;
			this.salary = salary;
		}
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", city=" + city + ", salary=" + salary + "]";
		}
		
		
	

}
