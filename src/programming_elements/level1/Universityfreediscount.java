package programming_elements.level1;

public class Universityfreediscount {
    public static void main(String args[]){
        double fee=125000;
        double discountpercent=10;
        double discount=(discountpercent/100)*fee;
        double finalfee=fee-discount;
        System.out.print("The discount amount is INR " + discount + " and final discounted fee is INR "+ finalfee);
    }
}
