package vault.concept;

/**
 * Created by 8 on 06.04.2017.
 */
public interface Predicate<E> {
    /**
     *
     * @param elm
     * @return
     */
    boolean apply(E elm);
}
