public class Sale {
    public Integer houseNumber;
    public String postcode;
    public Integer month;
    public Integer year;
    public double price;

    public Sale(Integer houseNumber,String postcode,Integer month,Integer year, double price){
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.month = month;
        this.year = year;
        this.price = price;
    }
}
