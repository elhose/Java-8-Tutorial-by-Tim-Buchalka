class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;




    public Car(int cylinders,  int doors) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = doors;
    }


    public void startEngine(){
        System.out.println("Engine Started - superclass ");
    }

    public void accelerate(){
        System.out.println("accelerate - superclass");
    }

    public void brake(){
        System.out.println("brake - superclass");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getDoors() {
        return doors;
    }
}

class Honda extends Car{

    public Honda(int cylinders, int doors) {
        super(cylinders, doors);
    }

    @Override
    public void startEngine() {
        System.out.println("start engine - Honda");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate - honda");
    }

    @Override
    public void brake() {
        System.out.println("brake - honda");
    }
}

class Porsche extends Car{

    public Porsche(int cylinders, int doors) {
        super(cylinders, doors);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine start - Porsche");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate - porsche");
    }

    @Override
    public void brake() {
        System.out.println("brake - porsche");
    }
}

class Seat extends Car{

    public Seat(int cylinders, int doors) {
        super(cylinders, doors);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine start - seat");
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate - seat");
    }

    @Override
    public void brake() {
        System.out.println("brake - seat");
    }
}


public class Main {

    public static void main(String[] args) {



        Car car = new Car(23,12);

        car.accelerate();
        car.brake();
        car.startEngine();

        System.out.println();

        Honda honda = new Honda(2,5);
        Porsche porsche = new Porsche(4,3);
        Seat seat = new Seat(2,7);

        honda.brake();
        porsche.accelerate();
        seat.startEngine();





    }
}
