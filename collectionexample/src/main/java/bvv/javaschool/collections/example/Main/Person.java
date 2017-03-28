package bvv.javaschool.collections.example.Main;

import java.util.Date;

/**
 * Created by 8 on 28.03.2017.
 */
public class Person {
    public Person(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    private String name;
    private Date birthDay;

    public String getName() {
        return name;
    }

    public Date getBirthDay() {
        return birthDay;
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
