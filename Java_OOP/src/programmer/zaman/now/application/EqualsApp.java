package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Wahyu";
        first = first + " " + "Wahid";

        String second = "Wahyu Wahid";

        System.out.println(first.equals(second));
        System.out.println(first.hashCode());
        System.out.println(second.hashCode());
    }
}
