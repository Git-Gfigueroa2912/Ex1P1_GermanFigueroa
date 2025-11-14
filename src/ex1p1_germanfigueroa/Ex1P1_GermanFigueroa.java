/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1p1_germanfigueroa;

import java.util.Scanner;

/**
 *
 * @author gafm2
 */
public class Ex1P1_GermanFigueroa {
    public static Scanner entrada = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        do {
            
            System.out.println("BIENVENIDO AL MENU");
            System.out.println("1. Reemplazo de Palabras");
            System.out.println("2. Vecinos");
            System.out.println("3. Triforce");
            System.out.println("4. Bono");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
             

        } while (opcion != 0);
    }
    
    public static String WordReplace(){
        System.out.println("Ingrese la cadena: ");
        String cadena = entrada.next();
        System.out.println("Ingrese la palabra a buscar: ");
        String palabra = entrada.next();
        System.out.println("Ingrese la palabra a reemplazar: ");

        for (int i = 0; i < cadena.length() - 1; i ++) {
            char caracter = cadena.charAt(i);
            char nuevoCaracter = cadena.charAt(i);
            char acumuladorCadena = cadena.charAt(i);
        }
        return "";
    }
    public static String Vecinos(){
        System.out.println("Ingresen una cadena: ");
        String cadena = entrada.next();
        
        int n = entrada.nextInt();
        System.out.println("Numero generado: " +n);
    }
    public static void Triforce(){
        System.out.println("Ingreso un tamaño impar: ");
        int numero = entrada.nextInt();
        int asteriscos = 0;
        int espacios = (numero/2);
        for(int j = 0; j <= numero; j += 1 ){
            for(int k = 0; k = espacios; k += 1){
                System.out.println(" ");
            }
        }
    }
        
    public static boolean isAnagram(String cadena1, String cadena2){
        boolean anagramas = false;
        int contador = 1;
        int suma1 = 0;
        int suma2 = 0;
        if(cadena1.length() == cadena2.length()){
            for(int i = 0; i <= cadena1.length() -i; i += 1){
                
            }
        }
        return true;
    }
    



