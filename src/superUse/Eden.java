package superUse;

public class Eden {
    int age;
    String name;

    Eden(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println(name + " is " + age + " years young");
    }
}

class Hazard extends Eden{
    int age;
    String name;

    Hazard(int age,String name){
        super(20,"Eden");
        this.age=age;
        this.name=name;
        System.out.println(name + " is " + age + " years old");
    }

    public void message(){
        System.out.println("Completed");
    }
}
