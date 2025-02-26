package LowLevelDesign.DesignPatterns.SingletonDesignPattern;
// Double-Checked Locking based Java implementation of
// singleton design pattern
/*TODO we have use volatile keyword with the Singleton object in order to solve 2 issues
*  1. Reordering or CPU instructions while creating object which can lead to inconsistency
*  2. Error while caching (L1 caching) which can again lead to inconsistency
*   volatile properties ->
*   ->Volatile objects are always fetched from memory and not from the cache
*   -> suppose there are instructions 1,2,3 , volatile inst. , 4,5,6
*     so the reordering of ins. before and after volatile object ins. can happen
*     and also when volatile ins. is executed all previous instruction are pushed to memory
* */

public class Singleton4 {
    private static volatile Singleton4 obj = null;
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
