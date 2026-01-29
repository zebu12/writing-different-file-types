public class Person {


    //TODO 1: Add instance variables: name (String), age (int), weight (double)

    // TODO 2: Create constructor with 3 parameters

    // TODO 3: Implement toString() method

    String name;
    int age;
    double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Hello, my name is "+name+" and my age is "+age+" and weight is "+weight;
    }
}

