package it313project4;

import java.util.Scanner;

public class Inventory extends InventoryManager{
	private CandyBarItem $candyBar;
	private CrispsItem $bagOCrisps;
	private SodaWaterItem $sodaWater;
	
	public CandyBarItem getCandyBar () {
		return $candyBar;
	}
	
	public void setCandyBar (CandyBarItem $candyBar) {
		this.$candyBar=$candyBar;
	}
	
	public CrispsItem getBagOCrisps () {
		return $bagOCrisps;
	}
	
	public void set$BagOCrisps (CrispsItem $bagOCrisps) {
		this.$bagOCrisps=$bagOCrisps;
	}
	
	public SodaWaterItem getSodaWater () {
		return $sodaWater;
	}
	
	public void setSodaWater (SodaWaterItem $sodaWater) {
		this.$sodaWater=$sodaWater;
	}
	
	public void newCandyBar () {
		String inputString= new String;
		Scanner userInput = new Scanner(inputString);
		System.out.println("Add a new Candy Bar to the inventory:");
		System.out.print("Brand Name: ");
		System.out.print("Description: ");
		System.out.print("Is this chocolate? (Yes or No)");
		System.out.print("Does this contain nuts? (Yes or No) ");
		System.out.print("Size Ounces: ");
		System.out.print("price: ");
		
		userInput.close();
	}
	
	public void newCrisps () {
	
	}
	
	public void newSodaWater () {
	
	}
	
	public Inventory () {
		CandyBarItem $candyBar;
		CrispsItem $bagOCrisps;
		SodaWaterItem $sodaWater;
	}
	
	public Inventory (CandyBarItem $candyBar, CrispsItem $bagOCrisps, SodaWaterItem $sodaWater)
	{
		this.$candyBar = $candyBar;
		this.$bagOCrisps = $bagOCrisps;
		this.$sodaWater = $sodaWater;
	}

}
