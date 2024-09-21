class Employe{
    protected String name;

    Employe(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hai nama saya " + this.name + ", saya adalah seorang employe");
    }

}

class Manager extends Employe{

    Manager(String name){
        super(name);
    }


    public void sayHello(){
        System.out.println("Hai nama saya " + this.name + ", saya adalah seorang manager");
    }
}

class VicePresident extends Manager{
    VicePresident(String name){
        super(name);
    }

    public void sayHello(){
        System.out.println("Hai nama saya " + this.name + ", saya adalah seorang vp");
    }
}
