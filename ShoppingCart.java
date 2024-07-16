// class ShoppingCart

import java.util.ArrayList;
import java.util.List;




public class ShoppingCart
{
	private List<Product>products;
	
	public ShoppingCart()
	{
		this.products=new ArrayList<>();
	}
	
	public void addProduct(Product product)
	{
		products.add(product);
	}
	
	public void removeProduct(Product product)
	{
		products.remove(product);
	}
	
	public double getTotal()
	{
		double total=0;
		
		for(Product product:products)
		{
			total=total+product.getPrice();
		}
		return total;
	}
	
	//override toString method
	
	public String toString()
	{ 
	 return "products:"+products;
	}
}
