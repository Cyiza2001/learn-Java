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
         Scanner scanner= new Scanner(System.in);
        

        System.out.print("Enter the principal amount: ");
        long principlAmt = scanner.nextLong();
        System.out.print("Annual interest rate: ");
        float annualInterest = scanner.nextFloat();
        System.out.print("Years:");
        int years = scanner.nextInt();
        int totalMonths = years*MONTHSI_IN_YEAR;

float rate = annualInterest/PERCENT;
double mortgageAmt = principlAmt*(rate*(Math.pow(1+ rate,totalMonths))/((Math.pow(1+rate,totalMonths)-1)));

NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);

System.out.println("Mortgage" + formatter.format(mortgageAmt));
    }
}