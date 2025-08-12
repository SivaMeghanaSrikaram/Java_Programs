//pojo class
package com.lib;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//annotation
@Entity
@Table(name="books_info")
public class Book {

	//fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookId")
	private int bid;
	@Column(name = "bookName")
	private String bname;
	private int cost;
	
	//constructor
	public Book(int bid, String bname, int cost) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.cost = cost;
	}
	//methods
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Books [bid=" + bid + ", bname=" + bname + ", cost=" + cost + "]";
	}

}
