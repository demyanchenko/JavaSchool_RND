package sbt.javaschool.rnd.examples;

import java.util.List;

/**
 * Created by 8 on 06.04.2017.
 */
public class Utils {
    public static void printListCount(List<? super Integer> integers){

        integers.add(new Integer(1));
        System.out.println(integers.size());
    }

    public static void addList(List<Integer> integers) {
        integers.add(new Integer(1));
    }
}
