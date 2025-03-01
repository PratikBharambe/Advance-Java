package com.demo.beans;

public class Catagory {

	private int id;
	private String name;
	private String desc;

	public Catagory() {
		super();
	}

	public Catagory(int id, String name, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Catagory [id=" + id + ", name=" + name + ", desc=" + desc + "]";
	}

}
