package com.exception;

//creating own exception
class GreaterMarksException extends RuntimeException{
	
}
class Student{
	//fields
	int rollno;
	String sname;
	int marks;
	
	//constructor
	Student(int rollno, String sname, int marks){
		this.rollno=rollno;
		this.sname=sname;
		this.marks=marks;
	}
	
	//business logic
	void insert()
	{
		if(marks>100)
		{
			throw new GreaterMarksException();
		}
		else {
			System.out.println("Your marks with us");
		}
	}
}
public class CustomExceptionDemo {

	public static void main(String[] args) {
		//create object
		Student s=new Student(1001,"meghana",99);
		s.insert();
		Student s1=new Student(1002,"lavanya",101);
		s1.insert();
	}

}
