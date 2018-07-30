public class Person {
    public static void main(String[] args) {
//        Person p = new Person ("Stephen");
//        p.setName("Stephen");
//        System.out.println(p.getName());
//        p.sayHello();
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);


    }

    public Person (String name) {
        this.name = name;
    }
    private String name;

    // returns the person's name
    public String getName() {
        return this.name;
    }
    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
        }



    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello " + name);

    }
}
