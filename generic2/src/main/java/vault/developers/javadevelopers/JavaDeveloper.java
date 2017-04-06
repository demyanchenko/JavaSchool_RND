package vault.developers.javadevelopers;

import vault.developers.Developer;

/**
 * Created by 8 on 06.04.2017.
 */
public class JavaDeveloper extends Developer {

    public JavaDeveloper(String name, Integer iq, boolean workInPPRB) {
        super(name, iq);
        this.workInPPRB = workInPPRB;
    }

    @Override
    public String toString() {
        return "JavaDeveloper{" +
                "name=" + getName() + '\'' +
                ", iq=" + this.getIq() +
                ", workInPPRB=" + this.isWorkInPPRB() +
                '}';
    }

    public void setWorkInPPRB(boolean workInPPRB) {
        this.workInPPRB = workInPPRB;
    }

    public boolean isWorkInPPRB() {

        return workInPPRB;
    }

    private boolean workInPPRB;

    public JavaDeveloper(String name, Integer iq) {
        super(name, iq);
    }
}
