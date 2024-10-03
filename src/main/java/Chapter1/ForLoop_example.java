package Chapter1;

import java.util.Scanner;

public class ForLoop_example {

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        //-----------Input--------------
        System.out.println("Enter a given number of you would like to scan: ");
        int quantity = scanner.nextInt();

        double total =0;

        for(int i = 0; i<quantity; i++){
            System.out.println("Enter csot: ");
            double price = scanner.nextDouble();

            total = total+price;
        }
        System.out.println("Total: "+total);
    }
}
