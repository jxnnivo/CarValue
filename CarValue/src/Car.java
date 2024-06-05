/*
Author: Jennifer Vo
Course: COP 2210
Date: 06/03/2024
Assignment: Car Value assignment
Instructor: Sergio Pisano
Description: Getting car value.
*/

public class Car {
   private int modelYear; // model year obtained
   private int purchasePrice; // purchase price obtained
   private int currentValue; // current value obtained

   // setting model year
   public void setModelYear(int userYear){
      modelYear = userYear;
   }
   // getting model year
   public int getModelYear() {
      return modelYear;
   }

   // setting purchase price
   public void setPurchasePrice (int userPrice) {
	   purchasePrice =  userPrice;
	}
   
   // getting purchase price
   public int getPurchasePrice () {
		return purchasePrice;
	}

   // calculating value of car
   public void calcCurrentValue(int currentYear) {
      double depreciationRate = 0.15;
      int carAge = currentYear - modelYear;

      // Car depreciation formula
      currentValue = (int) 
         Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
   }

   // define printInfo() method to output modelYear, purchasePrice, and currentValue
   	public void printInfo() {
   		System.out.println("Car's information:");
   		System.out.println("  Model year: " + modelYear);
   		System.out.println("  Purchase price: $" + purchasePrice);
   		System.out.println("  Current value: $" + currentValue);
   	}
}