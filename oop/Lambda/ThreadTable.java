package com.soumik.oop.Lambda;

/* here we implement inbuilt functional interface
    Example : Runnable
 */

public class ThreadTable {

    public static void main(String[] args) {
        Runnable run = () ->{
            try{
                for (int i=1; i<11; i++){
                    System.out.println(i * 2);
                    Thread.sleep(2000);
                }


            } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        };

        Thread thread = new Thread(run);
        thread.run();
    }
}
