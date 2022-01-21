package outinnerClass;

public class Outside implements Man {

    @Override
    public void eat() {
        System.out.println("String food");
    }

    public class Inside{

        public void print(){
            System.out.println("I am happy");
        }
    }
}
interface Man{

    public void eat();
}




class Teach {
    public static void main(String[] args){
        Outside o=new Outside();
        Outside.Inside i=o.new Inside();
        i.print();


        System.out.println(o instanceof Man);
    }
}
