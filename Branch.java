import java.util.ArrayList;
public class Branch {
    public String name;
    public ArrayList<Sale>branchSales;

    public Branch(String name) {
        this.name = name;
    }

    static Sale HighSale() {
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

    static double AvgSale(Integer targetYear) {
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

    static ArrayList<Sale> AllSalesHigh(double targetPrice){
        ArrayList<Sale> highSales=new ArrayList<>();
        for (Sale sale : branchSales) {
            if (sale.price>targetPrice) {
                 highSales.add(sale);
            }
        }
        return highSales;
    }
}
