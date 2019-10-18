package edu.neu.csye6200;


public class Person
{
  private int age;
  private String name = null;
  
  public Person()
  {
    this.age = 17;
    this.name = "Dan";
  }
  
  public Person(int age, String name)
  {
    this.age = age;
    this.name = name;
  }
  
  public int getAge()
  {
    return this.age;
  }
  
  public void setAge(int age)
  {
    this.age = age;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String toString()
  {
    return "Person [age=" + this.age + ", name=" + this.name + "]";
  }
  
  
  
  public static void demo()
  {
    System.out.println("Person demo starting ...");
    Person dan = new Person();
    System.out.println(dan.getName());
    System.out.println("Person demo done");
  }
}
