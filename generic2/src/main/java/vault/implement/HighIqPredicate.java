package vault.implement;

import vault.concept.Predicate;
import vault.developers.Developer;

/**
 * Created by 8 on 06.04.2017.
 */
public class HighIqPredicate implements Predicate<Developer> {
    @Override
    public boolean apply(Developer elm) {
        if (elm.getIq().compareTo(130) > 0)
        return true;

        return false;
    }
}
