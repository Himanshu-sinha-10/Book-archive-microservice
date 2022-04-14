package com.himanshu.entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
    private String genre;
    
    public Book() {}
	public Book(String name, String genre) {
		super();
		
		this.name = name;
		this.genre = genre;
	}
	public long getId() {
		return id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", genre=" + genre + "]";
	}
	
    
    

}
