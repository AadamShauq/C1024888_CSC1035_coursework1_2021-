public class Branch {
    public String name;
    public ArrayList<Sale>branchSales;

    public Branch(String name) {
        this.name = name;
    }

    static double HighSale() {

    }

    static double AvgSale(Integer targetYear) {
        double total=0;
        int count=0;
        double averagePrice;

        for (Sale sale : branchsales) {
            if (sale.year == targetYear) {
                total += sale.price;
                count+=1;
            }
        }
        averagePrice = (total / count);
        return averagePrice;
    }

    static double AllSalesHigh(){

    }
}
