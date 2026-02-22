package programming_elements.level1;

public class KilometertoMiles {
    public static void main(String args[]){
        double distanceinkm=10.8;
        double conversionfactor=1.6;
        double distancetomiles=distanceinkm/conversionfactor;
        System.out.print("The distance " + distanceinkm + " km in miles is " + distancetomiles);
    }
}
