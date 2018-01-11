
/**
 * Write a description of class CarDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDriver
{
    // instance variables - replace the example below with your own
    public static void main() {
    Car myCar = new Car("Dodge", 2016);
    System.out.println(myCar);
    
    Car yourCar = new Car("Ford", 2010);
    
    System.out.println(myCar.equals(yourCar));
}
}
