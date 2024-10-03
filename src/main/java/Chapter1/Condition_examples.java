package Chapter1;

import java.util.Scanner;

public class Condition_examples {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = input.nextInt();
        System.out.println("Enter second number : ");
        int b = input.nextInt();

        if (a>b) {
            System.out.println (a+ " is gratter than " +b);
        }
        else if (a==b) {
            System.out.println (a+ "is equal to" +b);
        }
        else if (a<b) {
            System.out.println (a+ "is less than " +b);
        }
        else  {
            System.out.println ("something went wrong...");
        }


    }
}
