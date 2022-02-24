package com.leopard.dpgof.d_dependencyinversion.postive;

// 用户

class Harp implements Instruments {
	public void sound() {
		System.out.println("圣斗士!!!");
	}
}

class Gitar implements Instruments {

	@Override
	public void sound() {
		System.out.println("we will rock you !");
	}
	
}

public class Test {

	public static void main(String[] args) {
		Piano p = new Piano();
		Harp h = new Harp();
		Gitar g = new Gitar();
		Person person = new Person("黄药师");
		person.play(p);
		person.play(h);
		person.play(g);
	}

}
