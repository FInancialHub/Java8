package Collection;

import java.util.ArrayList;
import java.util.List;

class Test {
    public static void main(String arg[]) {
        List<String> l = new ArrayList<String>();
        l.add("C");
        //l.add(10);
        m1(l);
        System.out.println(l);
    }
 
    public static void m1(List l) {
        l.add(10);
        l.add("");
        l.add(45461456.1231684);
        l.add(10);
        l.add(45461456.1231684);
    }
}