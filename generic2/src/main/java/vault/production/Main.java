package vault.production;

import vault.concept.UniVault;
import vault.implement.HashMapVault;
import vault.developers.javadevelopers.JavaDeveloper;
import vault.implement.HighIqPredicate;

/**
 * Created by 8 on 06.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        UniVault<String,JavaDeveloper> hashMapVault = new HashMapVault<>();

        hashMapVault.put("Yanis", new JavaDeveloper("Yanis",120, false));
        hashMapVault.put("Maxim", new JavaDeveloper("Maxim",125, true));
        hashMapVault.put("Irina", new JavaDeveloper("Irina",140, false));
        hashMapVault.put("Vadim", new JavaDeveloper("Vadim",130, true));

        //System.out.println(hashMapVault.getAllByPredicate(new HighIqPredicate()));    // Выбор максимальногоIQ
        System.out.println(hashMapVault.getAllByPredicate(new HighIqPredicate()));

    }
}
