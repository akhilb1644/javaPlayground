import java.util.Scanner;

/*
This is my source for filing seperately without any credits(income tax only), assuming there are prior deductions:
https://www.irs.gov/newsroom/irs-provides-tax-inflation-adjustments-for-tax-year-2023
*/

class incomeTax {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please tell us how much you have earned this year as an integer.");
      int income = keyboard.nextInt();
      income -= 13850;
      float taxIncome = (float)income;
      float incomeTaxValue = 0;
      while (taxIncome > 0) {
         float remainder;
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
            taxIncome = 0;
         } else {
            break;
         }
      }
      if (incomeTaxValue == 0) {
         System.out.println("You don't have to pay any income tax");
      } else {
         System.out.printf("You have to pay an income tax of $%.2f %n",incomeTaxValue);
      }
   }
}
