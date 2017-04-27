/**
 * Created by 8 on 27.04.2017.
 */
public class Apple {
    private String color;
    private int weight;

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {

        return color;
    }

    public int getWeight() {
        return weight;
    }

    public Apple(String color, int weight) {

        this.color = color;
        this.weight = weight;
    }
}
