package com.soumik.oop;

public class LamdaExpressionDemo implements Lamda{
    public static void main(String[] args) {

        Lamda sum = (a, b) -> a + b;
        Lamda mul = (a, b) -> a * b;
        Lamda sub = (a, b) -> a - b;

        LamdaExpressionDemo ld = new LamdaExpressionDemo();
        System.out.println(ld.operation(9,2,sum));
        System.out.println(ld.operation(9,2,mul));
        System.out.println(ld.operation(9,2,sub));
    }
    public int operation(int a,int b,Lamda op){
        return op.oprtation(a,b);
    }

    @Override
    public int oprtation(int a, int b) {
        return 0;
    }
}

interface Lamda{
    int oprtation(int a,int b);
}
