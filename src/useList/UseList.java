package useList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseList {

    public static void main(String[] args) {
        List list=new ArrayList<>();
        //List list1=new ArrayList<>(Arrays.asList("22",23));
        list.add(34);
        list.add("Meme");
        list.add("hero");
        list.add(95);
        list.add("Saitama");

        //System.out.println(list1);

        //what is the difference between list(List list) and arraylist(ArrayList arr)
        System.out.println(list);

    }
}
