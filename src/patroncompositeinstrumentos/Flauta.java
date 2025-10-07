/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroncompositeinstrumentos;

/**
 *
 * @author Estudiantes
 */
class Flauta implements Instrumento {
    public void afinar() { System.out.println("Afinando la flauta"); }
    public void tocar() { System.out.println("Tocando la flauta"); }
    public String getNombre() { return "Flauta"; }
}
