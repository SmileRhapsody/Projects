package edu.neu.csye6200;

public class Item { 
	//1 private static int id;  ��̬�������Դ�����class���� û��staticֻ���ڶ�������
	// ��̬�������ܱ��̳�
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
