package labs.Week_09;

public class MP3Player implements IItem{

	private static final double SALE_PERCENTAGE = 0.75;
	private double price = 0;
	
	/**
     * Constructs an MP3Player object with an initial price.
     * 
     * @param price the initial price of the item.
     */
    public MP3Player(double price) {
	super();
	this.price = price;
    }

    /**
     * Calculates the price at which the item should be sold in a sale.
     * 
     * @return the sale price.
     * 
     */
    public double calculateSalePrice() {
	return this.price * SALE_PERCENTAGE;
    }

    /**
     * @return the name of the item.
     * 
     */
    public String getName() {
	return "MP3 Player";
    }

    /**
     * @return the current price of the item.
     * 
     */
    public double getPrice() {
	return this.price;
    }

    /**
     * @param price defines the new item price.
     * 
     */
    public void setPrice(double price) {
	this.price = price;
    }

}
