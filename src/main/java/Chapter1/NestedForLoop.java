package Chapter1;

public class NestedForLoop {



    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println("\n");
        }
    }
}

