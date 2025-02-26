package LowLevelDesign.DesignPatterns.SingletonDesignPattern;
//Lazy loading of singleton design pattern
public class Singleton2 {
    private static Singleton2 obj = null;
    // private constructor to force use of
    // getInstance() to create Singleton object
    private Singleton2(){
        //constructor
    }
    public Singleton2 getInstance(){
        if(null == obj){
            obj = new Singleton2();
        }
        return obj;
    }
    //One major problem with this is that when two threads try to call getInstance ()
    //method t different instance will be created so this function is not thread safe
}
