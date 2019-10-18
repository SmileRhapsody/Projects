package neu.csye6200.patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

import neu.csye6200.API.AbstractItemAPI;
import neu.csye6200.API.AbstractPersonAPI;
import neu.csye6200.factory.AbstractItemFactory;
import neu.csye6200.factory.AbstractPersonFactory;
import neu.csye6200.patterns.simplePersonFactory.personCriteria;

public class Controller{
	
	private int itemCount = 0;
	private int personCount = 0;
	private List<AbstractItemFactory> itemFactories = new ArrayList<>();
	private List<AbstractPersonFactory> personFactories = new ArrayList<>();
	private List<AbstractPersonAPI> persons = new ArrayList<>();
	private List<AbstractItemAPI> items = new ArrayList<>();
	private List<AbstractPersonAPI> customers;
	private List<AbstractPersonAPI> employees;
	private List<AbstractItemAPI> breads;
	private List<TV> tvs;
	
	public Controller() {
		WalMark wm = (new WalMarkFactory()).getStore();
		this.customers = wm.getCustomers();
		this.employees = wm.getEmployees();
		this.breads = wm.getBreads();
		this.tvs = wm.getTvs();
		EmployeeFactory ef = new EmployeeFactory();
		employees.add(ef.getPerson("zhao", "1", 12,"123",100));
		employees.add(ef.getPerson("qian", "2", 10,"101",110));
		employees.add(ef.getPerson("sun", "3", 45,"131",104));
		employees.add(ef.getPerson("li", "4", 30,"140",106));
		employees.sort(null);
		employees.forEach(System.out::println);	
		TVFactory tf = new TVFactory();
		tvs.add(tf.getItem("a", 12, 4, 12));
		tvs.add(tf.getItem("c", 10 ,35, 10));
		tvs.add(tf.getItem("b", 34, 12, 11));
		tvs.add(tf.getItem("t", 1.12, 21,44));
		tvs.sort(null);
		tvs.sort(Comparator.comparing(Item::getAvailable));
		tvs.sort(new Item()::compareByAvailable);
		Collections.sort(wm.getTvs(), new Comparator<TV>() {
			@Override
			public int compare(TV t1, TV t2) {
				return t1.getName().compareTo(t2.getName());
			}
		});
		wm.getTvs().forEach(System.out::println);
	};
	
	public Controller(int itemCount, int personCount) {
		WalMark wm = (new WalMarkFactory()).getStore();
		this.customers = wm.getCustomers();
		this.employees = wm.getEmployees();
		this.breads = wm.getBreads();
		this.tvs = wm.getTvs();
		this.itemCount = itemCount;
		this.personCount = personCount;
		load(new BreadFactory());
		load(new TVFactory());
		load(new CustomerFactory());
		load(new EmployeeFactory());
		create(itemCount, personCount);
		start();
	}
	
	public void load(AbstractItemFactory atf) {
		itemFactories.add(atf);
	}
	public void load(AbstractPersonFactory apf ) {
		personFactories.add(apf);
	}
	
	public void create(int itemCount, int personCount) {
		for(int i = 0; i < itemCount; i++) {
			for(AbstractItemFactory aif : itemFactories) {
				items.add(aif.getItem());
			}
		}
		for(int i = 0; i < personCount; i++) {
			for(AbstractPersonFactory apf : personFactories) {
				persons.add(apf.getPerson());
			}
		}
	}
	
	public void start() {
		for(AbstractItemAPI aia : items) {
			if(aia instanceof Bread) {
				breads.add(aia);
			}
			aia.show();
		}
		for(AbstractPersonAPI apa : persons) {
			apa.show();
		}
		for(AbstractItemAPI aia : breads) {
			aia.show();
		}
	}
	
	public static void demo(){
		Person p = simplePersonFactory.getPerson(personCriteria.customer);
		Controller c = new Controller(2,3);
		//Controller c1 = new Controller();
	}
}
