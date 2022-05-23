public class Main {
    public static void main(String[] args) {
        IDeliveryFactory tf = new AirFactory();
        IDeliveryFactory bf = new SeaFactory();
        IDeliveryFactory rf = new RoadFactory();

        IDeliveryMethod train = tf.createTransport();
        IDeliveryMethod boat = bf.createTransport();
        IDeliveryMethod car = rf.createTransport();

        train.getInfo();
        boat.getInfo();
        car.getInfo();
    }
}
abstract class IDeliveryFactory{
    public abstract IDeliveryMethod createTransport();
}

class SeaFactory extends IDeliveryFactory{
    public Boat createTransport() {
        return new Boat();
    }
}
class RoadFactory extends IDeliveryFactory{
    public Car createTransport() {
        return new Car();
    }
}
class AirFactory extends IDeliveryFactory {
    public Airplane createTransport() {
        return new Airplane();
    }
}
abstract class IDeliveryMethod{
    public abstract void getInfo();
}
class Boat extends IDeliveryMethod{
    @Override
    public void getInfo() {
        System.out.println("Лодка");
    }
}
class Airplane extends IDeliveryMethod{
    @Override
    public void getInfo() {
        System.out.println("Самолет");
    }
}
class Car extends IDeliveryMethod{
    @Override
    public void getInfo() {
        System.out.println("Машина");
    }
}