package neu.csye6200.patterns;

import java.util.ArrayList;
import java.util.List;

import neu.csye6200.API.AbstractItemAPI;
import neu.csye6200.API.AbstractPersonAPI;
import neu.csye6200.API.AbstractStoreAPI;

public class WalMark extends AbstractStoreAPI{
	
	private String name;
	private String location;
	private int size;
	private List<AbstractPersonAPI> customers;
	private List<AbstractPersonAPI> employees;
	private List<AbstractItemAPI> breads;
	private List<TV> tvs;
	
	public WalMark() {
		name = "WalMark";
		location = "Boston";
		size = 400;
		customers = new ArrayList<>();
		employees = new ArrayList<>();
		breads = new ArrayList<>();
		tvs = new ArrayList<>();
	};
	
	public WalMark(String name, String location, int size) {
		this.name = name;
		this.location = location;
		this.size = size;
	};
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public List<AbstractPersonAPI> getCustomers() {
		return customers;
	}

	public void setCustomers(List<AbstractPersonAPI> customers) {
		this.customers = customers;
	}

	public List<AbstractPersonAPI> getEmployees() {
		return employees;
	}

	public void setEmployees(List<AbstractPersonAPI> employees) {
		this.employees = employees;
	}

	public List<AbstractItemAPI> getBreads() {
		return breads;
	}

	public void setBreads(List<AbstractItemAPI> breads) {
		this.breads = breads;
	}



	public List<TV> getTvs() {
		return tvs;
	}

	public void setTvs(List<TV> tvs) {
		this.tvs = tvs;
	}

	@Override
	public void show() {
		System.out.println(name + " " + location + " " + size);
	}
}
