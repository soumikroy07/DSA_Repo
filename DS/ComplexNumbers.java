package com.soumik.DS;

import java.util.*;
public class ComplexNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        ComplexSolution c1 = new ComplexSolution(real1, imaginary1);
        ComplexSolution c2 = new ComplexSolution(real2, imaginary2);

        int choice = s.nextInt();

        if(choice == 1) {
            // Add
            c1.plus(c2);
            c1.print();
        }
        else if(choice == 2) {
            // Multiply
            c1.multiply(c2);
            c1.print();
        }
        else {
            return;
        }
    }

}

class ComplexSolution{
    int real,imaginary;
    ComplexSolution(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public  void plus(ComplexSolution c2){
        this.real=this.real+c2.real;
        this.imaginary=this.imaginary+c2.imaginary;
    }
    public  void print(){
        System.out.println(this.real+"+i"+this.imaginary);
    }
    public void multiply(ComplexSolution c2){

    }
}
