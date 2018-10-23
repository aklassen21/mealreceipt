


import java.util.Scanner;

public class MealReceipt {

	public static void main(String[] args) {
		
		System.out.print("Tax and Tip Calculator\n");
		Scanner kb = new Scanner(System.in);
		System.out.print("Please enter the name of your appetizer:\t");
		String appetizer = kb.nextLine();
		System.out.print("Please enter the price for the appetizer:\t");
		String appPriceStr = kb.nextLine();
		Double appPrice = Double.parseDouble(appPriceStr);
		
		System.out.print("Please enter the name of your entree:\t");
		String entree = kb.nextLine();
		System.out.print("Please enter the price for the entree:\t");
		String entPriceStr = kb.nextLine();
		Double entPrice = Double.parseDouble(entPriceStr);
		
		System.out.print("Please enter the name of your dessert:\t");
		String dessert = kb.nextLine();
		System.out.print("Please enter the price for the dessert:\t");
		String desPriceStr = kb.nextLine();
		Double desPrice = Double.parseDouble(desPriceStr);
		
		System.out.print("Please enter the tip as a decimal:\t");
		String tipStr = kb.nextLine();
		Double tip = Double.parseDouble(tipStr);
		
		System.out.println("\n\n" + appetizer + ": $" + appPrice);
		System.out.println(entree + ": $" + entPrice);
		System.out.println(dessert + ": $" + desPrice);
		
		Double subtotal = appPrice + entPrice + desPrice;
		subtotal = (int) (subtotal*100) / 100.0;
		
		Double tax = subtotal * 0.06;
		tax = (int) (tax*100) / 100.0;
		
		Double tipPrice = tip * subtotal;
		tipPrice = (int) (tipPrice*100) / 100.0;
		
		
		Double total = subtotal + tipPrice + tax;
		total = (int) (total*100) / 100.0;
		
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Tax: $" + tax);
		System.out.println("Tip @ " + (tip*100) + "%:  " + tipPrice);
		System.out.println("Total: $" + total);
		
		
	}

}
