package useList;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {


    public static void main(String[] args) {
       java.util.LinkedList linkedList=new LinkedList();
       linkedList.add(3);
       linkedList.add(1);
       linkedList.add(8);
       linkedList.add(0);
       linkedList.add(1,56);
       linkedList.add(98);
       linkedList.add(67);

        System.out.println(linkedList);
        Iterator it= linkedList.iterator();
        while (it.hasNext()){
            if(it.next().equals(98)){
                System.out.println("the number 98 was found");
                return;
            }
        }
    }

}
