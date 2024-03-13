import java.text.NumberFormat;
import java.util.Locale;

import java.util.Scanner;

/**
 * mortgage
 */
public class mortgage {

    public static void main(String[] args) {
        final byte PERCENT= 100;
        final byte MONTHSI_IN_YEAR=12;
        long principlAmt = 0;
        float annualInterest = 0;
        int years=0;

         Scanner scanner= new Scanner(System.in);
        
while (true) {
    System.out.print("Enter the principal amount: ");
     principlAmt = scanner.nextLong();
    if(principlAmt >= 1000 && principlAmt<=1_000_000 )
    break; 
    System.out.println("Please enter a value between 1000 and 1000000");  
}
while (true) {
    System.out.print("Annual interest rate: ");
     annualInterest = scanner.nextFloat();  
    if (annualInterest >=1 && annualInterest<= 30)  
    break;
    
    System.out.println("Please enter a value between 1 and 30");  
} 
  while (true) {
    
    System.out.print("Years:");
     years = scanner.nextInt();
     if(years >= 1 && years <= 30)
break;
System.out.println("Please enter the years between 1 and 30");
  }     
           
     int totalMonths = years*MONTHSI_IN_YEAR;
        
        float rate = annualInterest/PERCENT;
        double mortgageAmt = principlAmt*(rate*(Math.pow(1+ rate,totalMonths))/((Math.pow(1+rate,totalMonths)-1)));
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
        
        System.out.println("Mortgage" + formatter.format(mortgageAmt));
                
            
            
   
     
      
   





    }
}