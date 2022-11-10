package edu.lucas.marathon.B02JavaCore.A02MethodsInto.test;

import edu.lucas.marathon.B02JavaCore.A02MethodsInto.domain.Person;

public class PersonTest {
    public static void main(String... args) {
        var personOne = new Person();

        personOne.setName("Lucas");
        personOne.setAge(24);

        personOne.print();
    }
}
