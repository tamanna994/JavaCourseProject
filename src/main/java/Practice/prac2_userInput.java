package Practice;

import java.util.Scanner;

public class prac2_userInput {

    public static void main(String[] args) {


        Scanner scan = new Scanner (System.in);

        System.out.println("Enter your name : ");
        String name = scan.nextLine();
        System.out.println( name);
        System.out.println("Your name is :" +name);


        System.out.println("Enter your number : ");
        int number = scan.nextInt();
        System.out.println( number);
        System.out.println("Number is : " +number);


        System.out.println("name: "+name+", Number :" +number);

    }
}
