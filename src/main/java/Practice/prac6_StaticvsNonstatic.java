package Practice;

public class prac6_StaticvsNonstatic {

    int a = 10;
    static int b = 20;
    static int c = 30;


    /*
     * static = static allow
     * Static = non static allow krte object create krte hobe
     */
    public static void sum () {
        prac6_StaticvsNonstatic obj = new prac6_StaticvsNonstatic();
        int result = obj. a+b;
        System.out.println ( "result");
    }



    //Non-static = non static + static
    public void div() {
        int result = b/a;
        System.out.println ( "result");
    }
}
