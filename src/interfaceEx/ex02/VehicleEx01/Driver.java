package interfaceEx.ex02.VehicleEx01;

public class Driver {
    //메소드 선언부에서 매개변수 클래스타입의 매개변수

    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Taxi || vehicle instanceof Bus) {
            vehicle.run();
        } else {
            System.out.println("운영자격이 해당하지 않습니다.");
        }
    }
}
