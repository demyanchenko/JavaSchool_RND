package yurchenko;

/**
 * Created by 8 on 23.03.2017.
 */

public class less3 {

    /**
     * Выводим список котов и их возраст из маассива
     */
    public static void main(String[] args) {
        String [][] cats = {{"Tom","1"},{"Barsik","2"},{"Mashka","3"}};
        for (int i = 0; i<cats.length; i++)
            for (int j = 0; j < cats[i].length; j++)
                System.out.println(cats[i][j] + " ");




    }
}


