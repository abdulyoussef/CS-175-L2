import java.text.DecimalFormat;
import java.util.Scanner;

public class GroceryDiscount {
	private static DecimalFormat df = new DecimalFormat ("0.00");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		df.setMaximumFractionDigits(2);
		double price;
		final double discountEight = 0.08;
		final double discountTen = 0.10;
		final double discountTwelve = 0.12;
		final double discountFourteen = 0.14;
		double discount = 0;
		
		System.out.println("Please enter the cost of your groceries or 0 to quit ");
		price = sc.nextDouble();
		
		if (price < 10.00 ) {
			System.out.println("You are not eligible for a coupon at this time");
		}
		else if (price <= 60.00) {
			discount = price * discountEight;
				System.out.println("You win a discount coupon of " + df.format(discount) + " (" + df.format(discountEight * 100) + "% of your purchase)"  );
			
		}
		else if (price <= 150.00) {
			discount = price * discountTen;
				System.out.println("You win a discount coupon of " + df.format(discount) + " (" + df.format(discountTen * 100) + "% of your purchase)" 	 );
			
		}
		else if (price <= 210.00) {
			discount = price * discountTwelve;
				System.out.println("You win a discount coupon of " + df.format(discount) + " (" + df.format(discountTwelve * 100) + "% of your purchase)" 	 );
			
		}
		else  {
			discount = price * discountFourteen;
				System.out.println("You win a discount coupon of " + df.format(discount) + " (" + df.format(discountFourteen * 100) + "% of your purchase)" 	 );
			
		}

	}

}
