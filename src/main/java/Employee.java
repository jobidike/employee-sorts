
public class Employee implements Comparable<Employee> {
	
	private String id;
	private String firstName;
	private String lastName;
	
	public Employee (String id, String firstName, String lastName) {
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	@Override
	public boolean equals(Object obj) {
		Employee  other =(Employee) obj;
		return id.equals(other.id);   //&& firstName.equals(other.firstName))
	}

	@Override
	public int compareTo(Employee other) {  
		return id.compareTo(other.id); //have to put what i want to compare
		//firstName.compareTo(other.firstName);  //can compare names if i want
	}

}
