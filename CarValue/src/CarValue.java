/*
Author: Jennifer Vo
Course: COP 2210
Date: 06/03/2024
Assignment: Car Value assignment
Instructor: Sergio Pisano
Description: Getting car value.
*/

import java.util.Scanner;

public class CarValue {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); // creates object for class Scanner

      Car myCar = new Car(); // create a new Car object from Car class

      int userYear = scnr.nextInt(); // takes user input for userYear
      int userPrice = scnr.nextInt(); // takes user input for userYear
      int userCurrentYear = scnr.nextInt(); // takes user input for userCurrentYear

      // calling methods
      myCar.setModelYear(userYear);
      myCar.setPurchasePrice(userPrice);
      myCar.calcCurrentValue(userCurrentYear);

      myCar.printInfo(); // printing output
   }
}
/* CODE OUTPUT
Car's information:
  Model year: 2011
  Purchase price: $18000
  Current value: $5770
  
*/