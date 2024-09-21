package programmer.zaman.now.data;

public abstract class Location {
    private String name;
    private boolean inEarth;

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isInEarth() {
        return inEarth;
    }

    public void setInEarth(boolean inEarth) {
        this.inEarth = inEarth;
    }

    public abstract void sayHello();
}
