package Chapter1;

import java.util.Scanner;

public class IfElse_statement {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st number: ");
        int value1 = input.nextInt();

        System.out.print("Enter your 2nd number: ");
        int value2 = input.nextInt();

        if (value1 > value2) {
            System.out.println(value1+" is gratter than "+value2);
        } else {
            System.out.println(value1+" is less than "+value2);
        }

    }

}
