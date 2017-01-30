import java.util.*;

import static java.lang.System.out;

/**
 * Created by santosh on 1/29/2017.
 */
public class ArrayListEx {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList(new String[]{"Ruthvik","Santosh","Nihanth","Nihanth"});

            iterateList(stringList);
            // first type of iterating
        out.println("\n revers ");
        Collections.reverse(stringList);
        out.println(stringList);
        Set set = new TreeSet();
        set.addAll(stringList);




    }

    public static void iterateList(List<String> stringList){
        // first type of iterating
        out.println("first type of iteration");
        stringList.forEach(out::print);

        //second type of iterating
        out.println("\n Second type of iteration");
        for (String str:stringList){
            out.print(str+" ");
        }

        //third type
        out.println("\n thrid type of iteration");
        Iterator iterator = stringList.iterator();
        while(iterator.hasNext())
        {
            out.print(iterator.next()+" ");
        }

    }
}
