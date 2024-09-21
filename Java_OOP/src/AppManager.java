public class AppManager {
    public static void main(String[] args) {
        Employe employe = new Employe("Wahyu");
        employe.sayHello();

        employe = new Manager("Andin");
        employe.sayHello();

        employe = new VicePresident("Luthfi Andini");
        employe.sayHello();

        sayHelloStatic(new Employe("Wahyu"));
        sayHelloStatic(new Manager("Luthfi Andini"));
        sayHelloStatic(new VicePresident("Andinn"));
    }

    public static void sayHelloStatic(Employe employe){
        if(employe instanceof Manager){
            Manager manager = (Manager) employe;
            System.out.println("Hai nama saya " + manager.name + ", saya adalah seorang Manager");
        } else if(employe instanceof VicePresident){
            VicePresident vp = (VicePresident) employe;
            System.out.println("Hai nama saya " + vp.name + ", saya adalah seorang Vp");
        } else{
            System.out.println("Hai nama saya " + employe.name + ", saya adalah seorang employe");
        }
    }
}
