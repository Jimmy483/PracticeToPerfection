package enumm;

public class Levels {

    enum AllLevel{
        Stage1, Stage2, Stage3, Stage4;

        public void getStage(AllLevel lvl){
            System.out.println(lvl);
        }
    }

    public static void main(String[] args) {
        AllLevel level=AllLevel.Stage1;
        level.getStage(level);

        if(level==AllLevel.Stage1){
            System.out.println("This is stage 1");
        }else if(level==AllLevel.Stage2){
            System.out.println("This is stage 2");
        }else if(level==AllLevel.Stage3){
            System.out.println("This is stage 3");
        }else if(level==AllLevel.Stage4){
            System.out.println("This is stage 4");
        }

    }
}
