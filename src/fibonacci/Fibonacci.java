/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Fibonacci {

    /**
     *Muestra la serie de fibonacci hasta un número pedido por teclado
     * @param args
     */
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce hasta que numero quieres que se haga FIBONACCI: ");
        int numeroFinal = teclado.nextInt();
        int num1 = 0;
        int num2 = 1;
        int aux;
        System.out.println(num1);
        System.out.println(num2);
        while(num2+num1 <= numeroFinal){
            aux = num1;
            num1 = num2;
            num2 = num1 + aux;
            System.out.println(num2);
        }

        
    }
    
}
