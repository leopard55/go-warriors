package com.leopard.dpgof.d_dependencyinversion.postive;
//作者
public class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void play(Instruments i) {
		i.sound();
	}
}
