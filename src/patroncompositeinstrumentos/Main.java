/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patroncompositeinstrumentos;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Grupos de instrumentos
        InstrumentoCompuesto cuerdas = new InstrumentoCompuesto("Instrumentos de Cuerdas");
        cuerdas.agregar(new Guitarra());
        cuerdas.agregar(new Violin());

        InstrumentoCompuesto percusion = new InstrumentoCompuesto("Instrumentos de Percusión");
        percusion.agregar(new Bateria());
        percusion.agregar(new Tambor());

        InstrumentoCompuesto viento = new InstrumentoCompuesto("Instrumentos de Viento");
        viento.agregar(new Flauta());
        viento.agregar(new Trompeta());

        InstrumentoCompuesto orquesta = new InstrumentoCompuesto("Orquesta");
        orquesta.agregar(cuerdas);
        orquesta.agregar(percusion);
        orquesta.agregar(viento);

        int opcionGrupo, opcionAccion;
        do {
            System.out.println("\n=== Menú de Instrumentos ===");
            System.out.println("1. Cuerdas");
            System.out.println("2. Percusión");
            System.out.println("3. Viento");
            System.out.println("4. Salir");
            System.out.print("Elige un grupo: ");
            opcionGrupo = sc.nextInt();

            if (opcionGrupo >= 1 && opcionGrupo <= 3) {
                InstrumentoCompuesto grupoSeleccionado = null;
                switch (opcionGrupo) {
                    case 1: grupoSeleccionado = cuerdas; break;
                    case 2: grupoSeleccionado = percusion; break;
                    case 3: grupoSeleccionado = viento; break;
                }

                System.out.println("\nSeleccionaste " + grupoSeleccionado.getNombre());
                List<Instrumento> lista = grupoSeleccionado.getInstrumentos();

                for (int i = 0; i < lista.size(); i++) {
                    System.out.println((i+1) + ". " + lista.get(i).getNombre());
                }

                System.out.print("Elige un instrumento: ");
                int instrumentoIdx = sc.nextInt() - 1;

                if (instrumentoIdx >= 0 && instrumentoIdx < lista.size()) {
                    Instrumento instrumento = lista.get(instrumentoIdx);

                    System.out.println("1. Afinar");
                    System.out.println("2. Tocar");
                    System.out.print("Elige acción: ");
                    opcionAccion = sc.nextInt();

                    if (opcionAccion == 1) instrumento.afinar();
                    else if (opcionAccion == 2) instrumento.tocar();
                    else System.out.println("Acción no válida");
                }
            }
        } while (opcionGrupo != 4);

        System.out.println("Saliendo del programa...");
        sc.close();
    }
}
