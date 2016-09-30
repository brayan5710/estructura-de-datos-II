package sumar;

//import java.util.Scanner;
public class Sumar 
{
//    public static void imprimirHolaMundo()
//    {
//        System.out.println("Hola mundo");
//        imprimirHolaMundo();
//    }
    
    
    //Metodo
    // metodo para realizar factorial recursivo
    public static int factorial (int numero) 
    {
        if (numero==0)
        return 1;
        else
        return numero * factorial(numero-1);
    }
    
    // metodo para realizar suma recursiva 
    public static int SumaRecursiva(int numero){
        if(numero ==0)
            return 0;
        else
            return numero + SumaRecursiva(numero-1);
    }
    
    // metodo para realizar fibonacci recursivo
    public static int fibonacci(int num)
    {
        if(num == 0 || num ==1)
            return 1;
        else
            return fibonacci(num-1)+ fibonacci(num-2);
                   
    }
    public static void main(String[] args) 
    {
        System.out.println(factorial(3));
        System.out.println("");
        System.out.println(SumaRecursiva(4));
        System.out.println("");
        int x =0;
        while(x!=9)
        {
            System.out.println(fibonacci(x));
            x++;
        }
        
//      imprimirHolaMundo();     
    }
    
}