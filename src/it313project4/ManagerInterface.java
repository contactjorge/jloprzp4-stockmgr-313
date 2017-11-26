package it313project4;

import java.util.Scanner;

public class ManagerInterface {
	
	public void newItem () {
		
		Scanner mgrInputNew = new Scanner(System.in);
		int option = 0;
		
		do {
			System.out.println("Add a new Item to the inventory:");
			System.out.println("Press (1) for M&M's Peanut 12 ounce bag");
			System.out.println("Press (2) for Snickers 2 ounce bar");
			System.out.println("Press (3) for Hershey's Almond 2 ounce bar");
			System.out.println("Press (4) for StarBurst 2 ounce pack");
			System.out.println("Press (5) Coke 12 Oz");
			System.out.println("Press (6) Coke Diet 12 Oz");
			System.out.println("Press (7) Sprite 12 Oz");
			System.out.println("Press (8) Lay's Potato Chips");
			System.out.println("Press (9) Lay's Baked Potato Chips");
			System.out.print("Press (10) Doritos Corn Chips\n");
			
			option = mgrInputNew.nextInt();
			
			switch (option) {
				case 1 : option = 1; CandyBarItem peanutMMS = new CandyBarItem("MMS Peanut", "MARS M&M's Flagship",
						0.5, 12, true, true); break;
				case 2 : option = 2; CandyBarItem snickers = new CandyBarItem("Snickers", "MARS Snicker's Bar",
						0.5, 2, true, true); break;
				case 3 : option = 3; CandyBarItem hersheyAlmond = new CandyBarItem("Hershey's Almond", "Hershey's" +
						" Almond Bar", 0.45, 2, true, true); break;
				case 4 : option = 4; CandyBarItem starBurst = new CandyBarItem("Starburst", "StarBurst Fruit " +
						"Chews", 0.55, 2, false, false); break;
				case 5: option = 5; SodaWaterItem coke = new SodaWaterItem("Coke", "Coca-Cola", 12, 0.40, true, true); break;
				case 6: option = 6; SodaWaterItem cokeDiet = new SodaWaterItem("Coke Diet", "Coca-Cola", 12, 0.40,
						true, true); break;
				case 7: option = 7; SodaWaterItem sprite = new SodaWaterItem("Sprite", "Lemon Lime Soda", 12, 0.40,
						true, true); break;
				case 8: option = 8; CrispsItem laysFried = new CrispsItem("Lay's Chips US", "Lay's Potato Chips", 0.70,
						16,	false); break;
				case 9: option = 9; CrispsItem laysBaked = new CrispsItem("Lay's Baked US", "Lay's Baked Potato Chips",
						0.70, 16, true); break;
				case 10: option = 10; CrispsItem doritos = new CrispsItem("Doritos US", "Doritos Corn Chips", 0.70, 16,
						true); break;
				}
		} while (option > 11);
		
		mgrInputNew.close();
	}
	
	public void addStock () {
		
		Scanner mgrInputAdd = new Scanner(System.in);
		int option = 0;
		
		do {
			System.out.println("Add more of an item to the inventory:");
			System.out.println("Press (1) for M&M's Peanut 12 ounce bag");
			System.out.println("Press (2) for Snickers 2 ounce bar");
			System.out.println("Press (3) for Hershey's Almond 2 ounce bar");
			System.out.println("Press (4) for StarBurst 2 ounce pack");
			System.out.println("Press (5) Coke 12 Oz");
			System.out.println("Press (6) Coke Diet 12 Oz");
			System.out.println("Press (7) Sprite 12 Oz");
			System.out.println("Press (8) Lay's Potato Chips");
			System.out.println("Press (9) Lay's Baked Potato Chips");
			System.out.print("Press (10) Doritos Corn Chips\n");
			
			option = mgrInputAdd.nextInt();
			
			switch (option) {
				case 1 : option = 1; break;
				case 2 : option = 2; break;
				case 3 : option = 3; break;
				case 4 : option = 4; break;
				case 5 : option = 5; break;
				case 6: option = 6; break;
				case 7: option = 7; break;
				case 8: option = 8; break;
				case 9: option = 9; break;
				case 10: option = 10; break;
			}
		} while (option > 11);
			
			/*if( mgrInputCandy.hasNextInt() )
			{ } else {
			System.out.println("Enter 1 number only");
			this.newItem();
			}
			*/
		mgrInputAdd.close();
	}
	
