package interfaceEx.ex02.vchicleEx01;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        //매개값으로 구현 객체 대입함( 다형성 : 실행결과가 다르다)
        driver.drive(bus);   //자동타입 변환 -> 오버라이딩 메소드 호출
        driver.drive(taxi);  //자동타입 변환 -> 오버라이딩 메소드 호출


    }
}
