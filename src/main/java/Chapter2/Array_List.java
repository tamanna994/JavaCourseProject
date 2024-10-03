package Chapter2;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

    public static void main (String[] args) {



        ArrayList <String> names = new ArrayList <String>();



        System.out.println(" size :" +names.size());

        names.add("tanvir");
        names.add("akash");
        names.add("batash");
        System.out.println(" size :" +names.size());
        System.out.println(names);


        System.out.println(names.get(1));



        names.remove(1);
        System.out.println(names);

        names.clear();
        System.out.println(names);

    }

}
