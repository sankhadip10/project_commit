package examples;

class Vehicle {

    int seats;

    int speed;


    public Vehicle(int seats, int speed) {

        System.out.print("Vehicle ");

        this.seats = seats;

        this.speed = speed;

    }

}


class Car extends Vehicle {

    int id;

    Car() {
        super(34,20);

        System.out.print("Car ");

    }

}


class Main {

    public static void main(String args[]) {

        Car c = new Car();

    }

}