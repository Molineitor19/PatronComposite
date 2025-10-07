/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroncompositeinstrumentos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiantes
 */
class InstrumentoCompuesto implements Instrumento {
    private String nombre;
    private List<Instrumento> instrumentos = new ArrayList<>();

    public InstrumentoCompuesto(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(Instrumento instrumento) {
        instrumentos.add(instrumento);
    }

    @Override
    public void afinar() {
        System.out.println("Afinando todos los instrumentos de " + nombre);
        for (Instrumento i : instrumentos) {
            i.afinar();
        }
    }

    @Override
    public void tocar() {
        System.out.println("Tocando todos los instrumentos de " + nombre);
        for (Instrumento i : instrumentos) {
            i.tocar();
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }
}
