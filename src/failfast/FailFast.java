package interview;

import java.util.*;
import java.util.Map.Entry;

import static java.lang.System.out;

public class FailFast {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("1","Santosh");
        map.put("2","Kranthi");
        map.put("3","Saritha");
        out.println(map);
        Iterator iterator = map.entrySet().iterator();
       while(iterator.hasNext()) {
           Entry ele = (Entry) iterator.next();
           out.println(ele.getKey());
           out.println(ele.getValue());
       }


    }
}
