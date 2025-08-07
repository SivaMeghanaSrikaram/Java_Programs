package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		// to compare strings
		return e2.getEname().compareTo(e1.getEname());
	}
	
}
class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		
		//to compare salaries
		if(e1.getEsal()==e2.getEsal())
		{
			return 0;
		}
		else if(e1.getEsal()<e2.getEsal()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class ArrayListWithComparator {

	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList();
		Employee e = new Employee(1001,"Ram",40000);
		Employee e1 = new Employee(1002,"Sita",20000);
		Employee e2 = new Employee(1003,"Lakshman",50000);
		
		//add
		al.add(e);
		al.add(e1);
		al.add(e2);
		
		//(SORTING WITH NAMES)
		Collections.sort(al, new NameComparator());
		//to retrieve values based on name 
		
		for(Employee emp:al) {
			System.out.println(emp.getEid()+" "+emp.getEname()+" "+emp.getEsal());
		}
		
		//(SORTING BASED ON SALARY)
		Collections.sort(al, new SalaryComparator());
		for(Employee emp:al) {
			System.out.println(emp.getEid()+" "+emp.getEname()+" "+emp.getEsal());
		}
	}

}
