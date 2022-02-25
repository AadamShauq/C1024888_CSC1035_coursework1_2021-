import java.util.ArrayList;

/**
 * This is a special class representing the Branch object. It has methods
 * relating to the highest sale recorded by the branch
 * the average sale value recorded by the branch in a given year
 * a list of all sales recorded by the branch with  value greater than a given amount
 */

public class Branch {

    public String name;
    public ArrayList<Sale>branchSales=new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }
    /**
     * This is a special method representing the highest sale for a single branch through the sale object. It has methods
     * the method loops through the sales array and finds the highest value
     * then this is returned
     */
    public Sale HighSale() {
        double highest=0;
        Sale curSale=null;
        for (Sale sale : branchSales) {
            if (sale.price>highest) {
                highest = sale.price;
                curSale = sale;
            }
        }
        return curSale;
    }
    /**
     * This is a special method representing the average sale for a single branch in a given year through the sale object. It has methods
     * the method loops through the sales array and finds the average value for a given year
     * then this is returned
     */
    public double AvgSale(int targetYear) {
        double total=0;
        int count=0;
        double averagePrice;

        for (Sale sale : branchSales) {
            if (sale.year == targetYear) {
                total += sale.price;
                count+=1;
            }
        }
        averagePrice = (total / count);
        return averagePrice;
    }
    /**
     * This is a special method representing the highest sale for a single branch thats over a given amount
     * through the sale object. It has methods
     * the method loops through the branch array and finds the highest values
     * then this is returned
     */
    public ArrayList<Sale> AllSalesHigh(double targetPrice){
        ArrayList<Sale> highSales=new ArrayList<>();
        for (Sale sale : branchSales) {
            if (sale.price>targetPrice) {
                 highSales.add(sale);
            }
        }
        return highSales;
    }
}
