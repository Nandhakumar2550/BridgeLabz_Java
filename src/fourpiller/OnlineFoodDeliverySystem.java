package fourpiller;
abstract class FoodItem{

    String name;
    double price;
    int quantity;

    FoodItem(String n,double p,int q){
        name=n;
        price=p;
        quantity=q;
    }

    abstract double calculateTotalPrice();
}

class VegItem extends FoodItem{

    VegItem(String n,double p,int q){
        super(n,p,q);
    }

    double calculateTotalPrice(){
        return price*quantity;
    }
}

class NonVegItem extends FoodItem{

    NonVegItem(String n,double p,int q){
        super(n,p,q);
    }

    double calculateTotalPrice(){
        return price*quantity+50;
    }
}
public class OnlineFoodDeliverySystem {
    public static void main(String[] args){

        FoodItem f1=new VegItem("Paneer",200,2);
        FoodItem f2=new NonVegItem("Chicken",300,2);

        System.out.println(f1.calculateTotalPrice());
        System.out.println(f2.calculateTotalPrice());
    }
}
