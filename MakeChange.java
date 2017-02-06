package homework;
import java.util.Scanner;
import java.text.DecimalFormat;
public class MakeChange {
	public static void main (String [] args) {
	    DecimalFormat df = new DecimalFormat(".##");

		
		double bills [] = {100, 50, 20, 10, 5, 1};
		int nBills [] = {0,0,0,0,0,0};
		int nCoins [] = {0,0,0,0,0};
		double coins [] = {.50, .25, .10, .05, .009};
		double price;
		double money;
		double change;
		
		Scanner kb = new Scanner (System.in);
		
		System.out.print("How much is this product? ");
		price = kb.nextDouble();
		//price = (int)price * 100;
		System.out.print("How much money did the customer give? ");
		money = kb.nextDouble();
		//money = (int) money * 100;
		
		while (money < price) {
			System.out.println("This isn't quite enough money deadbeat, I'm going to need more.");
			System.out.print("Please give me the correct ammount ");
			money = kb.nextDouble();
			
		}
		if (money == price){
		System.out.println("Wow, exact change! That never happens! Have a nice day!");
		}
		
		else {
		System.out.println("Thank you! Give me a moment while I calculate your change :D");	
		}
		change = money - price;
//		System.out.println(1 - .67);
//		System.out.println(change);
//		System.out.println(money);
//		System.out.println(price);
		while (change >= 1) {
			
			for (int i = 0; i < bills.length; i++) {
					if (bills [i] <= change){
						change = change - bills [i];
						System.out.println("$" + bills [i]);
						nBills [i]++;
					}
			} 
		}
			
			
//			System.out.println(change);
			while (change > 0) {
				for (int i = 0; i < coins.length; i++) {
						if (coins [i] <= change){
							change = change - coins [i];
														
							if (coins [i] == .50){
								System.out.println("Half dollars");
							}
								else if (coins [i] == .25 ){
									System.out.println(" Quarters");
								}
								else if (coins [i] == .1){
									System.out.println(" Dimes");
								}
								else if (coins [i] == .05){
									System.out.println(" Nickles");
								}
								else if(coins [i] == .009){
									System.out.println(" Pennies");
								}		
//							System.out.print(coins [i]);
							nCoins [i]++;
							
							
						}
				} 						
			
			}
	}
}




