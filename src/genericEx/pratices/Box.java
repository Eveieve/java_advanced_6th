package genericEx.pratices;
//1.어떤 타입의 객체든 저장할 수 있는 제너릭 클래스 Box. 객체를 설정하고 가져오는 메소드를 구현하세요
//2. Box 클래스를 확장하여 값이 특정 타입인지 확인 메서드 추가
public class Box<T> {
    private  T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public boolean isOfType(Class<?> clazz){
         return clazz.isInstance(value);
    }

}
