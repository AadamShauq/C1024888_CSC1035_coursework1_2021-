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

    public ArrayList<Sale> AllBranchHigh(double targetPrice) {
        ArrayList<Sale> highSales = new ArrayList<>();
        for (Branch branch : branchNames) {
            highSales.addAll(branch.AllSalesHigh(targetPrice));
        }
        return highSales;
    }
}