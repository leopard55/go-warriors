package javabase.java8;

/**
 * @Title: PersonFactory
 * @Description: Let's see how the :: keyword works for constructors.
 * @Author: lz
 * @CreateDate: 2020/10/19 16:46
 * @Version: 1.0
 */
public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}

class Person{
    String firstName;
    String lastName;

    Person(){}

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        PersonFactory<Person> personPersonFactory = Person::new;
        Person person = personPersonFactory.create("Peter", "Parker");
        System.out.println(person.toString());
    }


}

