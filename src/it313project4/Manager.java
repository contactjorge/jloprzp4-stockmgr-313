package it313project4;

public class Manager extends InventoryManager{
	
	public void addCandyBar {
		CandyBarItem peanutMMS = new CandyBarItem("MMS Peanut", "MARS M&M's", 0.45, 12, true, true);
		CandyBarItem chocMMS = new CandyBarItem("MMS Chocolate", "MARS M&M's", 0.45, 12, false, true);
		CandyBarItem goobers = new CandyBarItem("Goobers", "Nestle' Goobers", 0.45, 12, true, true);
		CandyBarItem goodbar = new CandyBarItem("Mr. Goodbar", "Hershey's Mr. Goodbar", 0.45, 12, true, true);
		
	}
	
	public void addSodaWater {
		SodaWaterItem coke = new SodaWaterItem("Coke", "Flagship coca-cola product", 8, 0.80, true, true);
		
	}
	
	public void addCrisps {
		CrispsItem doritos = new CrispsItem("Doritos", "Frito Lay Cheesey Corn Crisps", 0.80, 24, false);
		
	}
	public Manager {
		
		
		addItem(goodbar, 1);
		addItem(doritos, 1);
		addItem(coke, 4);
		addItem(peanutMMS, 2);
		addItem(chocMMS, 2);
		
		getItembyID(coke);
		
		
		
		//removeItem(coke);
		
		System.out.println("Instantiate several");
		System.out.print("-------------------\n");
		System.out.println(peanutMMS);
		System.out.println(chocMMS);
		System.out.println(goobers);
		System.out.println(goodbar);
		System.out.println(doritos);
		System.out.println(coke);
		displayAll();
		
		System.out.println("\n\nHow many Goobers?");
		display(goobers);
	}

}
