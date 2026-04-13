package programming_elements.level1;

public class ProfitandLoss {
    public static void main(String args[]){

        double costprice = 129;
        // Cost price of the item

        double sellingprice = 191;
        // Selling price of the item

        double profit = sellingprice - costprice;
        // Calculates profit

        double profitpercentage = (profit / costprice) * 100;
        // Calculates profit percentage

        System.out.print("The Cost Price is INR " + costprice +
                " and Selling Price is INR " + sellingprice +
                " The Profit is INR " + profit +
                " and the Profit Percentage is " + profitpercentage);
        // Displays cost price, selling price, profit, and profit percentage
    }
}