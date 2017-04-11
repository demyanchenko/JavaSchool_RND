package javaschool.exception.example;

/**
 * Created by 8 on 11.04.2017.
 */
public class Task2 {
    public static class Emploee {
        private int grade;

        public void setGrade(int grade) {
            if (grade<0 || grade>16) {
                throw new IllegalArgumentException("Некорректный грейд");
            }
            this.grade = grade;
        }

        public static void main(String[] args) {
            Emploee employee = new Emploee();
            employee.setGrade(80);
        }
    }
}
