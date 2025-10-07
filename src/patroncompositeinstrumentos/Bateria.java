/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroncompositeinstrumentos;

/**
 *
 * @author Estudiantes
 */
class Bateria implements Instrumento {
    public void afinar() { System.out.println("Afinando la batería"); }
    public void tocar() { System.out.println("Tocando la batería"); }
    public String getNombre() { return "Batería"; }
}
