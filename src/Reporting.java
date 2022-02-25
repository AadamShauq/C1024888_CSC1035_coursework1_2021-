import java.util.ArrayList;

/**
 * This is a special class representing the Reporting object. It has methods
 * relating to the branch with the largest average sale for a given year
 * the largest sale value ever recorded
 * a list of all sales recorded by the branch with value greater than a given amount
 */
public class Reporting {

    public Branch name;
    public ArrayList<Branch>branchNames=new ArrayList<>();
    /**
     * This is a special method representing the Branch with the highest value using the Reporting object
     * a given year is passed into the method and it returns the value of the highest sale in that year
     * then is returned
     */
    public Branch BranchHighVal(int targetYear) {
        Branch curBranch=null;
        double highest=-1;
        double branchVal = -1;
        for (Branch branch : branchNames) {
            branchVal=branch.AvgSale(targetYear);
            if (branchVal > highest) {
                highest = branchVal;
                curBranch = branch;
            }
        }
        return curBranch;
    }
    /**
     * This is a special method representing the highest sale through the Branch object. It has methods
     * the method loops through the branch array and finds the highest value
     * then this is returned
     */
    public Sale HighSale() {
        Sale curSale=null;
        double highest = -1;
        Sale saleVal;
        for (Branch branch : branchNames) {
            saleVal = branch.HighSale();
            if (saleVal.price > highest) {
                highest = saleVal.price;
                curSale = saleVal;
            }
        }
        return curSale;
    }
    /**
     * This is a special method representing the values higher than the given one.
     * The method loops through the branches to find
     * each sale for each branch that is over the target price
     */
    public ArrayList<Sale> AllBranchHigh(double targetPrice) {
        ArrayList<Sale> highSales = new ArrayList<>();
        for (Branch branch : branchNames) {
            highSales.addAll(branch.AllSalesHigh(targetPrice));
        }
        return highSales;
    }
}