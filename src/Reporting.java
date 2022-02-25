import java.util.ArrayList;

/**
 * This is a special class representing the Report object. It has methods
 * relating to the branch with the largest average sale for a given year
 * the largest sale value ever recorded
 * a list of all sales recorded by the branch with value greater than a given amount
 */
public class Reporting {

    public Branch name;
    public ArrayList<Branch>branchNames=new ArrayList<>();

    public double BranchHighVal(int targetYear) {
        double total = 0;
        int count = 0;
        double branchVal = 0;

        for (Sale sale : branchSales) {
            if (sale.year == targetYear) {
                total += sale.price;
                count += 1;
                branchVal = branch;
            }
        }
        return branchVal;
    }

    public Sale HighSale() {
        double highest = 0;
        Sale curSale = null;
        for (Sale sale : branchSales) {
            if (sale.price > highest) {
                highest = sale.price;
                curSale = sale;
            }
        }
        return curSale;
    }

    public ArrayList<Sale> AllBranchHigh(double targetPrice) {
        ArrayList<Sale> highSales = new ArrayList<>();
        for (Sale sale : branchSales) {
            if (sale.price > targetPrice) {
                highSales.add(sale);
            }
        }
        return highSales;
    }
}