	private void removeStock() {
		Scanner mgrInputRemove = new Scanner(System.in);
		int option = 0;
		
		do {
			System.out.println("Add more of an item to the inventory:");
			System.out.println("Press (1) for M&M's Peanut 12 ounce bag");
			System.out.println("Press (2) for Snickers 2 ounce bar");
			System.out.println("Press (3) for Hershey's Almond 2 ounce bar");
			System.out.println("Press (4) for StarBurst 2 ounce pack");
			System.out.println("Press (5) Coke 12 Oz");
			System.out.println("Press (6) Coke Diet 12 Oz");
			System.out.println("Press (7) Sprite 12 Oz");
			System.out.println("Press (8) Lay's Potato Chips");
			System.out.println("Press (9) Lay's Baked Potato Chips");
			System.out.print("Press (10) Doritos Corn Chips\n");
			
			option = mgrInputRemove.nextInt();
			
			switch (option) {
				case 1 : option = 1; break;
				case 2 : option = 2; break;
				case 3 : option = 3; break;
				case 4 : option = 4; break;
				case 5 : option = 5; break;
				case 6: option = 6; break;
				case 7: option = 7; break;
				case 8: option = 8; break;
				case 9: option = 9; break;
				case 10: option = 10; break;
			}
		} while (option > 11);
		
		mgrInputRemove.close();
		
	}
	
	private void findStock() {
		Scanner mgrInputFind = new Scanner(System.in);
		int option = 0;
		
		do {
			System.out.println("Find items to the inventory:");
			System.out.println("Press (1) for M&M's Peanut 12 ounce bag");
			System.out.println("Press (2) for Snickers 2 ounce bar");
			System.out.println("Press (3) for Hershey's Almond 2 ounce bar");
			System.out.println("Press (4) for StarBurst 2 ounce pack");
			System.out.println("Press (5) Coke 12 Oz");
			System.out.println("Press (6) Coke Diet 12 Oz");
			System.out.println("Press (7) Sprite 12 Oz");
			System.out.println("Press (8) Lay's Potato Chips");
			System.out.println("Press (9) Lay's Baked Potato Chips");
			System.out.print("Press (10) Doritos Corn Chips\n");
			
			option = mgrInputFind.nextInt();
			
			switch (option) {
				case 1 : option = 1; break;
				case 2 : option = 2; break;
				case 3 : option = 3; break;
				case 4 : option = 4; break;
				case 5 : option = 5; break;
				case 6: option = 6; break;
				case 7: option = 7; break;
				case 8: option = 8; break;
				case 9: option = 9; break;
				case 10: option = 10; break;
			}
		} while (option > 11);
		
		mgrInputFind.close();
		
	}
	
	private void displayStock() {
		Scanner mgrInputDisplay = new Scanner(System.in);
		int option = 0;
		
		do {
			System.out.println("Display items in the inventory:");
			System.out.println("Press (1) for M&M's Peanut 12 ounce bag");
			System.out.println("Press (2) for Snickers 2 ounce bar");
			System.out.println("Press (3) for Hershey's Almond 2 ounce bar");
			System.out.println("Press (4) for StarBurst 2 ounce pack");
			System.out.println("Press (5) Coke 12 Oz");
			System.out.println("Press (6) Coke Diet 12 Oz");
			System.out.println("Press (7) Sprite 12 Oz");
			System.out.println("Press (8) Lay's Potato Chips");
			System.out.println("Press (9) Lay's Baked Potato Chips");
			System.out.print("Press (10) Doritos Corn Chips\n");
			
			option = mgrInputDisplay.nextInt();
			
			switch (option) {
				case 1 : option = 1; break;
				case 2 : option = 2; break;
				case 3 : option = 3; break;
				case 4 : option = 4; break;
				case 5 : option = 5; break;
				case 6: option = 6; break;
				case 7: option = 7; break;
				case 8: option = 8; break;
				case 9: option = 9; break;
				case 10: option = 10; break;
			}
		} while (option > 11);
		
		mgrInputDisplay.close();
		
	}
	
	private void startInterface(int option) {
		
		switch (option) {
			case 1: option = 1; newItem(); break;
			case 2: option = 2; addStock(); break;
			case 3: option = 3; removeStock(); break;
			case 4: option = 4; findStock(); break;
			case 5: option = 5;	displayStock(); break;
		}
	}
	
	public void ManagerInterface() {
		
		int mgrOption = 0;
		Scanner mgrInput = new Scanner(System.in);
		
		do {
			System.out.println("Duty free inventory");
			System.out.println("Press (1) to enter a new item.");
			System.out.println("Press (2) to add quantity of an item.");
			System.out.println("Press (3) to remove an item.");
			System.out.println("Press (4) to find an item.");
			System.out.print("Press (5) to display all items.\n");
			
			if( mgrInput.hasNextInt() ) {
				mgrOption = mgrInput.nextInt();
				startInterface(mgrOption);
			} else {
				System.out.println("Enter one number only");
			}
			
		}	while (mgrOption > 6);
		
		mgrInput.close();
	}
}

