package main.com.offer;

import com.sun.corba.se.impl.protocol.INSServerRequestDispatcher;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class Singleton {

}

/**
 * 静态属性饿汉式,线程安全
 */
class singleton1{
    private singleton1(){

    }
    private static final singleton1 instance = new singleton1();

    public static singleton1 getInstance(){
        return instance;
    }

}

    /**
     * 静态内部类,懒汉式,线程安全
     */
    class singleton2{
        private singleton2(){

        }
         static class Singleton2Holder{
            private static singleton2 instance = new singleton2();
         }
        public  singleton2 getInstance(){
            return Singleton2Holder.instance;
        }
    }

    /**
     * 两次判断,懒汉式,线程安全
     */
    class singleton3{
        private singleton3(){

        }

        private volatile singleton3 instance = null;

        public  singleton3 getInstance(){
            if(instance ==null ){
                synchronized (singleton3.class){
                    if(instance ==null ){
                        instance = new singleton3();
                    }
                }
            }
            return instance;
        }
    }














