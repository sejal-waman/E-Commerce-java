//main application

import java.util.*;

public class Ecommerce
{
	    public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			
			//create sample products
			
			Product product1=new Product("1","laptop",99999);
			Product product2=new Product("2","smartphone",45999);
			Product product3=new Product("3","headphones",999);
			
			ShoppingCart cart=new ShoppingCart();
			
			System.out.println("****welcome to E-Commerce System:****");
			
			boolean shopping=true;
			
			while(shopping)
			{
				System.out.println("1.view products:");
				System.out.println("2.add product to cart:");
				System.out.println("3.remove product from cart:");
				System.out.println("4.view cart:");
				System.out.println("5.checkout:");
				System.out.println("6.exit:");
				
				int choice=sc.nextInt();
				
				switch(choice)
				{
					case 1:
					System.out.println("available products:");
					System.out.println(product1);
					System.out.println(product2);
					System.out.println(product3);
					
					System.out.println("*****************************************************************");
					
					break;
					
					case 2:
					System.out.println("enter product id to add cart:");
					
					String addproductid=sc.next();
					
					if(addproductid.equals("1"))
					{
						cart.addProduct(product1);
					}
					else if(addproductid.equals("2"))
					{
						cart.addProduct(product2);
					}
					else if(addproductid.equals("3"))
					{
						cart.addProduct(product3);
					}
					else
					{
						System.out.println("invalid product id:");
					}
					
						System.out.println("product added to cart succesfully:");
					
					System.out.println("*****************************************************************");
					
					break;
					
					case 3:
					System.out.println("enter product id to remove from cart:");
					String removeproductid=sc.next();
					
					if(removeproductid.equals("1"))
					{
						cart.removeProduct(product1);
					}
					else if(removeproductid.equals("2"))
					{
						cart.removeProduct(product2);
					}
					else if(removeproductid.equals("3"))
					{
						cart.removeProduct(product3);
					}
					else
					{
						System.out.println("invalid product id:");
					}
					System.out.println("product remove from cart succesfully:");
					
					System.out.println("*****************************************************************");
					
					break;
					
					case 4:
					System.out.println("Your Cart:");
					System.out.println(cart);
					
					System.out.println("*****************************************************************");
					
					break;
					
					case 5:
					System.out.println("Checkout:");
					Checkout checkout=new Checkout();
					checkout.processPayment(cart);
					
					shopping=false;//exit after checkout
					
					System.out.println("*****************************************************************");
					
					break;
					
					case 6:
					shopping=false;//exit
					
					System.out.println("*****************************************************************");
					
					break;
					
					default:
					System.out.println("Invalid Choice:");
					
					System.out.println("*****************************************************************");
					
				}
	
					
			}
			sc.close();
			System.out.println("Thank You:");
			
		}
}






