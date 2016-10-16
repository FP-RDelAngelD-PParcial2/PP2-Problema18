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
        int numeromenor, d, divisor; //Declaracion de variables
        d=1; //Debe ser 1 ya que si es 0 se elimina el divisor
        divisor=2; //Comienza en 2 ya que es lo minimo en lo que se pueden dividir (media)
        if(a>b){ //Se necesita conocer el numero menor para saber en cuanto se puede dividir //2>8
            numeromenor=b; //Si a es mayor que b, b es el numero menor //FALSO
        }else{
            numeromenor=a; //Sino el numero menor es a //numeromenor=8
        }
        while(numeromenor>=divisor){ //Mientras que el numero menor sea mayor o igual al divisor, //8>=2 VERDADERO
            if(a%divisor==0 && b%divisor==0 && c%divisor==0){ //Si el residuo de la division de a entre el divisor es 0 //2%2==0 && 8%2==0
                                              //y si el residuo de la division de b entre el divisor es 0 //VERDADERO && VERDADERO = VERDADERO
                a=a/divisor; //a sera igual a la division de a entre el divisor //a=2/2 a=1
                b=b/divisor;//b sera igual a la division de a entre el divisor  //b=8/2 b=4
                c=c/divisor;
                d=d*divisor;//c sera igual a la multiplicacion de c por le divisor //c=1*2 c=2
            }else{ //Sino se cumple el if a divisor se le sumara 1
                divisor++;
            }
        }
        //Se imprime el maximo comun denominador //c=2
        System.out.print("El maximo comun denominador es: " + c);
    }
    
}
