package objectex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collectionex {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(10);
        list.add(200);
        list.add(true);
        System.out.println(list.size());
        System.out.println(list.contains(200));
        System.out.println(list.isEmpty());
        System.out.println(list.indexOf(200));
        System.out.println("---------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("*********************************************");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}

