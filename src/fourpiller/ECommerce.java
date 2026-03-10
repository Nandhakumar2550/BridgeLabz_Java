package fourpiller;
import java.util.*;
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {

    private int productId;
    private String name;
    private double price;

    Product(int id,String name,double price){
        this.productId=id;
        this.name=name;
        this.price=price;
    }

    public double getPrice(){
        return price;
    }

    abstract double calculateDiscount();
    public void display(){
        System.out.println(name+" Price:"+price);
    }
}

class Electronics extends Product implements Taxable {

    Electronics(int id,String name,double price){
        super(id,name,price);
    }

    double calculateDiscount(){
        return getPrice()*0.10;
    }

    public double calculateTax(){
        return getPrice()*0.18;
    }

    public String getTaxDetails(){
        return "18% GST";
    }
}
public class ECommerce {
    public static void main(String[] args) {
        List<Product> products=new ArrayList<>();

        Electronics p1=new Electronics(1,"Laptop",50000);
        Electronics p2=new Electronics(2,"Mobile",20000);

        products.add(p1);
        products.add(p2);

        for(Product p:products){

            double tax=((Taxable)p).calculateTax();
            double finalPrice=p.getPrice()+tax-p.calculateDiscount();

            p.display();
            System.out.println("Final Price:"+finalPrice);
        }
    }
}
