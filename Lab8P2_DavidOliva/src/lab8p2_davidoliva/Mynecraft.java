/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_davidoliva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Mynecraft {
    private Scanner lea=new Scanner(System.in);
    private Scanner leer=new Scanner(System.in);
    int lingotesDeHierro = 0;
    int diamantes = 0;
    int palos = 0;
    ArrayList<Pico> picos = new ArrayList<>();
    ArrayList<String> bloques = new ArrayList<>();
    public void play (){
        int opc=2;
        while (true) {
            System.out.println("0. Salir");
            System.out.println("1. Agregar lingote de hierro");
            System.out.println("2. Agregar diamante");
            System.out.println("3. Agregar palo");
            System.out.println("4. Agregar un pico de hierro");
            System.out.println("5. Agregar un pico de diamante");
            System.out.println("6. Mejorar pico de hierro");
            System.out.println("7. Listar picos");
            System.out.println("8. Agregar bloque");
            System.out.println("9. Romper bloque");
            System.out.println("10. Listar bloques");

            System.out.print("Que desea hacer: ");
            opc = lea.nextInt();

            switch (opc) {
                case 0:
                    System.out.println("Saliendo del juego...");
                    System.exit(0);
                    break;
                case 1:
                    lingotesDeHierro++;
                    System.out.println("Tiene " + lingotesDeHierro + " lingotes de hierro");
                    break;
                case 2:
                    diamantes++;
                    System.out.println("Tiene " + diamantes + " diamantes");
                    break;
                case 3:
                    palos++;
                    System.out.println("Tiene " + palos + " palos");
                    break;
                case 4:
                    agregarPico("hierro");
                    break;
                case 5:
                    agregarPico("diamante");
                    break;
                case 6:
                    mejorarPico();
                    break;
                case 7:
                    listarPicos();
                    break;
                case 8:
                    agregarBloque();
                    break;
                case 9:
                    romperBloque();
                    break;
                case 10:
                    listarBloques();
                    break;
                default:
                    System.out.println("Opción no válida");
            }
    
}
    }
    public void agregarPico(String material) {
        if (material.equals("hierro")) {
            if (palos >= 2 && lingotesDeHierro >= 3) {
                Pico pico = new Pico("hierro");
                picos.add(pico);
            } else if (palos < 2) {
                System.out.println("Tienes insuficiente palos ");
            } else if (lingotesDeHierro < 3) {
                System.out.println("Tienes insuficiente hierro");
            }
        } else if (material.equals("diamante")) {
            if (palos >= 2 && diamantes >= 3) {
                Pico pico = new Pico("diamante");
                picos.add(pico);
            } else if (palos < 2) {
                System.out.println("Tienes insuficiente palos");
            } else if (diamantes < 3) {
                System.out.println("Tienes insuficiente diamantes");
            }
        }
    }

    public void mejorarPico() {
        
    }

    public void listarPicos() {
        
    }

    public void agregarBloque() {
       
    }

    public void romperBloque() {
       
    }

    public void listarBloques() {
        
    }
}
