package LowLevelDesign.DesignPatterns.SingletonDesignPattern;
/*TODO - a singleton class is a one whose only one object can be created
*  There are different ways to achieve this
*   First of all we have to make the constructor as private so no one can create object from outside
*  1. Eager creation of object
*  2. Lazy creation of object
*  3. Using synchronized so that multiple thread can not duplicate object creation
*  4. Double checked locking (Most widely used)
*  */
//Eager loading example
public class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private Singleton1(){
        //constructor is made private
    }

    // every time we need an instance of this class we will call this method
    public static Singleton1 getInstance() {
        return instance;
    }
}
