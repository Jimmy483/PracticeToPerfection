package useList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>(Arrays.asList("Kepa Arrizabalaga","Andreas Christensen","Eden Hazard"));
        arr.add("Antonio Rudiger");
        arr.add("Davide Zappacosta");
        arr.add(2,"Gonzalo Higuain");
        arr.add("Emerson");
        System.out.println(arr);
        System.out.println(arr.get(5) + " left on loan who is at position ");
        arr.remove(5);
        System.out.println(arr);
        //clears the array
        //arr.clear();
        //copies array to an object
        //Object a=arr.clone();
        System.out.println(arr);

    }
}
