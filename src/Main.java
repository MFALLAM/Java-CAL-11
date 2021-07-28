public class Main {
    public static void main(String[] args) {
       Box<Apple> appleBox = new Box<>();
 
       appleBox.addFruit(new Apple(100));
       System.out.println(appleBox.getNetWeight());
 
       Box<Orange> orangeBox = new Box<>();
       orangeBox.addFruit(new Orange(210));
 
       System.out.println(orangeBox.getNetWeight());
 
       System.out.println("Result " + appleBox.compare(orangeBox));
    }
 
 }
 