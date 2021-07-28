import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruits> {
   private List<T> list;

   private double netWeight;

   public Box() {
      this.list = new ArrayList<>();
   }

   public void addFruit(T fruit) {
      list.add(fruit);
      this.netWeight = this.netWeight + fruit.getWeight();
   }

   public double getNetWeight() {
      return this.netWeight;
   }

   public boolean compare(Fruits arg1, Fruits arg2) {
      if (arg1.getWeight() == arg2.getWeight())
         return true;
      else
         return false;
   }

   public boolean compare(Box box) {
      if (this.netWeight == box.getNetWeight())
         return true;
      return false;
   }
}