//pojo class
package com.collections;

public class Product implements Comparable<Product>{
	
	//fields
	private int pid;
	private String pname;
	private int price;
	
	//constructor
	public Product(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	//methods
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product p) {
		
		if(price == p.price) {
			return 0;
		}
		else if(price>p.price){
			return 1;
		}
		else {
			return -1;
		}
	}
}
