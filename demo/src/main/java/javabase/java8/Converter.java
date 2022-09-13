package javabase.java8;

/**
 * @Title: Converter    Functional Interfaces + ::
 * @Description:    A so called functional interface must contain exactly one abstract method declaration.
 * @Author: lz
 * @CreateDate: 2020/10/19 16:28
 * @Version: 1.0
 */

@FunctionalInterface
public interface Converter<F, T> {
    T convert(F from);
}

class ConverterImpl{
    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);

        // Java 8 enables you to pass references of methods or constructors via the :: keyword.
        // Java 8 中我们可以通过 `::` 关键字来访问类的构造方法，对象方法，静态方法。
        Converter<String, Integer> converter1 = Integer::valueOf;

        Integer converted = converter.convert("123");
        System.out.println(converted);
    }
}

// Method and Constructor References ::
// Java 8 enables you to pass references of methods or constructors via the :: keyword.
// The above example shows how to reference a static method. But we can also reference object methods:
// Let's see how the :: keyword works for constructors.
class Something{
    String stratsWith(String s) {
        return String.valueOf(s.charAt(0));
    }

    public static void main(String[] args) {
        Something something = new Something();
        Converter<String, String> converter = something::stratsWith;
        String converted = converter.convert("Java");
        System.out.println(converted);
    }
}