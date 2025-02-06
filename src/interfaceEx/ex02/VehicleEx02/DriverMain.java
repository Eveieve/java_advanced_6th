package interfaceEx.ex02.VehicleEx02;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();
//인터페이스 매개변수를 갖는 메소드 ride 호출
        ride(taxi);
        System.out.println();
        ride(bus);
    }

    public static void ride(Vehicle vehicle) {
/*
      방법 1. Java12 이전
//        if(vehicle instanceof Bus){
//            Bus bus = (Bus)vehicle;
//            bus.checkFare();
//        }
*/

//    방법 2 . Java12 이후 개선 (자동변환 지원)
        if (vehicle instanceof Bus bus) bus.checkFare();
        vehicle.run();
    }

}
