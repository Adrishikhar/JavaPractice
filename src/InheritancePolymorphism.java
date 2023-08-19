class Computer {
    public void show() {
        System.out.println("I am a Computer! ");
    }
}

class Laptop extends Computer{

    @Override
    public void show() {
        System.out.println("I am a Laptop!");
    }

    public void speciality() {
        System.out.println("I am lightweight!");
    }
}

public class InheritancePolymorphism {
    public static void main(String[] args) {
        Laptop victus = new Laptop();
        Computer lenovo = new Laptop();

        victus.speciality();
        victus.show();

        lenovo.show();

        // victus object cannot access Computer class methods
        // lenovo can access only those methods from Computer which are not over-ridden
    }
}


