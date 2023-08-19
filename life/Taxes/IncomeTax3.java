/*
Sources: 
   https://www.irs.gov/newsroom/irs-provides-tax-inflation-adjustments-for-tax-year-2023
   https://taxfoundation.org/data/all/state/state-income-tax-rates-2023/
   
   (this doesn't include capital gains tax by the way)
*/

import java.util.Scanner;

class IncomeTax3 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Hello! What is your name? ");
      String name = keyboard.nextLine();
      System.out.print("Please state your gross income: ");
      int grossIncome = keyboard.nextInt();
      System.out.print("Please state the cumulative value of the untaxed deductions: ");
      int deductions = keyboard.nextInt();
      int taxIncome = calculateTaxableIncome(deductions,grossIncome,13850);
      float taxValue = incomeTaxCalc((float)taxIncome);
      System.out.println(name + ",");
      System.out.printf("\tYou must pay $%,.2f in income tax to the federal government.\n", taxValue);
      int stateNum;
      float stateTaxValue = 0;
      String[] states = {"Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine",
                        "Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota",
                        "Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
      
      do {
         System.out.println("Which of the following states do you live in(Choose with number)?"); // We will just be assuming you live in one of the 50 states and not an unincorporated territory.
         for (int i=0;i<50;i++) {
            int j = i + 1;
            System.out.println("\t" + j + ". " + states[i]);
         }
         stateNum = keyboard.nextInt();
         if (stateNum < 1 || stateNum > 50) {
            System.out.println("PLEASE PICK A VALID NUMBER FROM 1-50.");
         } else {
            stateTaxValue += calculateStateIncomeTax(deductions,grossIncome,stateNum,states[stateNum - 1]);
            break;
         }
      } while (stateNum < 1 || stateNum > 50);
      
      System.out.printf("\n\tYou must pay $%,.2f in income tax to the federal government.\n", taxValue);
      taxValue += stateTaxValue;
      System.out.printf("\tYou must pay $%,.2f in total income tax total.\n", taxValue);
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
         } else {
            incomeTaxValue += taxIncome * 0.1;
            taxIncome = 0;
         }
      }
      
      return incomeTaxValue;
   }
   
   public static int calculateTaxableIncome (int deduction, int salary, int standardDeduction) {
      if (deduction < standardDeduction) {
         return salary - standardDeduction;
      } else {
         if (deduction > salary) {
            return 0;
         } else {
            return salary - deduction;
         }
      }
   }
   
   public static float calculateStateIncomeTax (int deductions, int salary, int stateNum, String state) {
      float taxIncome;
      float remainder; 
      float taxValue = 0;
      boolean incomeTax = true;
      switch (stateNum) {
         case 1: // Alabama
            taxIncome = calculateTaxableIncome(deductions, salary, 3000);
            while (taxIncome > 0) {
               if (taxIncome > 3000) {
                  remainder = taxIncome - 3000;
                  taxValue += remainder * 0.05;
                  taxIncome = 3000;
               } else if (taxIncome > 500) {
                  remainder = taxIncome - 500;
                  taxValue += remainder * 0.04;
                  taxIncome = 500;
               } else {
                  taxValue += taxIncome * 0.02;
                  taxIncome = 0;
               }
            }
            break;
            
         case 3: // Arizona
            taxIncome = calculateTaxableIncome(deductions, salary, 13850);
            taxValue += taxIncome * 0.025;
            break;
            
         case 4: // Arkansas
            taxIncome = calculateTaxableIncome(deductions, salary, 2270);
            while (taxIncome > 0) {
               if (taxIncome > 8500) {
                  remainder = taxIncome - 8500;
                  taxValue += remainder * 0.049;
                  taxIncome = 8500;
               } else if (taxIncome > 4300) {
                  remainder = taxIncome - 4300;
                  taxValue += remainder * 0.04;
                  taxIncome = 4300;
               } else {
                  taxValue += taxIncome * 0.02;
                  taxIncome = 0;
               }
            }
            break;
            
         case 5: // california
            taxIncome = calculateTaxableIncome(deductions, salary, 5202);
            while (taxIncome > 0) {
               if (taxIncome > 1000000) {
                  remainder = taxIncome - 1000000;
                  taxValue += remainder * 0.133;
                  taxIncome = 1000000;
               } else if (taxIncome > 677275) {
                  remainder = taxIncome - 677275;
                  taxValue += remainder * 0.123;
                  taxIncome = 677275;
               } else if (taxIncome > 406364) {
                  remainder = taxIncome - 406364;
                  taxValue += remainder * 0.113;
                  taxIncome = 406364;
               } else if (taxIncome > 388639) {
                  remainder = taxIncome - 388639;
                  taxValue += remainder * 0.103;
                  taxIncome = 388639;
               } else if (taxIncome > 66295) {
                  remainder = taxIncome - 66295;
                  taxValue += remainder * 0.093;
                  taxIncome = 66295;
               } else if (taxIncome > 52455) {
                  remainder = taxIncome - 52455;
                  taxValue += remainder * 0.08;
                  taxIncome = 52455;
               } else if (taxIncome > 37788) {
                  remainder = taxIncome - 37788;
                  taxValue += remainder * 0.06;
                  taxIncome = 37788;
               } else if (taxIncome > 23942) {
                  remainder = taxIncome - 23942;
                  taxValue += remainder * 0.04;
                  taxIncome = 23942;
               } else if (taxIncome > 10099) {
                  remainder = taxIncome - 10099;
                  taxValue += remainder * 0.02;
                  taxIncome = 10099;
               } else {
                  taxValue += taxIncome * 0.01;
                  taxIncome = 0;
               }
            }
            break;
            
         case 6: // Colorado
            taxIncome = calculateTaxableIncome(deductions, salary, 13850);
            taxValue += taxIncome * 0.04;
            break;
            
         case 7: // Connecticut
            taxIncome = salary;
            while (taxIncome > 0) {
               if (taxIncome > 500000) {
                  remainder = taxIncome - 500000;
                  taxValue += remainder * 0.0699;
                  taxIncome = 500000;
               } else if (taxIncome > 250000) {
                  remainder = taxIncome - 250000;
                  taxValue += remainder * 0.069;
                  taxIncome = 250000;
               } else if (taxIncome > 200000) {
                  remainder = taxIncome - 200000;
                  taxValue += remainder * 0.065;
                  taxIncome = 200000;
               } else if (taxIncome > 100000) {
                  remainder = taxIncome - 100000;
                  taxValue += remainder * 0.06;
                  taxIncome = 100000;
               } else if (taxIncome > 50000) {
                  remainder = taxIncome - 50000;
                  taxValue += remainder * 0.055;
                  taxIncome = 50000;
               } else if (taxIncome > 10000) {
                  remainder = taxIncome - 10000;
                  taxValue += remainder * 0.05;
                  taxIncome = 10000;
               } else{
                  taxValue += taxIncome * 0.03;
                  taxIncome = 0;
               }
            }
            break;
            
         case 8: // Delaware
            taxIncome = calculateTaxableIncome(deductions, salary, 3250);
            while (taxIncome < 0) {
               if (taxIncome > 60000) {
                  remainder = taxIncome - 60000;
                  taxValue += remainder * 0.066;
                  taxIncome = 60000;
               } else if (taxIncome > 25000) {
                  remainder = taxIncome - 25000;
                  taxValue += remainder * 0.0555;
                  taxIncome = 25000;
               } else if (taxIncome > 20000) {
                  remainder = taxIncome - 20000;
                  taxValue += remainder * 0.052;
                  taxIncome = 20000;
               } else if (taxIncome > 10000) {
                  remainder = taxIncome - 10000;
                  taxValue += remainder * 0.048;
                  taxIncome = 10000;
               } else if (taxIncome > 5000) {
                  remainder = taxIncome - 5000;
                  taxValue += remainder * 0.039;
                  taxIncome = 5000;
               } else if (taxIncome > 2000) {
                  remainder = taxIncome - 2000;
                  taxValue += remainder * 0.022;
                  taxIncome = 2000;
               } else {
                  taxIncome = 0;
               }
            }
            break;
            
         case 10: // Georgia
            taxIncome = calculateTaxableIncome(deductions, salary, 5400);
            while (taxIncome > 0) {
               if (taxIncome > 7000) {
                  remainder = taxIncome - 7000;
                  taxValue += remainder * 0.0575;
                  taxIncome = 7000;
               } else if (taxIncome > 5250) {
                  remainder = taxIncome - 5250;
                  taxValue += remainder * 0.05;
                  taxIncome = 5250;
               } else if (taxIncome > 3750) {
                  remainder = taxIncome - 3750;
                  taxValue += remainder * 0.04;
                  taxIncome = 3750;
               } else if (taxIncome > 2250) {
                  remainder = taxIncome - 2250;
                  taxValue += remainder * 0.03;
                  taxIncome = 2250;
               } else if (taxIncome > 750) {
                  remainder = taxIncome - 750;
                  taxValue += remainder * 0.02;
                  taxIncome = 750;
               } else {
                  taxValue += taxIncome * 0.01;
                  taxIncome = 0;
               }
            }
            break;
            
         case 11: // Hawaii
            taxIncome = calculateTaxableIncome(deductions, salary, 2200);
            while (taxIncome > 0) {
               if (taxIncome > 200000) {
                  remainder = taxIncome - 200000;
                  taxValue += remainder * 0.11;
                  taxIncome = 200000;
               } else if (taxIncome > 175000) {
                  remainder = taxIncome - 175000;
                  taxValue += remainder * 0.1;
                  taxIncome = 175000;
               } else if (taxIncome > 150000) {
                  remainder = taxIncome - 150000;
                  taxValue += remainder * 0.09;
                  taxIncome = 150000;
               } else if (taxIncome > 48000) {
                  remainder = taxIncome - 48000;
                  taxValue += remainder * 0.0825;
                  taxIncome = 48000;
               } else if (taxIncome > 36000) {
                  remainder = taxIncome - 36000;
                  taxValue += remainder * 0.079;
                  taxIncome = 36000;
               } else if (taxIncome > 24000) {
                  remainder = taxIncome - 24000;
                  taxValue += remainder * 0.076;
                  taxIncome = 24000;
               } else if (taxIncome > 19200) {
                  remainder = taxIncome - 19200;
                  taxValue += remainder * 0.072;
                  taxIncome = 19200;
               } else if (taxIncome > 14400) {
                  remainder = taxIncome - 14400;
                  taxValue += remainder * 0.068;
                  taxIncome = 14400;
               } else if (taxIncome > 9600) {
                  remainder = taxIncome - 9600;
                  taxValue += remainder * 0.064;
                  taxIncome = 9600;
               } else if (taxIncome > 4800) {
                  remainder = taxIncome - 4800;
                  taxValue += remainder * 0.055;
                  taxIncome = 4800;
               } else if (taxIncome > 2400) {
                  remainder = taxIncome - 2400;
                  taxValue += remainder * 0.032;
                  taxIncome = 2400;
               } else {
                  taxValue += taxIncome * 0.014;
                  taxIncome = 0;
               }
            }
            break;
         
         case 12: // Idaho
            taxIncome = calculateTaxableIncome(deductions, salary, 13850);
            taxValue += taxIncome * 0.058;
            break;
            
         case 13: // Illinois
            taxIncome = salary;
            taxValue += taxIncome * 0.0495;
            break;
            
         case 14: // Indiana
            taxIncome = salary;
            taxValue += taxIncome * 0.0315;
            break;
            
         case 15: // Iowa
            taxIncome = salary;
            while (taxIncome > 0) {
               if (taxIncome > 75000) {
                  remainder = taxIncome - 75000;
                  taxValue += remainder * 0.06;
                  taxIncome = 75000;
               } else if (taxIncome > 30000) {
                  remainder = taxIncome - 30000;
                  taxValue += remainder * 0.057;
                  taxIncome = 30000;
               } else if (taxIncome > 6000) {
                  remainder = taxIncome - 6000;
                  taxValue += remainder * 0.0482;
                  taxIncome = 6000;
               } else {
                  taxValue += taxIncome * 0.044;
                  taxIncome = 0;
               }
            }
            break;
            
         case 16: // Kansas
            taxIncome = calculateTaxableIncome(deductions, salary, 3500);
            while (taxIncome > 0) {
               if (taxIncome > 30000) {
                  remainder = taxIncome - 30000;
                  taxValue += remainder * 0.057;
                  taxIncome = 30000;
               } else if (taxIncome > 15000) {
                  remainder = taxIncome - 15000;
                  taxValue += remainder * 0.0525;
                  taxIncome = 15000;
               } else {
                  taxValue += taxIncome * 0.031;
                  taxIncome = 0;
               }
            }
            break;
            
         case 17: // Kentucky
            taxIncome = calculateTaxableIncome(deductions, salary, 2770);
            taxValue += taxIncome * 0.045;
            break;
            
         case 18: // Louisiana
            taxIncome = salary;
            while (taxIncome > 0) {
               if (taxIncome > 50000) {
                  remainder = taxIncome - 50000;
                  taxValue += remainder * 0.0425;
                  taxIncome = 50000;
               } else if (taxIncome > 12500) {
                  remainder = taxIncome - 12000;
                  taxValue += remainder * 0.035;
                  taxIncome = 12500;
               } else {
                  taxValue += taxIncome * 0.0185;
                  taxIncome = 0;
               }
            }
            break;
         
         case 19: // Maine
            taxIncome = calculateTaxableIncome(deductions, salary, 13850);
            while (taxIncome > 0) {
               if (taxIncome > 58050) {
                  remainder = taxIncome - 58050;
                  taxValue += remainder * 0.0715;
                  taxIncome = 58050;
               } else if (taxIncome > 24500) {
                  remainder = taxIncome - 24500;
                  taxValue += remainder * 0.0675;
                  taxIncome = 24500;
               } else {
                  taxValue +=  taxIncome * 0.058;
                  taxIncome = 0;
               }
            }
            break;
         
         case 20: // Maryland
            taxIncome = calculateTaxableIncome(deductions, salary, 2400);
            while (taxIncome > 0) {
               if (taxIncome > 250000) {
                  remainder = taxIncome - 250000;
                  taxValue += remainder * 0.0575;
                  taxIncome = 250000;
               } else if (taxIncome > 150000) {
                  remainder = taxIncome - 150000;
                  taxValue += remainder * 0.055;
                  taxIncome = 150000;
               } else if (taxIncome > 125000) {
                  remainder = taxIncome - 125000;
                  taxValue += remainder * 0.0525;
                  taxIncome = 125000;
               } else if (taxIncome > 100000) {
                  remainder = taxIncome - 100000;
                  taxValue += remainder * 0.05;
                  taxIncome = 100000;
               } else if (taxIncome > 3000) {
                  remainder = taxIncome - 3000;
                  taxValue += remainder * 0.0475;
                  taxIncome = 3000;
               } else if (taxIncome > 2000) {
                  remainder = taxIncome - 2000;
                  taxValue += remainder * 0.04;
                  taxIncome = 2000;
               } else if (taxIncome > 1000) {
                  remainder = taxIncome - 1000;
                  taxValue += remainder * 0.03;
                  taxIncome = 1000;
               } else {
                  taxValue += taxIncome * 0.02;
                  taxIncome = 0;
               }
            }
            break;
         
         case 21: // Massachusetts
            taxIncome = salary;
            while (taxIncome > 0) {
               if (taxIncome > 1000000) {
                  remainder = taxIncome - 1000000;
                  taxValue += remainder * 0.09;
                  taxIncome = 1000000;
               } else {
                  taxValue += taxIncome * 0.05;
                  taxIncome = 0;
               }
            }
            break;
         
         case 22: // Michigan
            taxIncome = salary;
            taxValue += taxIncome * 0.0425;
            break;
            
         case 23: // Minnesota
            taxIncome = calculateTaxableIncome(deductions, salary, 13825);
            while (taxIncome > 0) {
               if (taxIncome > 183340) {
                  remainder = taxIncome - 183340;
                  taxValue += remainder * 0.0985;
                  taxIncome = 183340;
               } else if (taxIncome > 98760) {
                  remainder = taxIncome - 98760;
                  taxValue += remainder * 0.0785;
                  taxIncome = 98760;
               } else if (taxIncome > 30070) {
                  remainder = taxIncome - 30070;
                  taxValue += remainder * 0.068;
                  taxIncome = 30070;
               } else {
                  taxValue += taxIncome * 0.0535;
                  taxIncome = 0;
               }
            }
            break;
            
         case 24: // Mississippi
            taxIncome = calculateTaxableIncome(deductions, salary, 2300);
            if (taxIncome > 10000) {
               taxValue += (taxIncome - 10000) * 0.05;
            }
            break;
         
         case 25: // Missouri
            taxIncome = calculateTaxableIncome(deductions, salary, 13850);
            while (taxIncome > 0) {
               if (taxIncome > 7847) {
                  remainder = taxIncome - 7847;
                  taxValue += remainder * 0.0495;
                  taxIncome = 7847;
               } else if (taxIncome > 6726) {
                  remainder = taxIncome - 6726;
                  taxValue += remainder * 0.045;
                  taxIncome = 6726;
               } else if (taxIncome > 5605) {
                  remainder = taxIncome - 5605;
                  taxValue += remainder * 0.04;
                  taxIncome = 5605;
               } else if (taxIncome > 4484) {
                  remainder = taxIncome - 4484;
                  taxValue += remainder * 0.035;
                  taxIncome = 4484;
               } else if (taxIncome > 3363) {
                  remainder = taxIncome - 3363;
                  taxValue += remainder * 0.03;
                  taxIncome = 3363;
               } else if (taxIncome > 2242) {
                  remainder = taxIncome - 2242;
                  taxValue += remainder * 0.025;
                  taxIncome = 2242;
               } else if (taxIncome > 1121) {
                  remainder = taxIncome - 1121;
                  taxValue += remainder * 0.02;
                  taxIncome = 1121;
               } else {
                  taxIncome = 0;
               }
            }
            break;
            
         case 26: // Montana
            taxIncome = calculateTaxableIncome(deductions, salary, 5540);
            while (taxIncome > 0) {
               if (taxIncome > 21600) {
                  remainder = taxIncome - 21600;
                  taxValue += remainder * 0.0675;
                  taxIncome = 21600;
               } else if (taxIncome > 16800) {
                  remainder = taxIncome - 16800;
                  taxValue += remainder * 0.06;
                  taxIncome = 16800;
               } else if (taxIncome > 13000) {
                  remainder = taxIncome - 13000;
                  taxValue += remainder * 0.05;
                  taxIncome = 13000;
               } else if (taxIncome > 9700) {
                  remainder = taxIncome - 9700;
                  taxValue += remainder * 0.04;
                  taxIncome = 9700;
               } else if (taxIncome > 6300) {
                  remainder = taxIncome - 6300;
                  taxValue += remainder * 0.03;
                  taxIncome = 6300;
               } else if (taxIncome > 3600) {
                  remainder = taxIncome - 3600;
                  taxValue += remainder * 0.02;
                  taxIncome = 3600;
               } else {
                  taxValue += taxIncome * 0.01;
                  taxIncome = 0;
               }
            }
            break;
            
         case 27: // Nebraska
            taxIncome = calculateTaxableIncome(deductions, salary, 7900);
            while (taxIncome > 0) {
               if (taxIncome > 35370) {
                  remainder = taxIncome - 35370;
                  taxValue += remainder * 0.0664;
                  taxIncome = 35370;
               } else if (taxIncome > 22170) {
                  remainder = taxIncome - 22170;
                  taxValue += remainder * 0.0501;
                  taxIncome = 22170;
               } else if (taxIncome > 3700) {
                  remainder = taxIncome - 3700;
                  taxValue += remainder * 0.0351;
                  taxIncome = 3700;
               } else {
                  taxValue += taxIncome * 0.0246;
                  taxIncome = 0;
               }
            }
            break;
         
         case 30: // New Jersey
            taxIncome = salary;
            while (taxIncome > 0) {
               if (taxIncome > 1000000) {
                  remainder = taxIncome - 1000000;
                  taxValue += remainder * 0.1075;
                  taxIncome = 1000000;
               } else if (taxIncome > 500000) {
                  remainder = taxIncome - 500000;
                  taxValue += remainder * 0.0897;
                  taxIncome = 500000;
               } else if (taxIncome > 75000) {
                  remainder = taxIncome - 75000;
                  taxValue += remainder * 0.0637;
                  taxIncome = 75000;
               } else if (taxIncome > 40000) {
                  remainder = taxIncome - 40000;
                  taxValue += remainder * 0.05525;
                  taxIncome = 40000;
               } else if (taxIncome > 35000) {
                  remainder = taxIncome - 35000;
                  taxValue += remainder * 0.035;
                  taxIncome = 35000;
               } else if (taxIncome > 20000) {
                  remainder = taxIncome - 20000;
                  taxValue += remainder * 0.0175;
                  taxIncome = 20000;
               } else {
                  taxValue += taxIncome * 0.014;
                  taxIncome = 0;
               }
            }
            break;
            
         case 31: // New Mexico
            taxIncome = calculateTaxableIncome(deductions, salary, 13850);
            while (taxIncome > 0) {
               if (taxIncome > 210000) {
                  remainder = taxIncome - 210000;
                  taxValue += remainder * 0.059;
                  taxIncome = 210000;
               } else if (taxIncome > 16000) {
                  remainder = taxIncome - 16000;
                  taxValue += remainder * 0.049;
                  taxIncome = 16000;
               } else if (taxIncome > 11000) {
                  remainder = taxIncome - 11000;
                  taxValue += remainder * 0.047;
                  taxIncome = 11000;
               } else if (taxIncome > 5500) {
                  remainder = taxIncome - 5500;
                  taxValue += remainder * 0.032;
                  taxIncome = 5500;
               } else {
                  taxValue += taxIncome * 0.017;
                  taxIncome = 0;
               }
            }
            break;
         
         case 32: // New York
            taxIncome = calculateTaxableIncome(deductions, salary, 8000);
            while (taxIncome > 0){
               if (taxIncome > 25000000) {
                  remainder = taxIncome - 25000000;
                  taxValue += remainder * 0.109;
                  taxIncome = 25000000;
               } else if (taxIncome > 5000000) {
                  remainder = taxIncome - 5000000;
                  taxValue += remainder * 0.103;
                  taxIncome = 5000000;
               } else if (taxIncome > 1077550) {
                  remainder = taxIncome - 1077550;
                  taxValue += remainder * 0.0965;
                  taxIncome = 1077550;
               } else if (taxIncome > 215000) {
                  remainder = taxIncome - 215000;
                  taxValue += remainder * 0.0685;
                  taxIncome = 215000;
               } else if (taxIncome > 80650) {
                  remainder = taxIncome - 80650;
                  taxValue += remainder * 0.06;
                  taxIncome = 80650;
               } else if (taxIncome > 13900) {
                  remainder = taxIncome - 13900;
                  taxValue += remainder * 0.055;
                  taxIncome = 13900;
               } else if (taxIncome > 11700) {
                  remainder = taxIncome - 11700;
                  taxValue += remainder * 0.0525;
                  taxIncome = 11700;
               } else if (taxIncome > 8500) {
                  remainder = taxIncome - 8500;
                  taxValue += remainder * 0.045;
                  taxIncome = 8500;
               } else {
                  taxValue += taxIncome * 0.04;
                  taxIncome = 0;
               }
            }
            break;
         
         case 33: // North Carolina
            taxIncome = calculateTaxableIncome(deductions, salary, 12750);
            taxValue += taxIncome * 0.0475;
            break;
            
         case 34: // North Dakota
            taxIncome = calculateTaxableIncome(deductions, salary, 13850);
            while (taxIncome > 0) {
               if (taxIncome > 458350) {
                  remainder = taxIncome - 458350;
                  taxValue += remainder * 0.029;
                  taxIncome = 458350;
               } else if (taxIncome > 210825) {
                  remainder = taxIncome - 210825;
                  taxValue += remainder * 0.0264;
                  taxIncome = 210825;
               } else if (taxIncome > 101050) {
                  remainder = taxIncome - 101050;
                  taxValue += remainder * 0.0227;
                  taxIncome = 101050;
               } else if (taxIncome > 41775) {
                  remainder = taxIncome - 41775;
                  taxValue += remainder * 0.0204;
                  taxIncome = 41775;
               } else {
                  taxValue += taxIncome * 0.011;
                  taxIncome = 0;
               }
            }
            break;
            
         case 35: // Ohio
            taxIncome = salary;
            while (taxIncome > 0) {
               if (taxIncome > 115300) {
                  remainder = taxIncome - 115300;
                  taxValue += remainder * 0.0399;
                  taxIncome = 115300;
               } else if (taxIncome > 92150) {
                  remainder = taxIncome - 92150;
                  taxValue += remainder * 0.03688;
                  taxIncome = 92150;
               } else if (taxIncome > 41600) {
                  remainder = taxIncome - 41600;
                  taxValue += remainder * 0.03266;
                  taxIncome = 41600;
               } else if (taxIncome > 26050) {
                  remainder = taxIncome - 26050;
                  taxValue += remainder * 0.02765;
                  taxIncome = 26050;
               } else {
                  taxIncome = 0;
               }
            }
            break;
            
         case 36: // Oklahoma
            taxIncome = calculateTaxableIncome(deductions, salary, 6350);
            while (taxIncome > 0) {
               if (taxIncome > 7200) {
                  remainder = taxIncome - 7200;
                  taxValue += remainder * 0.0475;
                  taxIncome = 7200;
               } else if (taxIncome > 4900) {
                  remainder = taxIncome - 4900;
                  taxValue += remainder * 0.0375;
                  taxIncome = 4900;
               } else if (taxIncome > 3750) {
                  remainder = taxIncome - 3750;
                  taxValue += remainder * 0.0275;
                  taxIncome = 3750;
               } else if (taxIncome > 2500) {
                  remainder = taxIncome - 2500;
                  taxValue += remainder * 0.0175;
                  taxIncome = 2500;
               } else if (taxIncome > 1000) {
                  remainder = taxIncome - 1000;
                  taxValue += remainder * 0.0075;
                  taxIncome = 1000;
               } else {
                  taxValue += taxIncome * 0.0025;
                  taxIncome = 0;
               }
            }
            break;
         
         case 37: // Oregon
            taxIncome = calculateTaxableIncome(deductions, salary, 2605);
            while (taxIncome > 0) {
               if (taxIncome > 125000) {
                  remainder = taxIncome - 125000;
                  taxValue += remainder * 0.099;
                  taxIncome = 125000;
               } else if (taxIncome > 10200) {
                  remainder = taxIncome - 10200;
                  taxValue += remainder * 0.0875;
                  taxIncome = 10200;
               } else if (taxIncome > 4050) {
                  remainder = taxIncome - 4050;
                  taxValue += remainder * 0.0675;
                  taxIncome = 4050;
               } else {
                  taxValue += taxIncome * 0.0475;
                  taxIncome = 0;
               }
            }
            break;
         
         case 38: // Pennsylvania
            taxIncome = salary;
            taxValue += taxIncome * 0.0307;
            break;
            
         case 39: // Rhode Island
            taxIncome = calculateTaxableIncome(deductions, salary, 10000);
            while (taxIncome > 0) {
               if (taxIncome > 155050) {
                  remainder = taxIncome - 155050;
                  taxValue += remainder * 0.0599;
                  taxIncome  = 155050;
               } else if (taxIncome > 68200) {
                  remainder = taxIncome - 68200;
                  taxValue += remainder * 0.0475;
                  taxIncome = 68200;
               } else {
                  taxValue += taxIncome * 0.0375;
                  taxIncome = 0;
               }
            }
            break;
         
         case 40: // South Carolina
            taxIncome = calculateTaxableIncome(deductions, salary, 13850);
            while (taxIncome > 0) {
               if (taxIncome > 16040) {
                  remainder = taxIncome - 16040;
                  taxValue += remainder * 0.065;
                  taxIncome = 16040;
               } else if (taxIncome > 3200) {
                  remainder = taxIncome - 3200;
                  taxValue += remainder * 0.03;
                  taxIncome = 3200;
               } else {
                  taxIncome = 0;
               }
            }
            break;
         
         case 44: // Utah
            taxIncome = salary;
            taxValue += (taxIncome * 0.0485) - 831; // Accounting for credit
            break;
            
         case 45: // Vermont
            taxIncome = calculateTaxableIncome(deductions, salary, 6500);
            while (taxIncome > 0) {
               if (taxIncome > 213150) {
                  remainder = taxIncome - 213150;
                  taxValue += remainder * 0.0875;
                  taxIncome = 213150;
               } else if (taxIncome > 102200) {
                  remainder = taxIncome - 102200;
                  taxValue += remainder * 0.076;
                  taxIncome = 102200;
               } else if (taxIncome > 42150) {
                  remainder = taxIncome - 42150;
                  taxValue += remainder * 0.066;
                  taxIncome = 42150;
               } else {
                  taxValue += taxIncome * 0.0335;
                  taxIncome = 0;
               }
            }
            break;
         
         case 46: // Virginia
            taxIncome = calculateTaxableIncome(deductions, salary, 8000);
            while (taxIncome > 0) {
               if (taxIncome > 17000) {
                  remainder = taxIncome - 17000;
                  taxValue += remainder * 0.0575;
                  taxIncome = 17000;
               } else if (taxIncome > 5000) {
                  remainder = taxIncome - 5000;
                  taxValue += remainder * 0.05;
                  taxIncome = 5000;
               } else if (taxIncome > 3000) {
                  remainder = taxIncome - 3000;
                  taxValue += remainder * 0.03;
                  taxIncome = 3000;
               } else {
                  taxValue += taxIncome * 0.02;
                  taxIncome = 0;
               }
            }
            break;
         
         case 48: // West Virginia
            taxIncome = salary;
            while (taxIncome > 0) {
               if (taxIncome > 60000) {
                  remainder = taxIncome - 60000;
                  taxValue += remainder * 0.065;
                  taxIncome = 60000;
               } else if (taxIncome > 40000) {
                  remainder = taxIncome - 40000;
                  taxValue += remainder * 0.06;
                  taxIncome = 40000;
               } else if (taxIncome > 25000) {
                  remainder = taxIncome - 25000;
                  taxValue += remainder * 0.045;
                  taxIncome = 25000;
               } else if (taxIncome > 10000) {
                  remainder = taxIncome - 10000;
                  taxValue += remainder * 0.04;
                  taxIncome = 10000;
               } else {
                  taxValue += taxIncome * 0.03;
                  taxIncome = 0;
               }
            }
            break;

         case 49: // Wisconsin
            taxIncome = calculateTaxableIncome(deductions, salary, 12760);
            while (taxIncome > 0) {
               if (taxIncome > 304170) {
                  remainder = taxIncome - 304170;
                  taxValue += remainder * 0.0765;
                  taxIncome = 304170;
               } else if (taxIncome > 27630) {
                  remainder = taxIncome - 27630;
                  taxValue += remainder * 0.053;
                  taxIncome = 27630;
               } else if (taxIncome > 13810) {
                  remainder = taxIncome - 13810;
                  taxValue += remainder * 0.0465;
                  taxIncome = 13810;
               } else {
                  taxValue += taxIncome * 0.0354;
                  taxIncome = 0;
               }
            }
            break;
         
         default:
            System.out.println("You don't have to pay any state income tax in your state: " + state + "!");
            // If you live in Alaska, Florida, Nevada, New Hampshire, South Dakota, Tennessee, Texas, Washington, or Wyoming, then life's good(paperwork wise, there is no income tax)
            incomeTax = false;
            break;
      }
      
      if (incomeTax == true) {
         System.out.println("You must pay the following amount to the state of " + state + ": ");
         System.out.printf("$%,.2f", taxValue);
      }
      
      return taxValue;
   }
}