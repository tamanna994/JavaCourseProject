package Practice;

public class prac5_MethodExamples {

    public static void sum (int x, int y ) {
        System.out.println ( "Summation :"+(x+y));

    }

    //Non-Static
    public void div (int x, int y) {

        System.out.println ( "Division :"+(x/y));

    }


    public void fullName (String firstName, String lastName) {
        System.out.println("First Name is :" +firstName+" and Last Name is :" +lastName);

    }

    public static void main(String[] args) {


        prac5_MethodExamples obj = new prac5_MethodExamples();
        sum (10,20 );
        sum (30,40 );
        sum (50,60 );

        obj.div (50,10);
        obj.div(80, 2);
        obj.fullName("tamanna", "noshi");


    }
}
