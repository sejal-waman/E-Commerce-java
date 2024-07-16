

//class CheckOut

public class Checkout
{
	public void processPayment(ShoppingCart cart)
	{
		double total=cart.getTotal();
		System.out.println("processing Payment for:$"+total);
		System.out.println("Payment Processed Succesfully:");
	}
}
