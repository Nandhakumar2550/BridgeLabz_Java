package programming_elements.level1;

public class ProfitandLoss {
    public static void main(String args[]){
        double costprice =129;
        double sellingprice=191;

        double profit=sellingprice-costprice;
        double profitpercentage=(profit/costprice)*100;

        System.out.print("The Cost Price is INR " + costprice + " and Selling Price is INR " + sellingprice +
                "The Profit is INR " + profit + " and the Profit Percentage is " + profitpercentage
        );
    }
}
