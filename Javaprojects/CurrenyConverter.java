import java.util.Scanner;

public class CurrenyConverter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //enter 1st Currency
        System.out.print("Please enter currency to be converted: ");
        String curr1 = scanner.next().toUpperCase();
        if(curr1.length() != 3){
            System.out.println("Only 3 Letters long e.g. USD, UGX ...");
        }

        //enter Amount
        System.out.print("Please enter Amount to be converted: ");
        double amount = scanner.nextDouble();
        if(amount <= 0 ){
            System.out.println("Please enter a natural number");
        }

        //enter end currency
        System.out.print("Please enter currency to be converted to: ");
        String curr2 = scanner.next().toUpperCase();
        if(curr2.length() != 3){
            System.out.println("Only 3 Letters long e.g. USD, UGX ...");
        }

        //actual conversion(USD & UGX)
        double conversionRate = 0;

        if(curr1.equals("USD") ){
            conversionRate = 3600;
        } else if(curr1.equals("UGX") ){
            conversionRate = 0.036;
        } else {
            System.out.println("Invalid input!!!");
            return;
        }

        double converted = amount * conversionRate;

        System.out.println(" = " + curr2 + " " + converted);
    }
}
