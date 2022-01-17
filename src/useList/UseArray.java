package useList;

public class UseArray {

    public static void main(String[] args) {
        String[] arr=new String[6];
        Integer[] arrSecond={1,3,5,1,6};

        int firstLength=arr.length;
        int secondLength=arrSecond.length;

        if(firstLength==secondLength){
            System.out.println("The two arrays are of the same size");
        }else {
            System.out.println("mismatch");
        }

    }
}
