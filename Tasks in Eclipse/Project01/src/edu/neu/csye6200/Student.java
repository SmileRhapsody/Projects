package edu.neu.csye6200;

public class Student
  extends Person
{
  private double gpa;
  
  public Student()
  {
	super();
    this.gpa = 4.0D;
  }
  
  public Student(int age, String name, double gpa)
  {
    super(age, name);
    this.gpa = gpa;
  }
  
  public String toString()
  {
    StringBuilder sb = new StringBuilder(super.toString());
    sb.append(" ").append("gpa=").append(this.gpa).append(" ");
    return sb.toString();
  }

public static void demo()
  {
    System.out.println(Student.class.getName() + ".demo() starting ...");
    
    Student dan = new Student();
    System.out.println(dan);
    
    System.out.println("\n\t demo done!");
  }
}
