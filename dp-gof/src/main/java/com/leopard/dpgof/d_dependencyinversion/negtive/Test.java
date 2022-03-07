package com.leopard.dpgof.d_dependencyinversion.negtive;

/*

粗略来说，类和类之间的关系有三种：继承、关联、依赖。

关联: 一个类的对象作为另外一个类的字段时，就发生了关联关系.
class A {
}
class B {
	A a = new A();  // B关联了A
}

依赖: 一个类的对象作为另外一个类的局部变量时，就发生了依赖关系
class A {
}
class B {
	public void f1() {
		A a = new A();   // B依赖于A 完成了f1方法。  
	}
}


 依赖倒置原则： 上层不应该依赖于下层，它们（上层和下才能）都应该是依赖于抽象。
*/

// 用户

class Gitar {
	public void sound() {
		System.out.println("因为爱，所以爱!!");
	}
}

class Harp {
	public void sound() {
		System.out.println("竖琴... 当当当...");
	}
}

public class Test {
	public static void main(String[] args) {
		Piano p = new Piano();
		Gitar g = new Gitar();
		Harp h = new Harp();
		Person person = new Person("黄药师");
		person.play(p);
		person.play(g);
		person.play(h);
	}
}
