package Chapter2;

public class Array_examples {

    public static void main(String[] args) {

//DataType[] name ={value.........}

        String[] names = {"tanvir","rakib","sagor","akash","rahul"};
        int[] numbers = {10,20,30,40,50,60,70,80,90};

        System.out.println("Array size of Names:" +names.length);
        System.out.println("Array size of Numbers:" +numbers.length);

        System.out.println(names[1]);
        System.out.println(numbers[7]);


        for (int i=0; i<names.length; i++)
        {
            System.out.println(names[i]);
        }

        for (int j=0; j<numbers.length; j++)
        {
            System.out.println(numbers[j]);
        }
    }


}
