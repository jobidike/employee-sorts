import static org.junit.Assert.*;
import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class EmployeeTest {
	
	
	@Test
	public void assertThatEmployeeIdentityIsBasedOnIdNotName() {
		Employee arthur = new Employee ("42","Arthur","Dent");
		Employee another = new Employee ("42","A","Dent");
		boolean check = another.equals(arthur);
		assertEquals(check, true);
		
	}
	@Test
	public void shouldBeAbleToSortEmployeesByIdByDefault() {
		Employee arthur = new Employee ("42","Arthur","Dent");
		Employee ford = new Employee ("23","Ford","Perfect");
		List<Employee> employees = new ArrayList<>(asList(arthur, ford));
		Collections.sort(employees);
		assertEquals(asList(ford, arthur), employees);
	}
	@Test
	public void shouldBeAbleToSortEmployeesByLastNameFirstNameUsingAComparator() {
		Comparator<Employee> lastNameFirstNameComparator = new LastNameFirstNameComparator();
		Employee atilla = new Employee ("86", "Atilla","Dent");
		Employee arthur = new Employee ("42","Arthur","Dent");
		Employee ford = new Employee ("23","Ford","Perfect");
		List<Employee> employees = new ArrayList<>(asList(atilla, arthur, ford));
		Collections.sort(employees, lastNameFirstNameComparator);
		assertEquals(asList(arthur, atilla, ford), employees);
	}
	@Test
	public void employeesShouldBeComparable() {
        assertTrue(Comparable.class.isAssignableFrom(Employee.class));
    }

}
