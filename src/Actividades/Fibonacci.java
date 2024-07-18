/*
Programa Secuencia Fibonacci.
Autor: Andres Leonardo Rojas Sandoval
Descripcion: programa que imprime los números Fibonacci menores que 100, utilizando un ciclo while.
*/
package Actividades;

public class Fibonacci {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 1;
        int aux;
        int limite = 100;

        System.out.println("La secuencia de Fibonacci con los numeros menores a 100: ");

        while(numero1 < limite){
            System.out.print(numero1+ " ");
            aux = numero1 + numero2;
            numero1 = numero2;
            numero2= aux;
        }
    }
}