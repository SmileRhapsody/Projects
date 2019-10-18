package edu.neu.csye6200;

public class Item { 
	//1 private static int id;  静态变量可以储存在class里面 没有static只能在对象里用
	// 静态方法不能被继承
	private int id;
	private String name;
	private String description;
	
	public Item() {
		super();
		init(id,name,description);
	}
	
	public Item(int id, String name, String description) {
		init(id,name,description);
	}
	
	private void init(int id, String name, String description) {
		this.id = id;	//assign supplied id parameter to object's id member
		this.name = name;
		this.description = description;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("#").append(id);
		sb.append(" ").append(name);
		sb.append(" '").append(description).append("'");
		return sb.toString();
//		return "Item [id=" + id + ", name=" + name + ", description=" + description + "]";
	}

	public static void demo() {
//1		Item.id = 7; //access static data id
		Item obj = new Item(8, "Nike", "shoes");
		System.out.println(obj);
	}

	
}
