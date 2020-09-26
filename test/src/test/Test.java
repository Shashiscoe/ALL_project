package test;


class Car {
     public void show() {
       System.out.println("Car is running");
    }
}
   
class Nexon extends Car {
    public void show() {
       System.out.println("Nexon is running");
    }
}
   
class Main {
    public static void main(String[] args) {
        Car b = new Nexon();
        b.show();
    }
}
