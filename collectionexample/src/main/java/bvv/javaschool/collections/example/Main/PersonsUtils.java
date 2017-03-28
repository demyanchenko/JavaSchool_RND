package bvv.javaschool.collections.example.Main;

import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Created by 8 on 28.03.2017.
 */
public class PersonsUtils {
    public static Integer getPersonsCount(List<Person> personList){
        //personList.add(new Person("Yanis", new Date()));
        personList.get(2).setName("VictorIII");
        return personList.size();
    }

}
