import java.util.*;

import static java.lang.System.out;

/**
 * Created by santosh on 1/29/2017.
 */
public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> stringList = new TreeSet(Arrays.asList(new String[]{"Ruthvik","Santosh","Nihanth","Nihanth"}));

//        addDuplicates(stringList);
//        iterateSet(stringList);
//        copySet(stringList);
        out.println(stringList);
         out.println(stringList.pollFirst());
        out.println(stringList);
         out.println(stringList.pollLast());
        out.println(stringList);
         out.println(stringList.first());
         out.println(stringList.last());

    }

    private static void copySet(Set<String> stringList) {

    }

    private static void addDuplicates(Set<String> stringList) {
        out.println(stringList.add("Sravanthi"));
        out.println(stringList.add("Santosh"));
        out.println(stringList.add(""));
        out.println(stringList.add(null));
    }

    public static void iterateSet(Set<String> stringList){
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
