package dataStructure.doublylinkedlist;

public class MainClass {

	public static void main(String[] args) throws Exception{
		LinkedList<Integer> l = new LinkedList<>();
		l.add(3);
		l.add(4);
		l.add(6);
		l.printList();
		l.deleteAtLast();
		l.printList();
		
		LinkedList<Employee> employees = new LinkedList<>();
		Employee e = new Employee(23, "ADit");
		Employee e2 = new Employee(21, "naved");
		Employee e3 = new Employee(21, "abbas");
		employees.add(e);
		employees.add(e2);
		employees.add(e3);
		
		//employees.printList();
		employees.deleteAtLast();
		employees.printList();

	}

}

class Employee{

	int age;
	String name;
	
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	
}
