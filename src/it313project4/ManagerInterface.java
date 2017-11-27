package it313project4;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerInterface {
	
	private void addMore(StockItem item){
		
		Scanner mgrInputAdd = new Scanner(System.in);
		String option;
		
		do {
			System.out.println("How much would you like to add?");
			System.out.print("Type (b) for previous menu: ");
			
			option = mgrInputAdd.nextLine();
			
			if ()
			
		} while (option != "b");
		mgrInputAdd.close();
		startInterface();
	}
	
	public void addStock () {
		
		Scanner mgrInputAdd = new Scanner(System.in);
		int option = 0;
		StockItem item = new StockItem();
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
				case 1 : option = 1; addMore(); break;
				case 2 : option = 2; break;
				case 3 : option = 3; break;
				case 4 : option = 4; break;
				case 5 : option = 5; break;
				case 6: option = 6; break;
				case 7: option = 7; break;
				case 8: option = 8; break;
				case 9: option = 9; break;
			}
		} while (option > 11);
			
			/*if( mgrInputCandy.hasNextInt() )
			{ } else {
			System.out.println("Enter 1 number only");
			this.newItem();
			}
			*/
		mgrInputAdd.close();
		startInterface();
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
			}
		} while (option > 11);
		
		mgrInputRemove.close();
		startInterface();
		
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
			}
		} while (option > 11);
		
		mgrInputFind.close();
		startInterface();
		
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
			}
		} while (option > 11);
		
		mgrInputDisplay.close();
		startInterface();
		
	}
	
	public void startInterface() {
		int mgrOption = 0;
		Scanner mgrInput = new Scanner(System.in);
		
		do {
			System.out.println("Duty free inventory");
			System.out.println("Press (1) to add quantity of an item.");
			System.out.println("Press (2) to remove an item.");
			System.out.println("Press (4) to find an item.");
			System.out.println("Press (5) to display all items.");
			System.out.print("Press (9) to quit.\n");
			
			if( mgrInput.hasNextInt() ) {
				mgrOption = mgrInput.nextInt();
				switch (mgrOption) {
					case 1: mgrOption = 2; addStock(); break;
					case 2: mgrOption = 3; removeStock(); break;
					case 3: mgrOption = 4; findStock(); break;
					case 4: mgrOption = 5;	displayStock(); break;
					case 5: mgrOption = 9; break;
				}
			} else {
				System.out.println("Enter one number only");
			}
			
		startInterface();
		
		} while (mgrOption > 6);

		mgrInput.close();
		
	}
	
	public void ManagerInterface() {
		startInterface();
	}
	
	public void ManagerInterface(ArrayList<StockItem> collection){
		ArrayList<StockItem> col = collection;
		startInterface();
		
		
	}
}

