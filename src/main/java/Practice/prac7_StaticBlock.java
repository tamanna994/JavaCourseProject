package Practice;

public class prac7_StaticBlock {

    public static void sum (int x, int y ) {
        System.out.println ( "Summation :"+(x+y));

    }

    public static void main(String[] args) {
        System.out.println ( "first......");
        sum (20,50);
    }
    static {

        System.out.println ( "last......");
    }


}
