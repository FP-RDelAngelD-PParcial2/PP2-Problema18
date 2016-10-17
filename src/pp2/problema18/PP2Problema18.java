/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema18;
import java.util.*;
/**
 *
 * @author PC
 */
public class PP2Problema18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, n3;
        n1=verificarNumero("numero 1 ");
        n2=verificarNumero("numero 2 ");
        n3=verificarNumero("numero 3 ");
        minimoComunD(n1, n2, n3);
    }
     public static int solicitarDatos(String d){ //Solicita datos
        int miDato;
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.print("Introduce el dato " + d);
        miDato= entradaEscaner.nextInt();
        return miDato;
    }
    public static int verificarNumero(String d){
        int a; //Variable
        do{ //Hacer que solicite datos y se guarden en a 
        a = solicitarDatos(d);
        }while(a<=0);//Mientras que a sea menor o igual que 0
        return a; //Regresa el valor de a
    }
    public static void minimoComunD(int a, int b, int c){
        int numeromaximo, d, divisor; //Declaracion de variables
        d=1; //Debe ser 1 ya que si es 0 se elimina el divisor
        divisor=2; //Comienza en 2 ya que es lo minimo en lo que se pueden dividir (media)
        //a=4, b=6, c=2
        if(b<a && c<a){ //Se necesita conocer el numero mayor //6<4 && 2<4
            numeromaximo=a; //Si b es menor que a, y c es menor que a, a es el numero mayor //FALSO
        }else if(a<b && c<b){//Si a es menor que b, y c es menor que b, b es el numero mayor 
            numeromaximo=b; //4<6 && 2<6 //VERDADERO
        }else{
            numeromaximo=c;//Sino el numero maximo es c 
        }
        while(numeromaximo>=divisor){ //Mientras que el numero mayor sea mayor o igual al divisor, //6>=2 VERDADERO
            if(a%divisor==0 || b%divisor==0 || c%divisor==0){ //Si el residuo de la division de a entre el divisor es igual a 0 o //4%2==0 VERDADERO
                                                              //el residuo de la division de b entre el divisor es igual a 0 o //6%2==0 VERDADERO
                                                              //el residuo de la division de c entre el divisor es igual a 0 o //2%2==0 VERDADERO
                                                              //La condicion sera verdadera y //VERDADERO
                d=d*divisor; //se multiplicara el valor de d por el divisor //d=1*2 d=2
                if(a%divisor==0){ //Si el residuo de la division de a entre el divisor es igual a 0 //4%2==0 VERDADERO
                    a=a/divisor;//a sera igual a la division de a entre el divisor //a=4/2 a=2
                }
                if(b%divisor==0){ //Si el residuo de la division de b entre el divisor es igual a 0 //6%2==0 VERDADERO
                    b=b/divisor;//b sera igual a la division de b entre el divisor //b=6/2 b=3
                }
                if(c%divisor==0){//Si el residuo de la division de c entre el divisor es igual a 0 //2%2==0 VERDADERO
                    c=c/divisor;//c sera igual a la division de c entre el divisor //c=2/2 c=1
                }
            }else{ //Sino se cumple el if a divisor se le sumara 1
                divisor++;
            }
        }
        //Se imprime el minimo comun multiplo //d=12
        System.out.print("El minimo comun multiplo es: " + d);
    }
    
}
