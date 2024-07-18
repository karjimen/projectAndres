/*
Programa Numeros primos.
Autor: Andres Leonardo Rojas Sandoval
Descripcion: programa que utiliza un ciclo for indexado que imprime los
primeros 20 números primos
*/
package Actividades;

public class NumerosPrimos {
    public static void main(String[] args) {

        int limite = 20;
        int numero = 2;
        int flag = 0;
        int cantidad = 0;

        System.out.println("Los primeros 20 numeros primos son: ");

        while(cantidad < limite){
            for(int y = 2;y<numero;y++){
                if(numero % y == 0){
                    flag = 1;
                }
            }
            if(flag == 0){
                System.out.print(numero+" ");
                cantidad+=1;
            }
            numero =numero+1;
            flag = 0;
        }
    }
}