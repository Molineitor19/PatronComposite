/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroncompositeinstrumentos;

/**
 *
 * @author Estudiantes
 */
class Violin implements Instrumento {
    public void afinar() { System.out.println("Afinando el violín"); }
    public void tocar() { System.out.println("Tocando el violín"); }
    public String getNombre() { return "Violín"; }
}