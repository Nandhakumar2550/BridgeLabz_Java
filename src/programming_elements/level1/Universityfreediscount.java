package programming_elements.level1;

public class Universityfreediscount {
    public static void main(String args[]){

        double fee = 125000;
        // Original university fee

        double discountpercent = 10;
        // Discount percentage

        double discount = (discountpercent / 100) * fee;
        // Calculates discount amount

        double finalfee = fee - discount;
        // Calculates final fee after discount

        System.out.print("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalfee);
        // Displays discount and final fee
    }
}