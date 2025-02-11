package genericEx.pratices;

public class BoxMain {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(123);
        System.out.println(integerBox.getValue());
        System.out.println(integerBox.isOfType(Integer.class));

        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics");
        System.out.println(stringBox.getValue());
        System.out.println(stringBox.isOfType(String.class));
    }
}
