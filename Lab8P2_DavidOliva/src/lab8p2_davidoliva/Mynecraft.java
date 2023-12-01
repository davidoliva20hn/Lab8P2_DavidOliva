/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_davidoliva;

import java.util.Scanner;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Mynecraft {
    Pico pico=new Pico();
    private Scanner lea=new Scanner(System.in);
    private Scanner leer=new Scanner(System.in);
    public void play (){
        int opc=2;
        do{
        System.out.println("0. salir");
        System.out.println("1. Agregar lingote de hierro");
        System.out.println("2. Agregar diamante");
        System.out.println("3. Agregar palo");
        System.out.println("4. Agregar un pico de hierro");
        System.out.println("5. Agregar un pico de diamante");
        System.out.println("6. Mejorar pico de hierro");
        System.out.println("7. Listar picos");
        System.out.println("8. Agregar bloque");
        System.out.println("9. Romper bloque");
        System.out.println("10. Lislar bloques");
        System.out.print("Que desea hacer:");
        opc=lea.nextInt();
            switch (opc) {
                case 1 -> {
                }
                case 2->{
                    
                }
                case 3->{
                    
                }
                case 4->{
                    
                }
                case 5->{
                    
                }
                case 6->{
                    
                }
                case 7->{
                    
                }
                case 8->{
                    
                }
                case 9->{
                    
                }
                case 10->{
                    
                }
            }
        }while (opc!=0);
    }
    
}
