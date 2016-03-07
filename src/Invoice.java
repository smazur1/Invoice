

import java.util.Scanner;

public class Invoice {



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		double taxRatePercent, taxRate, price, tax;
		double subTotal = 0.0;
		double grandTotal = 0.0;



		double[] prices = new double[100];

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter Tax Rate : (%)");
		taxRatePercent = keyboard.nextDouble();
		taxRate = taxRatePercent / 100;

		System.out.println("Price # 1 : ");
		price = keyboard.nextDouble();

		int i = 0;

		while (price != 0.0)  {

			prices[i] = price;
			i ++;
			System.out.println("Price # " + (i + 1) + " : ");
			price = keyboard.nextDouble();

		}

		System.out.println();
		System.out.println("------------------------------------------\n");
		System.out.println("Receipt");


		if (prices[0] != 0.0) {
			for (int j = 0; j < i; j++) {
				subTotal = subTotal + prices[j];
				System.out.printf("$%.2f%n" , prices[j]);


			}
		}

		System.out.printf("$%.2f  SubTotal\n" , subTotal);
		tax = subTotal * taxRate;
		System.out.printf("$%.2f  Tax\n" , tax );
		grandTotal = subTotal + tax;
		System.out.printf("$%.2f  Grand Total", grandTotal );


		keyboard.close();
	}
}
