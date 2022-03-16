package com.springcamp.dscatalog.entities;

import java.io.Serializable; //possa ser convertido em sequencia de bytes
import java.util.Objects;

public class Category implements Serializable {

	private static final long serialVersionUID = 1L;
	private long ID;
	private String name;
	
	public Category() {
		
	}
	public Category(long iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return ID == other.ID;
	}
	
	
}
