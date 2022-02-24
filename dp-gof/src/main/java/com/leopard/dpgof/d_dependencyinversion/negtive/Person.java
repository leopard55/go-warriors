package com.leopard.dpgof.d_dependencyinversion.negtive;
// 作者
class Person {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public void play(Piano p) {
		System.out.println(name+"开始演奏");
		p.sound();
	}
	public void play(Gitar g) {
		System.out.println(name+"开始演奏");
		g.sound();
	}
	public void play(Harp h) {
		System.out.println(name+"开始演奏");
		h.sound();
	}
}
