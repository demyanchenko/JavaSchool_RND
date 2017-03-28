package bvv.javaschool.collections.example.Main;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * Created by 8 on 28.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<String>(Arrays.asList("1","2","3","5","4"));

        System.out.println(stringList);

        Collections.sort(stringList);

        System.out.println(stringList);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John Doe", new Date()));
        persons.add(new Person("Jane Doe", new Date()));
        persons.add(new Person("Victor", new Date()));
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(persons);

        System.out.println(PersonsUtils.getPersonCount(persons)); // без защиты от изменения объекта
        System.out.println(PersonsUtils.getPersonCount(Collection.unmodifiableCollection(persons))); // с защитой
        System.out.println(PersonsUtils.getPersonCount(new ArrayList<>(persons))); // с защитой
        System.out.println(persons);
        System.out.println(persons.size());
    }

}
