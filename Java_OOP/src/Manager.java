class Manager {
    protected String name;

    Manager(String name){
        this.name = name;
    }

    Manager(){
        this(null);
    }

    public void sayHello(){
        System.out.println("Hai nama saya " + this.name + ", saya adalah seorang manager");
    }
}

class VicePresident extends Manager{
    VicePresident(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hai nama saya " + this.name + ", saya adalah seorang vp");
    }
}
