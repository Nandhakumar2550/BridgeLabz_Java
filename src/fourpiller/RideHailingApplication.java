package fourpiller;
abstract class Vehicles{

    String driver;
    double rate;

    Vehicles(String d,double r){
        driver=d;
        rate=r;
    }

    abstract double calculateFare(double distance);
}

class Cars extends Vehicles{

    Cars(String d,double r){
        super(d,r);
    }

    double calculateFare(double distance){
        return distance*rate;
    }
}
public class RideHailingApplication {
    public static void main(String[] args){

        Vehicles v=new Cars("Ravi",15);

        System.out.println("Fare:"+v.calculateFare(10));
    }
}
