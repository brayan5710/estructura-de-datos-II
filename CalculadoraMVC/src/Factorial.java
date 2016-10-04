/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brayan
 */
public class Factorial {
    public double num1;
    public double resultado;
    public Factorial(){}
    
    public Factorial(double numero1){
        this.num1=numero1;
         
     }

     public static double factorialDenumero(double n){
            if(n == 0)  //caso base
         return 1;
          else
           return n *factorialDenumero(n-1);
        
    }
    public Double obtenerFactorial(){
    return this.num1;
    }
}
