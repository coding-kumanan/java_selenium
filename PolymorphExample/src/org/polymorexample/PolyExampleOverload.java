package org.polymorexample;

public class PolyExampleOverload {

	public void emp1() {
		System.out.println("Emp1 name is Kumanan");	}
	public void emp1(String name) {
		System.out.println("Emp name is "+name);
	}
	public void emp1(String name, int age) {
		System.out.println("Emp name is "+name +" emp age is "+age );
	}
	public void emp1(int age, float height) {
		System.out.println("Emp name age is " +age+" emp height is "+height );
	}
	public void emp1(float height, int age) {
		System.out.println("emp height is "+height+" Emp age is "+age);
	}
	
	public static void main(String[] args) {
		PolyExampleOverload empDetails = new PolyExampleOverload();
		empDetails.emp1();
		empDetails.emp1("kannan1");
		empDetails.emp1("kumanan", 34);
		empDetails.emp1(34, 5.6f);
		empDetails.emp1(5.1f, 34);
		MethodOverLoad empdet = new MethodOverLoad();
		empdet.empId();
		empdet.empId(101);
		empdet.empId(101, "kumanan");
		empdet.empId("kumanan", 101);
}
}
