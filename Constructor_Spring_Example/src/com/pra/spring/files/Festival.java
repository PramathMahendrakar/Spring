package com.pra.spring.files;

public class Festival {

	private String name= "Deepavali";

	public Festival() {
		System.out.println("Created Festival");
	}

	public Festival(String name) {
		this.name = name;
		System.out.println("arg 1 :" + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void celebration(String celebratedBy) {
		System.out.println("invoked celebration");
		System.out.println("arg 1" + celebratedBy);
		System.out.println(name);
		System.out.println("EXIT :: celebration");
	}

}
