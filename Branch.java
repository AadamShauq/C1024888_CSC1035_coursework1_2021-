public class Branch {
    public String name;
    public ArrayList<Sale>branchSales;

    public Branch(String name) {
        this.name = name;
    }

    static void HighSale() {

    }

    static void AvgSale() {
        for (Sale sale : branchsales) ;
            if (sale.year == targetYear)
                total += sale.price;
            averagePrice = (total / Sale.length)
    }

    static void AllSalesHigh(){

    }
}
