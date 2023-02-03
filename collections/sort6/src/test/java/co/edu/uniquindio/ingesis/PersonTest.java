package co.edu.uniquindio.ingesis;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class PersonTest {

    @Test
    void sort() {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Miguel", 18));
        list.add(new Person("Juan", 20));
        list.add(new Person("Ana", 18));
        list.add(new Person("Camilo", 19));
        list.add(new Person("Miguel", 23));
        list.add(new Person("Camilo", 17));


        for (Person person : list) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        System.out.println("ordering...");

        //TODO put here your solution for order the list


        // this line is equivalent to the for in the line 21
        list.forEach(person -> System.out.println(person.getName() + " " + person.getAge()));

    }
}