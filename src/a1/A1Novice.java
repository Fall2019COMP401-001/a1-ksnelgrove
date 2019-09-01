package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		process(scan);
		
	}
	
	public static void process(Scanner scan) {
		
			int countOfCustomers = scan.nextInt();
		
		for (int i = 0; i < countOfCustomers; i++) {
			String firstName;
			firstName = scan.next();
			String lastName;
			lastName = scan.next();
			int numberOfTotalItems;
			numberOfTotalItems = scan.nextInt();
			double totalPrice = 0;
			
			for (int j = 0; j < numberOfTotalItems; j++) {
				int numberOfEachItem;
				
				numberOfEachItem = scan.nextInt();
				String nameOfEachItem;
				nameOfEachItem = scan.next();
				double priceOfEachItem;
				priceOfEachItem = scan.nextDouble();
				totalPrice += numberOfEachItem * priceOfEachItem;
			}
			System.out.println(firstName.substring(0,1) + ". " + lastName + ": " + String.format("%.2f", totalPrice));
		}
		
	}
}
