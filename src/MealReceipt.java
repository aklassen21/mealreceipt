


import java.util.Scanner;

public class MealReceipt {

	public static void main(String[] args) {
		
		System.out.print("Tax and Tip Calculator\n");
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the name of your appetizer:\t");
		String appetizer = kb.nextLine();
		System.out.print("Please enter the price for the appetizer:\t");
		String appPriceStr = kb.nextLine();
		Double appPrice = Double.parseDouble(appPriceStr);
		
		System.out.println("Please enter the name of your entree:\t");
		String entree = kb.nextLine();
		System.out.print("Please enter the price for the entree:\t");
		String entPriceStr = kb.nextLine();
		Double entPrice = Double.parseDouble(entPriceStr);
		
		System.out.println("Please enter the name of your dessert:\t");
		String dessert = kb.nextLine();
		System.out.print("Please enter the price for the dessert:\t");
		String desPriceStr = kb.nextLine();
		Double desPrice = Double.parseDouble(desPriceStr);
		
		System.out.print("Please enter the tip as a decimal:\t");
		String tipStr = kb.nextLine();
		Double tip = Double.parseDouble(tipStr);
		
		appPrice *= 100;
		appPrice = Math.round(appPrice);
		appPrice /= 100;
		
		
	}

}
