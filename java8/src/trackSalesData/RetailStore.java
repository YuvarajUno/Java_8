package trackSalesData;

import java.time.LocalDate;

public class RetailStore 
{
	LocalDate timestamp;
	String productID;
	int QuantitySold;
	int price;
	
	RetailStore()
	{
		
	}
	
	
	public RetailStore(LocalDate timestamp,String productID,int QuantitySold,int price)
	{
		this.timestamp = timestamp;
		this.productID = productID;
		this.QuantitySold = QuantitySold;
		this.price  = price;
	}


	public LocalDate getTimestamp() {
		return timestamp;
	}


	public String getProductID() {
		return productID;
	}


	public int getQuantitySold() {
		return QuantitySold;
	}


	public int getPrice() {
		return price;
	}
	
	
	
}
