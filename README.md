# Proyecto de Instrumentos con Patrón Composite

## Descripción general

Este proyecto implementa el **patrón de diseño Composite** en Java, con el objetivo de representar una jerarquía de **instrumentos musicales** organizados por tipo:  
- Instrumentos de **Cuerdas**  
- Instrumentos de **Percusión**  
- Instrumentos de **Viento (Aire)**  

Cada grupo contiene dos instrumentos, y cada instrumento tiene las acciones **afinar** y **tocar**.  
El programa permite al usuario interactuar a través de un **menú por consola**, seleccionando el grupo y la acción a realizar.

---

## Patrón de diseño utilizado: Composite

El **patrón Composite** permite tratar objetos individuales y composiciones de objetos de manera uniforme.  
En este caso:
- La interfaz `Instrumento` define las operaciones comunes (`afinar`, `tocar` y `getNombre`).
- La clase `InstrumentoCompuesto` actúa como **Composite**, agrupando instrumentos simples o incluso otros grupos de instrumentos.
- Las clases concretas (`Guitarra`, `Violin`, `Bateria`, `Tambor`, `Flauta`, `Trompeta`) son las **Hojas** del patrón.

Este patrón facilita ejecutar operaciones de forma jerárquica, ya sea sobre un instrumento individual o sobre un grupo completo.

---

## Lenguaje y entorno de desarrollo

- **Lenguaje:** Java  
- **Entorno:** NetBeans IDE 25  
- **Ejecución:** Programa de consola

---

## Desarrollo asistido con IA

El proyecto fue creado utilizando **inteligencia artificial (IA)** como asistente de desarrollo, a través de una serie de prompts diseñados para generar el código base, el diagrama UML y el README.

El **prompt inicial** utilizado para generar el proyecto fue el siguiente:

> “hola chat, tengo que realizar un proyecto en java el cual use el patron composite, el proyecto se basa en instrumentos, voy a tener los instrumentos divididos en varios tipos, van a ser 3 grupos, de percusión, de aire y de cuerdas, cada grupo va a tener 2 instrumentos en total, y serán 2 acciones por cada instrumento, afinar y tocar (no importa que el instrumento no se pueda afinar directamente, igual va a tener esa acción) vas a lanzar la respuesta por consola, con un menu, en donde yo elija que grupo de instrumento quiero y que deseo hacer con el instrumento, si afinarlo o tocarlo, adicionalmente necesito el diagrama UML del proyecto, en codigo de plant UML”

---

## Estructura del proyecto

```
src/
│
├── Instrumento.java
├── InstrumentoCompuesto.java
├── Guitarra.java
├── Violin.java
├── Bateria.java
├── Tambor.java
├── Flauta.java
├── Trompeta.java
└── Main.java
```

---

## Ejemplo de uso

```
=== Menú de Instrumentos ===
1. Cuerdas
2. Percusión
3. Viento
4. Salir
Elige un grupo: 1

Seleccionaste Instrumentos de Cuerdas
1. Guitarra
2. Violín
Elige un instrumento: 1
1. Afinar
2. Tocar
Elige acción: 2
Tocando la guitarra
```

---

## Integrantes

**Kaleth Molina - 20232020096**  
**Nelson Molina - 20222020121**

