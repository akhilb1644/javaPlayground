//Source: https://www.irs.gov/newsroom/irs-provides-tax-inflation-adjustments-for-tax-year-2023
import java.util.Scanner;

class IncomeTax2 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Hello! What is your name? ");
      String name = keyboard.nextLine();
      System.out.print("Please state your gross income: ");
      int grossIncome = keyboard.nextInt();
      System.out.print("Please state the cumulative value of the untaxed deductions: ");
      int deductions = keyboard.nextInt();
      int taxIncome = calculateTaxableIncome(deductions,grossIncome);
      float taxValue = incomeTaxCalc((float)taxIncome); // Good ol' type casting(so the method doesn't give an error for the wrong type)
      System.out.println(name + ",");
      System.out.printf("\tYou must pay $%,.2f in income tax to the federal government.", taxValue); // Rounding because you can't go past two decimal places because you can only pay at the lowest end, in cents.
   }
   
   public static float incomeTaxCalc(float taxIncome) {
      float remainder;
      float incomeTaxValue = 0;
      while (taxIncome > 0) {
         if (taxIncome > 231250) {
            remainder = taxIncome - 231250;
            incomeTaxValue += remainder * 0.35;
            taxIncome = 231250;
         } else if (taxIncome > 182100) {
            remainder = taxIncome - 182100;
            incomeTaxValue += remainder * 0.32;
            taxIncome = 182100;
         } else if (taxIncome > 95375) {
            remainder = taxIncome - 95375;
            incomeTaxValue += remainder * 0.24;
            taxIncome = 95375;
         } else if (taxIncome > 44725) {
            remainder = taxIncome - 44725;
            incomeTaxValue += remainder * 0.22;
            taxIncome = 44725;
         } else if (taxIncome > 11000) {
            remainder = taxIncome - 11000;
            incomeTaxValue += remainder * 0.12;
            taxIncome = 11000;
         } else { // Remainder isn't needed for this one because it is only for when the income tax bracket has a lower end above zero
            incomeTaxValue += taxIncome * 0.1;
            taxIncome = 0;
         }
      }
      
      return incomeTaxValue;
   }
   
   public static int calculateTaxableIncome (int deduction, int salary) {
      if (deduction < 13850) {
         return salary - 13850;
      } else {
         return salary - deduction;
      }
   }
}
