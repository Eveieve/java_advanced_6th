package lambda;

public class LambdaEx01 {
    public static void main(String[] args) {

        action((x,y) -> {
               int result = x + y;
            System.out.println("result1 ="+  result);
                                });


        action((x,y) -> {
            int result = x - y;
            System.out.println("result1 ="+  result);
        });


    }

    public static void action(Calculable calculable){
            int x = 10;
            int y = 20;
            calculable.calculate(x,y);
    }


}
