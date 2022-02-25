/**
 * This is a class representing a Sale object. It has a
 * method making the object of a sale.
 */
public class Sale {
    public Integer houseNumber;
    public String postcode;
    public Integer month;
    public Integer year;
    public double price;

    /**
     * This is a constructor that lines up all the parameter values
     * with the field variables
      * @param houseNumber represents the house number of the sale
     * @param postcode represents the post code of the sale
     * @param month represents the month of the sale
     * @param year represents the year of the sale
     * @param price represents the price of the sale
     */
    public Sale(Integer houseNumber,String postcode,Integer month,Integer year, double price){
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.month = month;
        this.year = year;
        this.price = price;
    }
}
