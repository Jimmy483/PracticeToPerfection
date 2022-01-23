package javaPassValue;

public class Value {

    public static void main(String[] args) {
        Cheese cheese=new Cheese();
        cheese.setCheeseValue(10);
        process(cheese);
        System.out.println(cheese.getCheeseValue());


    }
//The cheese object is a reference to the address therefore passing it(cheese from main method) to another Cheese class object
    //would still refer to the same location or address hence changing the value of all cheese object
    //Therefore, cheese=new Cheese() is used to allocate the cheese into another memory location. this will prevent overwriting the
    //initial reference
    public static void process(Cheese cheese){
        //System.out.println(cheese.getCheeseValue()+1);
        cheese=new Cheese();
        cheese.setCheeseValue(cheese.getCheeseValue()+1);
    }
}
