/*
Programa Factorial .
Autor: Andres Leonardo Rojas Sandoval
Descripcion: programa que utiliza un do-while para calcular
el factorial de un número entre 1 y 10
*/
package Actividades;

public class Factorial {
    public static void main(String[] args) {
        int limite = 10;
        int num =1;
        int cont = 0;
        do {
            cont +=1;
            num = num*cont;
            System.out.println("El factorial de "+cont+" es "+num);
        } while (cont<limite);
    }
}