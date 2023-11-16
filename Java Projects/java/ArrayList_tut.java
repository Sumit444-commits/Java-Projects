import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayList_tut {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Abc");
        list.add("def");
        list.add("gel");
        list.add(1,"alpha");
        // System.out.println(list);
        // list.remove(0);
        // System.out.println(list);
        
        list.set(0, "xyz");

        // System.out.println(list);
       
        // System.out.println( list.get(1));
        // list.clear();
        System.out.println(list);

        for (String elem : list) {
            System.out.println(elem);
        }
            
        // Iterator  itr =new list.iterator();
        // while(itr.hasNext()){
        //     System.out.println(itr.next());

        // }

        // list.forEach(a->{System.out.println(a);});

    }
}
