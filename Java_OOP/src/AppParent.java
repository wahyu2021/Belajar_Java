public class AppParent {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Wahyu";
        child.doIt();
        System.out.println(child.name);

        Parent parent = child;
        parent.doIt();
    }
}
