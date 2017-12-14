import java.util.Comparator;

public class LastNameFirstNameComparator implements Comparator<Employee> {
	
	@Override //== because using integer
	public int compare(Employee o1, Employee o2) {
		int lastNameCompare = o1.getLastName().compareTo(o2.getLastName());
		if(lastNameCompare == 0) {  //compare last name first then compare first name
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
		return lastNameCompare;
	}

}
