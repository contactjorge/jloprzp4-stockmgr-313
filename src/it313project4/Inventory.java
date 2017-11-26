package it313project4;

import java.util.Scanner;

public class Inventory extends InventoryManager{
	
	public void newCandyBar () {
		
		Scanner mgrInputCandy = new Scanner(System.in);
		System.out.println("Add a new Candy Bar to the inventory:");
		System.out.println("Press (1) for M&M's Peanut 12 ounce bag");
		System.out.println("Press (2) for M&M's Chocolate 12 ounce bag");
		System.out.println("Press (3) for Mars 2 ounce bar");
		System.out.println("Press (4) for Snickers 2 ounce bar");
		System.out.println("Press (5) for Hershey's Chocolate 2 ounce bar");
		System.out.println("Press (6) for Hershey's Almond 2 ounce bar");
		System.out.println("Press (7) for Hershey's Mr. Goodbar 2 ounce bar");
		System.out.println("Press (8) for StarBurst 2 ounce pack");
		System.out.println("Press (9) for Gummy Bears 11 ounce bag");
		int inputNum = mgrInputCandy.nextInt();
		
		mgrInputCandy.close();
		switch (inputNum) {
			case 1: CandyBarItem peanutMMS = new CandyBarItem("MMS Peanut", "MARS M&M's Flagship", 0.5, 12, true,
					true);
			case 2: CandyBarItem chocMMS = new CandyBarItem("MMS Chocolate", "MARS M&M's Flagship", 0.5, 12, true,
					true);
			case 3: CandyBarItem mars = new CandyBarItem("Mars", "MARS Flagship bar", 0.5, 2, true, true);
			case 4: CandyBarItem snickers = new CandyBarItem("Snickers", "MARS Snicker's Bar", 0.5, 2, true, true);
			case 5: CandyBarItem hersheyChoc = new CandyBarItem("Hershey's Chocolate", "Hershey's Chocolate Bar",
					0.45, 2, true, false);
			case 6: CandyBarItem hersheyAlmond = new CandyBarItem("Hershey's Almond", "Hershey's Almond Bar", 0.45, 2,
					true, true);
			case 7: CandyBarItem goodbar = new CandyBarItem("Mr. Goodbar", "Hershey's Mr. Goodbar", 0.45, 2, true,
					true);
			case 8: CandyBarItem starBurst = new CandyBarItem("Starburst", "StarBurst Fruit Chews", 0.55, 2, false,
					false);
			case 9: CandyBarItem gummyBear = new CandyBarItem("Gummy Bear", "Black Forest Gummy Bears", 0.75, 11,
					false, false);
		}
	}
	
	public void newCrisps () {
		Scanner mgrInputCrisps = new Scanner(System.in);
		System.out.println("Add a new 24 ounce Bag of Crisps to the inventory:");
		System.out.println("Press (1) Lay's Potato Chips");
		System.out.println("Press (2) Lay's Baked Potato Chips");
		System.out.println("Press (3) Doritos Corn Chips");
		System.out.println("Press (4) Doritos Baked Corn Chips");
		System.out.println("Press (5) Yorkshire Crisps US");
		System.out.println("Press (6) for Takis MX");
		int inputNum = mgrInputCrisps.nextInt();
		
		mgrInputCrisps.close();
		switch (inputNum) {
			case 1: CrispsItem laysFried = new CrispsItem("Lay's Chips US", "Lay's Potato Chips", 0.70,
					16,	false);
			case 2: CrispsItem laysBaked = new CrispsItem("Lay's Baked US", "Lay's Baked Potato Chips", 0.70, 16,
					true);
			case 3: CrispsItem doritos = new CrispsItem("Doritos US", "Doritos Corn Chips", 0.70, 16,
					true);
			case 4: CrispsItem cheetos = new CrispsItem("Cheetos UK", "Cheese Flavour Crisps", 0.70, 16,
					true);
			case 5: CrispsItem yorkshireFried = new CrispsItem("Yorkshire UK", "Award-winning Yorkshire Crisps",
					0.64, 16, true);
			case 6: CrispsItem takis = new CrispsItem("Takis MX", "Takis Rolled Corn Chip ", 0.86, 16,
					true);
		}
	}
	
	public void newSodaWater () {
		Scanner mgrInputSoda = new Scanner(System.in);
		System.out.println("Add a new 24 ounce Bag of Crisps to the inventory:");
		System.out.println("Press (1) Coke 12 Oz");
		System.out.println("Press (2) Coke Diet 12 Oz");
		System.out.println("Press (3) Coke Caffeine Free 12 Oz");
		System.out.println("Press (4) Sprite 12 Oz");
		System.out.println("Press (5) Sprite Diet 12 Oz");
		System.out.println("Press (6) Tango 12 Oz");
		
		int inputNum = mgrInputSoda.nextInt();
		
		mgrInputSoda.close();
		switch (inputNum) {
			case 1:
				SodaWaterItem coke = new SodaWaterItem("Coke", "Coca-Cola", 12, 0.40, true, true);
			case 2:
				SodaWaterItem cokeDiet = new SodaWaterItem("Coke Diet", "Coca-Cola", 12, 0.40, true, true);
			case 3:
				SodaWaterItem cokeCafFree = new SodaWaterItem("Coke Caffeine Free", "Coca-Cola", 12, 0.40, true,
						true);
			case 4:
				SodaWaterItem sprite = new SodaWaterItem("Sprite", "Lemon Lime Soda", 12, 0.40, true, true);
			case 5:
				SodaWaterItem spriteDiet = new SodaWaterItem("Sprite Diet", "Diet Lemon Lime Soda", 12, 0.40, true,
						true);
			case 6:
				SodaWaterItem lilt = new SodaWaterItem("Lilt", "Lilt Cola GB", 12, 0.46, true, true);
		}
	}
	
	public Inventory ()
	{
		Scanner mgrInput = new Scanner(System.in);
		System.out.println("Duty free inventory");
		System.out.println("Press (1) to enter a new soft drink.");
		System.out.println("Press (2) to enter a new salty snack.");
		System.out.println("Press (3) to enter a new candy snack.");
		
		int inputNum = mgrInput.nextInt();
		
		mgrInput.close();
		
		switch (inputNum) {
			case 1:
		}
		
	}
}
