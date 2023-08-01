package Reflection;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a new Car object
            Car car = new Car();

            // Get the Car's class object, which holds lots of information about the Car class
            Class<?> carClass = car.getClass();

            // Get a Method object that represents the 'drive' method
            Method driveMethod = carClass.getMethod("drive");

            // Call the 'drive' method on the car object
            driveMethod.invoke(car);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
