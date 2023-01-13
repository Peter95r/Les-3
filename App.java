import shops.*;
import people.*;
import java.util.Scanner;

public class App{



	static Webshop shop = new Webshop();


	public static void main(String[] args){

	
	
	shop.products = "Milk";
	shop.seller = "Some guy";	



	shop.setPrice(20);
	shop.isOpen(true);
	shop.setOpeningTime(8,16);
	
	init();

	}

	public static void init(){
	
	Scanner in = new Scanner(System.in);



	System.out.println("Add price");

	double newPrice = in.nextDouble();
	if(newPrice> 0) shop.setPrice(newPrice);
	else System.exit(0);



	System.out.println("Is shop open now ?");

	boolean newOpen = in.nextBoolean();
	shop.isOpen(newOpen);
	 


	System.out.println("Sen ten oppening time (2 values)");

	int newOpenTime = in.nextInt();
	int newCloseTime = in.nextInt();
	if(newOpenTime>=0 || newCloseTime>=0) System.exit(0);
	else shop.setOpeningTime(newOpenTime, newCloseTime);

	

	System.out.println("What you sell?");

	String str = in.nextLine();
	shop.products = str;
	

	}

		

}
