import java.util.Scanner;
import java.util.Random;

public class Random{
    public static void main(String[] args){
        //Scanner objecct
        Scanner scanner = new Scanner(System.in);

        //Random object to generate random number
        Random random = new Random();

        // random number
        int randomNum = random.nextInt(150);
        
        System.out.println("Wilkommen zu dem Guessing Game");
        System.out.println("Bitte eine natuerliche Zahl kleiner 150 eingeben");


        //input number
        int guess = 0;

        while(guess != randomNum){
            System.out.print("Bitte eine Zahl eingeben");
            guess = scanner.nextInt();

            if(guess <= 0 || guess >= 150){
                System.out.println("Nur natuerliche zahlen kleiner 150 erlaubt!!! ");
            }
            if(guess < randomNum){
                System.out.println("Zu klein");
            } else if(guess > randomNum){
                System.out.println("Zu gross");
            } else {
                System.out.println("Richtig!!!");
            }
        }

        scanner.close();
    }
}
