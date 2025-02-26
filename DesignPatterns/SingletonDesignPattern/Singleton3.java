package LowLevelDesign.DesignPatterns.SingletonDesignPattern;
//Making use of synchronized to make method thread safe
// Thread Synchronized Java implementation of
// singleton design pattern
public class Singleton3 {
    private static Singleton3 obj = null;
    // private constructor to force use of
    // getInstance() to create Singleton object
    private Singleton3(){

    }
    // Only one thread can execute this at a time
    public static synchronized Singleton3 getInstance(){
        if(null == obj){
            obj = new Singleton3();
        }
        return obj;
    }
}
