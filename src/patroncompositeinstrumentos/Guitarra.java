/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroncompositeinstrumentos;

/**
 *
 * @author Estudiantes
 */
class Guitarra implements Instrumento {
    public void afinar() { System.out.println("Afinando la guitarra"); }
    public void tocar() { System.out.println("Tocando la guitarra"); }
    public String getNombre() { return "Guitarra"; }
}
