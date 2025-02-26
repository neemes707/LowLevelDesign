package LowLevelDesign.DesignPatterns.SingletonDesignPattern;
// Double-Checked Locking based Java implementation of
// singleton design pattern
public class Singleton4 {
    private static Singleton4 obj = null;
    private Singleton4(){

    }
    // To make thread safe
    public Singleton4 getInstance(){
        if(null == obj){
            // check again as multiple threads
            // can reach above step
            synchronized (Singleton4.class){
                if(null == obj){
                    obj = new Singleton4();
                }
            }
        }
        return obj;
    }
}
