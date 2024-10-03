package Chapter1;

import java.util.Scanner;

public class GradeMessage {

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        //Input
        System.out.println("Enter your grade: ");
        String grade = scanner.next();

        String message;
        switch(grade){
            case "A":
                message ="Excellent !";
                break;
            case "B":
                message =" Good ";
                break;
            case "C":
                message =" Good ";
                break;
            case "D":
                message =" Work hard";
                break;
            case "F":
                message =" Sad!";
                break;
            default:
                message =" Invalid";
                break;
        }
        System.out.println(message);
    }
}
