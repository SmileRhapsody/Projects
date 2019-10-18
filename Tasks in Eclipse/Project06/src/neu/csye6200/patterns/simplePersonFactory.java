package neu.csye6200.patterns;

public class simplePersonFactory{

	enum personCriteria{
		customer, employee
	}

	public static Person getPerson(personCriteria criteria) {
		Person person = null;
		if(criteria == personCriteria.customer) {
			person = new Customer();
		}else if(criteria == personCriteria.employee) {
			person = new Employee();
		}
		return person;
	}
	
}
