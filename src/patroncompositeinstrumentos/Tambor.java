/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroncompositeinstrumentos;

/**
 *
 * @author Estudiantes
 */
class Tambor implements Instrumento {
    public void afinar() { System.out.println("Afinando el tambor"); }
    public void tocar() { System.out.println("Tocando el tambor"); }
    public String getNombre() { return "Tambor"; }
}
