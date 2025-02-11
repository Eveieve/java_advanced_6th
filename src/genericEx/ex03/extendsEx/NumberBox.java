package genericEx.ex03.extendsEx;

import java.util.List;

//Number 타입만 지원하는 제너릭클래스
//Number를 확장하는 클래스만 NumberBox의 타입매개변수로 사용할 수 있다.
public class NumberBox<T extends Number> {
    private T number;

    public void setNumber(T number) {
        this.number = number;
    }
    public double doubleValue(){
        return number.doubleValue();
    }

    public void printNumberList(List<? extends Number> list){
       for(Number number : list){
           System.out.println(number);
       }

        }
    }
}
