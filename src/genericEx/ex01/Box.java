package genericEx.ex01;

public class Box<T> {  // T는 Box의 인스턴스를 생성할때 어떤 참조타입으로 대체될 수 있는 타입매개변수
    private T item;
    private int count = 0;   //item의 수를 추적하는 필드
    
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
        this.count++;
    }

    public int getCount() {
        return count;
    }
}
