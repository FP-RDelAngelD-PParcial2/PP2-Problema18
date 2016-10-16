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
    
}
