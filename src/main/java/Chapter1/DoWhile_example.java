package Chapter1;

import java.util.Scanner;

public class DoWhile_example {

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        boolean again;

        do{
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            double num2 = scanner.nextInt();

            double sum = num1+num2;

            System.out.println("The sum is "+ sum);

            System.out.println("Would like to start again? ");
            again = scanner.nextBoolean();
        }
        while(again);
    }
}
