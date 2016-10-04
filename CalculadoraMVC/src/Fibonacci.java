/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brayan
 */
public class Fibonacci {
         public double num1;
     
     public Fibonacci(){}
     
     public Fibonacci(double numero1){
         this.num1=numero1;
     
         }
     public static double fibonacciN(double n){
     
      if(n==1 || n==2) {
        return 1;
        }else{
        return fibonacciN(n-1)+fibonacciN(n-2);
       }
        }
     
     
    public Double obtenerFibonacci(){
    return this.num1;
    }
}
