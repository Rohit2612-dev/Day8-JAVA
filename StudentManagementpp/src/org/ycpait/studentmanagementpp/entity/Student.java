package org.ycpait.studentmanagementpp.entity;

import java.io.Serializable;

public  class Student implements Serializable,Comparable<Student>{
	private static int count;
	
	//attributes OR Instance Variables
	private int rollNumber;
	private String name;
	private float marks;
	
	public void setMarks(float marks)
	{
		this.marks=marks;
	}
	
	public float getMarks()
	{
		return this.marks;
	}
	//method defination
	//instance method
	void display(){
		System.out.println(this.name);//(s.name)
		System.out.println(this.rollNumber);
		System.out.println(this.marks);
	}
	void display(String format) {
		
		System.out.println("RollNumber \t Name \t  Marks");
		for (int i = 0; i <= 60; i++)
			System.out.print(format);
		
		System.out.println();
		System.out.println(this.rollNumber+"   \t      "+this.name+" \t      "+this.marks);
		
	}
	public static int getCount() {
		return count;
	}
	
//	void accept(int rollNumber,String name,float marks) {
//		this.rollNumber=rollNumber;
//		this.name=name;
//		this.marks=marks;
//	}
	
//	public Student(){
//		this.name="Guest";
//		this.rollNumber=1;
//		this.marks=96.8f;
//	}
	
	public Student(String name, float marks) {
		count++;
		this.rollNumber=count;
		this.name=name;
		this.marks=marks;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString()
	{
		System.out.println("in toString");
		return this.rollNumber+"   \t      "+this.name+" \t      "+this.marks;
	}

	public int getRollNumber() {
		// TODO Auto-generated method stub
		return this.rollNumber;
	}

 // 1st student marks are in marks  and second student marks are in o.
		
	
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return ( int) (marks- o.marks);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		System.out.println("In hashCode of student");		
		return this.name.length();
	}	
	
	@Override
	public boolean equals(Object o) {
		Student s = (Student)o;
		return this.name.equals(s.name);
	}
}