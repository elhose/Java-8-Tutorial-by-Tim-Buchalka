public class Car extends Vehicle {


    private int power;
    private int baggageCapacity;
    private int peopleCapacity;

    public Car( int topSpeed, int power, int baggageCapacity, int peopleCapacity) {
        super(4, topSpeed);
        this.power = power;
        this.baggageCapacity = baggageCapacity;
        this.peopleCapacity = peopleCapacity;
    }
}
