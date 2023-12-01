/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_davidoliva;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Pico {
    String material;
    int vida;
    float tiempoEnRomper;

    public Pico(String material) {
        this.material = material.toLowerCase();
        if (material.equals("diamante")){
            vida=14;
            
        }else if (material.equals("hierro")){
            vida=8;
        }
        this.tiempoEnRomper = 0.0f;
    }

}  
